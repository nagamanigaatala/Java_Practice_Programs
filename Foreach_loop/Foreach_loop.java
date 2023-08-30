package com.Foreach_loop;

public class Foreach_loop {

	public static void main(String[] args) {
		//single dimensional array
        int[] arr={1,2,7,8,2,3,5,1};
        int sum=0;
        for (int i : arr) {
            sum+=i;
         }
        System.out.println(sum);
        System.out.println(sum/arr.length);

        //multi-jagged array
        /*int[][] arr={
        {1,2,3},
        {4,5},
        {7}
       };
       int sum=0;
       int noOfElements=0;
       for (int[] nobi : arr) {
        for (int chan : nobi) {
          sum+=chan;
          noOfElements++;
        }
       }
       System.out.println(sum);
       System.out.println(sum/noOfElements);*/
	}

}
