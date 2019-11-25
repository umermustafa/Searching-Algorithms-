package com.packages.SearchAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class JumpSearch {
	public static int jump(int[] arr,int key)
	{
		int size=arr.length;
		int jumpsize=(int) Math.sqrt(arr.length);
		int start=0;
		int end=jumpsize-1;
		boolean numberFound = false;
		while(!numberFound && start<size)
		{
			// If end number is larger or equal to search number --> inside the block
			if (arr[end] >= key) {
				// Perform linear search
				for(int i=start;i<=end;i++)
				{
					if(arr[i]==key)
					{
						return i;
					}
				}
				return -1;
			}
			// If end number is smaller than search number --> increase start and end
			else if (arr[end] < key) 
			{
				start += jumpsize;
				end += jumpsize;
				
				if (end >= size) 
				{
					end = size - 1;
				}
			}
			
		}
			
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100);
		}
		Arrays.sort(arr);
		for(int element :arr)
		{
			//element=(int)(Math.random()*100);
			System.out.print(element+" ");
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int result=jump(arr,n);
		if(result==-1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at index "+result);
	}

}
