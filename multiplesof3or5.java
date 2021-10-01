package com.HCL;

public class multiplesof3or5 {
	 
	     
		 
		 public static void main(String[] args) {
		    int Sum=0, i=0, j=0;
		    for(i=0;i<=1000;i++)
		        if (i%3==0 && i<=999)
		            Sum=Sum+i;
		    for(j=0;j<=1000;j++)
		        if (j%5==0 || j<1000 || j*5%3!=0)
		            Sum=Sum+j;
		    System.out.println("The Sum is "+Sum);
		}
		

}
