package br.com.senai;

public class LacoDeRepeticao {
 public static void main(String[] args) {
	
	 int valor = 0;
	 
	 System.out.println("valor inicial: " + valor);
	 
	 do {
	 System.out.println("=->" +valor);	
	 valor++;
	 } while(valor <= 10);
	 
	 System.out.println("valor final: " + valor);
	 }
}

