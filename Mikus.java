package mikus;

import java.util.Scanner;

public class Mikus {

public static void main(String[] args) throws Exception {
	Scanner scanner = new Scanner(System.in);

    System.out.print("Napis cislo od 1 do 3: ");

    int volba = scanner.nextInt();

    String Vypis;
    scanner.close();
    switch (volba) {
        case 1:
            Vypis = "Zadal si jednotku";
            break;
        case 2:
            Vypis = "Zadal si dvojku";
            break;
        case 3:
            Vypis = "Zadal si trojku";
            break;

        default:
            Vypis = "Nebud tĺk";
            break;
    }

    System.out.println("Zadal si " + Vypis);
}}