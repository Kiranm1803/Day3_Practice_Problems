package com.JavaBasics;

public class ArrayElementsInReverseOrder {

	public static void main(String[] args) {        
	          
		            
		        int [] arr = new int [5]; //array declaration
		        
		        arr[0]=5;
		        arr[1]=2;
		        arr[2]=8;
		        arr[3]=7;
		        arr[4]=1;          //array initialization
		        
		        int temp = 0;    
		            
		       
		        System.out.println("Elements of original array: ");   
		        
		        for (int i = 0; i < arr.length; i++) 
		        {     
		            System.out.print(arr[i] + "  ");    
		        }    
		            
		           
		        for (int i = 0; i < arr.length; i++) 
		        {     
		            for (int j = i+1; j < arr.length; j++) 
		            {     
		               if(arr[i] > arr[j]) 
		               {    
		                   temp = arr[i];    
		                   arr[i] = arr[j];    
		                   arr[j] = temp;    
		               }     
		            }     
		        }    
		          
		        System.out.println();    
		            
		        
		        System.out.println("Elements of array sorted in ascending order: "); 
		        
		        for (int i = 0; i < arr.length; i++)
		        {     
		            System.out.print(arr[i] + "  ");    
		        }    
		    }    
	}    

