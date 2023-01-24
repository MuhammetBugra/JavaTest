package helloworld;

import java.util.Random;

public class dizimin {
	public static void main(String[]args) {
		int[] dizi=new int[5];
		Random r=new Random();
		for(int i=0;i<dizi.length;i++) {
			dizi[i]=r.nextInt(100)+1;
			System.out.print(dizi[i]+" "); }
		int min=dizi[0],max=dizi[0];
		for(int i=1;i<dizi.length;i++) {
			if(dizi[i]>max)
				max=dizi[i];
			if(dizi[i]<min)
				min=dizi[i]; }
		System.out.println("\nmin: "+min+"\nmax: "+max); } }
