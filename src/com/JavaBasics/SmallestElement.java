package com.JavaBasics;

public class SmallestElement {

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
	 
	
	
	 int smallest = arr[0]; 
	 
	 for(int i=1; i< arr.length; i++) 
	 { 
	   if(arr[i] < smallest) 
	    smallest = arr[i]; 
	 } 
	 System.out.println("Smallest Number is : " + smallest); 
	 
	 }
}
