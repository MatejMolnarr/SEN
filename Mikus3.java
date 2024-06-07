package mikus;

import java.util.Scanner;

public class Mikus3 {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		      
		        System.out.print("Zadajte cenu auta bez DPH: ");
		        double cenaBezDPH = scanner.nextDouble();

		        System.out.print("Zadajte hodnotu DPH v percentách: ");
		        double dphPercenta = scanner.nextDouble();

		        
		        double cenaSDPH = cenaBezDPH * (1 + dphPercenta / 100);

		        
		        System.out.println("Cena auta s DPH je: " + cenaSDPH);
		    }
		


	}


