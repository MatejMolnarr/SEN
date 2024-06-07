package palindrom;

import java.util.Scanner;


public class Help {
	private Scanner sc = new Scanner(System.in);
	String reverzSlovo="";

	// toto je hlavna funkcia, ktoru si volame z Main
	public void zistiPalindrom() {
		String original = ziskajSlovo();
		String otoceneSlovo= otocSlovo(original);
		
		if(original.equals(otoceneSlovo)) {
			System.out.println("Slovo: " + original + " je palindrom");
		}else {
			System.out.println("Slovo: " + original + " Nie je palindrom");
		}
		
	}

	//ziska slovo a vrati jeho hodnotu
	private String ziskajSlovo() {
		System.out.println("Zadaj slovo");
		return sc.nextLine().toLowerCase(); // .toLowerCase() prepíše písmena na male
	}
	
	// v cykle nam cita slovo po znaku a ukladá ho do pemennej z ktorej vznikne
	//slovo, ale bude otocene oproti originalu
	private String otocSlovo(String slovo) {
		for (int i = slovo.length()-1; i >= 0; i--) {
			reverzSlovo += slovo.charAt(i);
		}
		return reverzSlovo;
	}
}
