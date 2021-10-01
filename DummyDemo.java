package com.hcl;
import java.util.*;

public class DummyDemo {
	public static void main(String args[]) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter billno:");
		int billno=sc.nextInt();
		
		System.out.println("Enter date:");
		int date=sc.nextInt();
		
		if(billno%100==date || billno%10==date &&  billno%date==0) {
			System.out.println("Yor r lucky customer");
		}
		else {
			System.out.println("Sorry");
		}
	}

}
