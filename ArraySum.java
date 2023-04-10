package com.arrays;
import java.util.Scanner;
public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter size of an array");
		n=sc.nextInt();
		int []arr=new int[n];
		int sum=0;
		System.out.println("enter array values");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		System.out.println("sum is"+sum);
		System.out.println("average is"+sum/3);
		int max=arr[0];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(max<arr[i])
					max=arr[i];
			}
		}
		int min=arr[0];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(min>arr[i])
					min=arr[i];
			}
		}
	}

}
