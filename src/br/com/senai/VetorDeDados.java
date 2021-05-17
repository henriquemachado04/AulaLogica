package br.com.senai;

import java.util.Scanner;

public class VetorDeDados {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		int idade[] = { 5, 18, 20, 22, 3, 4, 6, 32 };

		for (int i = 0; i < idade.length; i++) {
			System.out.println(idade[i]);
		}

		String addNovo = "s";
		do {
			System.out.println("Informe o Index do vetor: ");
			for (int i = 0; i < idade.length; i++) {
				System.out.println(i + " | ");
			}
			int index = tec.nextInt();

			System.out.println("Informe a idade");
			idade[index] = tec.nextInt();

			System.out.println("Deseja informar uma nova idade? [s/n]");
			addNovo = tec.next();
		} while (addNovo.equals("s"));

		int auxiliar;
		for (int i = 0; i < idade.length - 1; i++) {
			for (int j = i + 1; j < idade.length; j++) {
				if (idade[i] < idade[j]) {
					auxiliar = idade[i];
					idade[i] = idade[j];
					idade[j] = auxiliar;

				}

			}
		}

			for (int i = 0; i < idade.length - 1; i++) {
				System.out.println(" -> " + idade[i]);
			}
		}
	}

