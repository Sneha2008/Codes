package com.HCL;

public class SumSquareDifference {
	public static void main(String args[]) {
		int num1=1,sqr=0,sumsqaure=0,sumsquare1=0,diff=0,sum=0;
		
		
		
		
		for( num1=1;num1<100;num1++) {
			sqr=num1*num1;
			sumsqaure=sqr+sumsqaure;
		}
		
		System.out.println("square:"+sumsqaure);
		
		for(num1=1;num1<100;num1++) {
			sum=num1+sum;
			sumsquare1=sum*sum;
			
			
		}
		System.out.println("sum of sqaure:"+sumsquare1);
		
		
		diff=sumsquare1-sumsqaure;
		
		System.out.println("Difference " +diff);
	}

}
