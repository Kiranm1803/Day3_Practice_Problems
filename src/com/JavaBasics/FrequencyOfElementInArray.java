package com.JavaBasics;

public class FrequencyOfElementInArray {

	public static void main(String[] args) {
		
		int[] num=new int[8];
		
		num[0]=2;
		num[1]=1;
		num[2]=3;
		num[3]=1;
		num[4]=2;
		num[5]=3;
		num[6]=4;
		num[7]=0;
		
		System.out.println("Frequency Of elements in an given array : ");
		
		int [] frequency = new int [num.length];
		
	    int counted = -1;
	    
	    for(int i = 0; i < num.length; i++)
	    {
	      int count = 1;
	      
	      for(int j = i+1; j < num.length; j++)
	      {
	        if(num[i] == num[j])
	        {
	          count++;
	          //To avoid counting the frequency of same element again
	          frequency[j] = counted;
	        }
	      }
	      if(frequency[i] != counted)
	        frequency[i] = count;
	    }

	    
	    for(int i = 0; i < frequency.length; i++)
	    {
	      if(frequency[i] != counted)
	        System.out.println("Element: "+num[i]+"  " + " Frequency: " + frequency[i]);
	    }
	  }
		
}

