package com.arrays;
import java .util.Scanner;
public class ArrayAscii {

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
			System.out.print((char)(arr[i]));
			System.out.print(" ");
		}

	}

}
