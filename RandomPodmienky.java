package opakovanie;

import java.util.Random;
import java.util.Scanner;

public class RandomPodmienky {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Random rd = new Random ();
	
	int randomNumber;
	for (int i = 0; i < 100; i++) {
		randomNumber= rd.nextInt(100);
		System.out.println(randomNumber);
	}


	

	}

}
