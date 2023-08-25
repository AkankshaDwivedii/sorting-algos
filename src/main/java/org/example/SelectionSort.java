package org.example;

public class SelectionSort {
    public static int findMinIndex(int[] arr, int s, int e)
    {
        int min =s;
        for(int i=s+1;i<=e;i++)
        {
            if(arr[min]>arr[i])
            {
                min=i;
            }
        }
        return min;
    }

    public static void sort(int[] arr)
    {
        int min=0;

        for(int i=0;i<arr.length-1;i++)
        {
            min= findMinIndex(arr,i,arr.length-1);
            int temp= arr[min];
            arr[min]=arr[i];
            arr[i]= temp;
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
