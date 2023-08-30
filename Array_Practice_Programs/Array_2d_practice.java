package com.Arrays;

public class Array_2d_practice {

	public static void main(String[] args) {
		// 2.1 TWO DIMENTIONAL ARRAY
		//int[][] arr=new int[3][2];
        int[][] arr=
        {
            {1,2},
            {3,4},
            {5,6},
        };
        /*arr[0] =new int[] {1,2};
        arr[1] =new int[] {3,4};
        arr[2]=new int[] {5,6};*/
       /* System.out.println(arr);
        arr[0][0]=1;
        arr[0][1]=2;
        arr[1][0]=3;
        arr[1][1]=4;
        arr[2][0]=5;
        arr[2][1]=6;*/
        //System.out.println(arr[0][0]);
       // System.out.println(arr[0][1]);
       /*for (int i = 0; i < arr.length; i++) {
            int[] singleRow = arr[i];
            for (int j = 0; j < singleRow.length; j++) {
                System.out.print(singleRow[j]+" ");
            }
            System.out.println();
        }*/
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    
	}

}
