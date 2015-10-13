public class MaiorOuMenor{
	public static void main(String a[]){
		double R, S, T;
		R = Double.parseDouble(a[0]);
		S = Double.parseDouble(a[1]);
		T = Double.parseDouble(a[2]);

		if((R > T)&&(R > S)){
			System.out.println(R+" eh maior. Primeiro");
		}if((S > T)&&(S > R)){
			System.out.println(S+" eh maior. Segundo");
		}if((T > S)&&(T > R)){
			System.out.println(T+" eh maior. Terceiro");
		}
	}
}
