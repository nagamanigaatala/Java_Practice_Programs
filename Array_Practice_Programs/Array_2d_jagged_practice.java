package com.Arrays;

public class Array_2d_jagged_practice {

	public static void main(String[] args) {
		//2.2 JAGGED ARRAY
        int[][] arr={
            {1,2},
            {3,4,5,6},
            {7,8,9},
        };
       /*arr[0] =new int[]{1,2};
        arr[1]=new int[3];
        arr[2]=new int[4];
        //arr[0][0]=1;
        //arr[0][1]=2;
        arr[1][0]=3;
        arr[1][1]=4;
        arr[1][2]=5;
        arr[2][0]=6;
        arr[2][1]=7;
        arr[2][2]=8;
        arr[2][3]=9;*/
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

	}

}
