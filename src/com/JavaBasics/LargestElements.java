package com.JavaBasics;

public class LargestElements {
 

	public static void main(String[] args) {
		
		
		 int arr[] = new int[10];
		 
		 arr[0]=100;
		 arr[1]=200;
		 arr[2]=300;
		 arr[3]=400;
		 arr[4]=500;
		 arr[5]=600;
		 arr[6]=700;
		 arr[7]=800;
		 arr[8]=900;
		 arr[9]=1000;
		 
		
		
		 int largest = arr[0]; 
		 
		 for(int i=1; i< arr.length; i++) 
		 { 
		   if(arr[i] > largest) 
		    largest = arr[i]; 
		 } 
		 System.out.println("Largest Number is : " + largest); 
		 
		 }
	}

