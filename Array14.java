package com.arrays;

public class Array14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=args.length;
        int arr[][]=new int[3][3];
        if(a<9)
        	System.out.println("enter 9 values");
        if(a==9)
        {
        	int k=0;
        	for(int i=0;i<3;i++) {
        		for(int j=0;j<3;j++) {
        			arr[i][j]=Integer.parseInt(args[k]);
        		}
        		int max=Integer.MIN_VALUE;
        		for(int i1=0;i1<3;i1++) {
            		for(int j=0;j<3;j++) {
            			if(arr[i1][j]>max)
            				max=arr[i][j];
            			System.out.println("arr[i1][j]");
        	}
            		System.out.println();
        }
        		System.out.println("max value is"+max);
	}

}
	}
}
	
