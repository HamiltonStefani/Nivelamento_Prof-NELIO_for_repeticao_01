package exerciciofor01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner hs = new Scanner(System.in);
		
		int N = hs.nextInt();
		int soma = 0;
		
		for(int i=0; i<N; i++) {
			int x = hs.nextInt();
			soma = soma + x;
		}
			System.out.println(soma);
		
		hs.close();

	}

}
