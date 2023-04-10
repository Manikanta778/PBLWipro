package com.arrays;
import java.util.Scanner;
public class ArrayOccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter size of an array");
		n=sc.nextInt();
		int []arr=new int[n];
		int count=0;
		int maxcount=0,element=0;
		System.out.println("enter array values");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j])
					count++;
			}
		
		 if (count > maxcount) {
		        maxcount = count;
		        element = arr[i];
		      }
		}
		System.out.println(element);
		    }
	}


