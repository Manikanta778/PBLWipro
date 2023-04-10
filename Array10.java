package com.arrays;
import java.util.Scanner;
public class Array10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter size of an array");
		n=sc.nextInt();
		int []arr=new int[n];
		int []newarr=new int[n];
		int j=0;
		System.out.println("enter array values");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			
				if(arr[i]%2==0) {
					newarr[j]=arr[i];
					j++;
				}		
		}
		for(int i=0;i<n;i++) {
		
				if(arr[i]%2!=0) {
					newarr[j]=arr[i];
					j++;
				}
	}
		for(int i=0;i<n;i++) {
			System.out.println(newarr[i]);
		}
}
}
