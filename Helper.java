package mikus;

import java.util.Scanner;

public class Helper {
	Scanner sc = new Scanner(System.in);
	
	public double osetriCislo(double cisloVstup) {
		if(cisloVstup <= 0) {
			System.out.println("Zadaj cislo vacsie ako 0");
			cisloVstup= osetriCislo(sc.nextDouble());
			
		}
	return cisloVstup;
	}
	public String ziskajMenoObjednavky() {
		System.out.println("Ziskaj meno objednavky");
		return sc.nextLine();
	}
public int ziskajPocetKnih() {
	System.out.println("Zadaj pocet knih v objednavke");
	return (int) osetriCislo(sc.nextInt());
	}
public double zistiCenuKnihy() {
System.out.println("Zadaj cenu jednej knihy");
return osetriCislo(sc.nextDouble());
}
public double vypocitajCenuDPH(double cenaKnihy) {
	return cenaKnihy+ (cenaKnihy*0.2);
}
}
