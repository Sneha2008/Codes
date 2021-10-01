package com.hcl;

import java.util.Scanner;

public class OfferDemo {
	public static void main(String args[]) {
		
		float cop1,cop2,cop3,total,offer1,offer2,pay1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("cost of product1: ");
		cop1=sc.nextFloat();
		
		System.out.println("cost of product2: ");
		cop2=sc.nextFloat();
		
		System.out.println("cost of product3: ");
		cop3=sc.nextFloat();
		
		System.out.println("Total value: ");
		total=cop1+cop2+cop3;
		
		offer1=(float) (total* 0.2);
				
		System.out.println("offer1:");
		printf("%.0.2f",offer1);
		
		pay1=total-offer1;
		System.out.println("have to pay by offer1:"+pay1);
		
		if(cop1<cop2 && cop1<cop3) {
			total=cop2+cop3;
			System.out.println("have to pay"+total);
		
		}
		if(cop2<cop1 && cop2<cop3) {
			total=cop1+cop3;
			System.out.println("have to pay"+total);
		}
		if(cop3<cop1 && cop3<cop2) {
			total=cop1+cop2;
			System.out.println("have to pay"+total);
		}
		
	}

}
