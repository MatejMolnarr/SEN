package opakovanie;

import java.util.Scanner;

public class Podmienky2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double money;
		int people;
		boolean rusko;
		
		System.out.println("Kolko penazi mas u seba");
		money = sc.nextDouble();
		
		System.out.println("Kolko kamaratov ide dnes s tebou");
		people = sc.nextInt();
	
		
		System.out.println("Mas rusko? true/false");
		rusko = sc.nextBoolean();
		
		if((money>= 20) && (people >0) && (rusko ==true)) {
			System.out.println("Hura idem von");
		}else {
			System.out.println("Dnes ostavam doma");
			
		}
				


		

	}

}
