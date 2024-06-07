package opakovanie;

import java.util.Scanner;

public class Podmienky {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean logicVariable;
		
		System.out.println("Povedz aky je den true/false");
		logicVariable= sc.nextBoolean();
		
		if (logicVariable) {
			System.out.println("Dnes je pekny den");
		}else {
			System.out.println("Dnes je vonku hnuse");
		}
			 
		

	}

}
