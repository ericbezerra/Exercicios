import java.util.Scanner;

public class IndicePluviometrico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dias = 31, atual = 0;
		double max = 0, media = 0, pico = 0;
		double indicePluviometrico[] = new double[dias];

		for (int i = 0; i < indicePluviometrico.length; i++) {
			System.out.println("Digite o valor do indice pluviométrico do dia " + (atual + 1));
			indicePluviometrico[atual] = sc.nextDouble();
			if(indicePluviometrico[atual] > max){
				max = indicePluviometrico[atual];
				pico = atual+1;
			}
			atual++;
		}

		for (int i = 0; i < indicePluviometrico.length; i++) {
			media += indicePluviometrico[i];
		}
		media = media / dias;

		System.out.println("O indice pluviometrico medio eh: " + media + "\n O pico foi no dia: " + pico);
		sc.close();
	}

}
