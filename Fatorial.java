import java.util.Scanner;
public class Fatorial {

	public static int fatorial(int x){
		if(x == 1){
			return x;
		}else{
			return x*fatorial(x-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Calculo fatorial");
		System.out.println("Digite o valor a ser calculado: ");
		x = sc.nextInt();
		System.out.println("Fatorial de "+x+" é: "+fatorial(x));
		sc.close();
	}

}
