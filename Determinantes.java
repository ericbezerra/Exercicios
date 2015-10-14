import java.util.Scanner;

public class Determinantes {
	
	public static double determinante(double [][]matriz){
		double diagonalP, diagonalS, det;
		diagonalP = matriz[0][0] * matriz[1][1] * matriz[2][2];
		diagonalP = diagonalP + matriz[0][1] * matriz[1][2] * matriz[2][0];
		diagonalP = diagonalP + matriz[1][0] * matriz[2][1] * matriz[0][2];

		diagonalS = matriz[0][2] * matriz[1][1] * matriz[2][0];
		diagonalS = diagonalS + matriz[2][1] * matriz[1][2] * matriz[0][0];
		diagonalS = diagonalS + matriz[1][0] * matriz[0][1] * matriz[2][2];
		
		det = diagonalP - diagonalS;
		
		return det;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[][] matriz = { { 0, 0, 0 }, 
							  { 0, 0, 0 }, 
							  { 0, 0, 0 } };
		System.out.println("Matriz\n");
		for (int k = 0; k < matriz.length; k++) {
			for (int l = 0; l < matriz.length; l++) {
				System.out.print(matriz[k][l] + " ");
			}
			System.out.println(" ");
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Digite o valor na colula " + (i + 1) + " e linha" + (j + 1));
				matriz[i][j] = sc.nextDouble();
				System.out.println(" ");
				for (int k = 0; k < matriz.length; k++) {
					for (int l = 0; l < matriz.length; l++) {
						System.out.print(matriz[k][l] + " ");
					}
					System.out.println(" ");
				}
				System.out.println(" ");
			}
		}


		
		System.out.println("Determinante: " + determinante(matriz));
		sc.close();

	}

}
