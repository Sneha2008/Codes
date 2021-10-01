package com.hcl;
import java.io.*;
import java.lang.*;
public class minmax {
	public static void main(String args[]) {
		int num1=10,num2=20,result=0,result1=0;
		minmax obj=new minmax();
		result=obj.min(num1,num2);
		System.out.println(result);
		result1=obj.max(num1,num2);
		System.out.println(result1);
		
	}
   public static int min(int num1,int num2) {
	   if(num1>num2) {
		System.out.println("Number2 is Minimum"+num2);   
	   }
	   else {
		   System.out.println("Number1 is Minimum"+num2);
	   }
	   
	   public static int max(int num1,int num2) {
		   if(num1>num2) {
			System.out.println("Number1 is maximum"+num1);   
		   }
		   else {
			   System.out.println("Number1 is maximum"+num2);
		   }


}
