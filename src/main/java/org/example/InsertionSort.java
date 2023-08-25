package org.example;

public class InsertionSort {

    public static void sort(int[] arr)
    {

        int ele=0;
        int j=0;

        for(int i=1;i<arr.length;i++)
        {
            //take the current element
            ele= arr[i];
            //take the position before it
            j=i-1;

            //run a loop till you find the position
            while(j>=0 && arr[j]>ele)
            {
                arr[j+1]= arr[j];
                j=j-1;
            }

            //place the element
            arr[j+1]=ele;
        }
    }

    public static void main(String[] args) {
        int[] arr= new int[]{8,9,5,0,2,8,7,0,1,6};
        sort(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
