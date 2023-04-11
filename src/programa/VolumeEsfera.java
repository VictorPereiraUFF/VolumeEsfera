package programa;

import java.util.Scanner;

public class VolumeEsfera {

	public static void main(String[] args) {
		double pi = 3.14159;
		double raio;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o raio da esfera?");
		raio = sc.nextDouble();

		double volume = (4 * pi * raio * raio * raio) / 3;
		
		System.out.printf("O volume da esfera é de %f", + volume);
		
		sc.close();
	}

}
