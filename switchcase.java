package opakovanie;

import java.util.Random;
import java.util.Iterator;

public class switchcase {

public static void main(String[] args) {
Random rd= new Random();
for (int i=0; i< 1000; i++) {
}
	
int cl=0;
int c2=0;
int c3=0;
int c4=0;
int c5=0;
int c6=0;
int randomNumber;

for (int i = 0; i < 1000; i++) {
	randomNumber= rd.nextInt();
	switch (randomNumber) {
	case 1:
		cl++;
		break;
		
		default:
		break;
}
}
