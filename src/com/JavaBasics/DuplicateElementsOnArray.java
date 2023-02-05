package com.JavaBasics;

public class DuplicateElementsOnArray {


	 public static void main(String[] args) {      
         
	          
	        int [] arr = new int [10];
	        
	        arr[0]=1;
	        arr[1]=2;
	        arr[2]=1;
	        arr[3]=3;
	        arr[4]=4;
	        arr[5]=5;
	        arr[6]=3;
	        arr[7]=4;
	        arr[8]=2;
	        arr[9]=8;
	           
	          
	        System.out.println("Duplicate elements in an array: ");  
	        
	        for(int i = 0; i < arr.length; i++)
	        {  
	            for(int j = i + 1; j < arr.length; j++) 
	            {  
	                if(arr[i] == arr[j]) 
	                {
	                    System.out.println(arr[j]);  
	                }
	            }  
	        }  
	    }  
}
