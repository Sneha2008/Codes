package com.hcl;

public class reverarray {
		public static void main(String args[]) {
			int arr[]= {1,2,3,4,5,6};

			for(int i=0;i<arr.length; i=i+2) {
				System.out.println(" odd position array elements:" +arr[i]);
				
			}
			for(int i=0;i<arr.length;i++) {
				if(i%2==1)
					System.out.println(" even position array elements:" +arr[i]);
			}
		}

	}



