package mikus;

import java.util.Scanner;

public class Int {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Zadaj prvé číslo:");
		int a = scanner.nextInt();
		
		System.out.println("Zadaj druhé číslo");
		int b = scanner.nextInt();	
		
		rozhodni(a,b);
		
		}
	public static void rozhodni (int a, int b) {
		if (a<b) {
			System.out.println(a+ "je menšie ako"+ b);
		}else if (a>b) {
				System.out.println(a+ "je väčšie ako"+ b);
		}else {
			System.out.println(a+"je rovnaké ako" + b);
				
			}
			
		}
	}


