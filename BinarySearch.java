package com.packages.SearchAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static int binary(int[] arr,int key)
	{
		int midIndex;
		int startIndex=0;
		int endIndex=arr.length-1;
		while(startIndex<=endIndex)
		{
			midIndex=startIndex+(endIndex-startIndex)/2;
			if(arr[midIndex]==key)
				return midIndex;
			if(arr[midIndex]<key)
				startIndex=midIndex+1;
			else
				endIndex=midIndex-1;
		}
		return -1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100);
		}Arrays.sort(arr);
		for(int element :arr)
		{
			//element=(int)(Math.random()*100);
			System.out.print(element+" ");
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int result=binary(arr,n);
		if(result==-1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at index "+result);
		
	}

}
