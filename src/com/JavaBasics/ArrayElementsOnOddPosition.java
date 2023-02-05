package com.JavaBasics;

public class ArrayElementsOnOddPosition {

	public static void main(String[] args) {
		
		int[] array=new int[8];
		
		array[0]=8;
		array[1]=7;
		array[2]=6;
		array[3]=5;
		array[4]=4;
		array[5]=3;
		array[6]=2;
		array[7]=1;
		
		System.out.println("Array elements at odd position: ");
		
		for(int i=1;i<array.length;i=i+2)
		{
			System.out.print(array[i]+ "  ");
		}
	}
}

