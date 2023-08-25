package org.example;

public class QuickSort {

    public static int findPivot(int[] arr, int l ,int h)
    {
        int pivot=arr[h];
        int j=l;

        for(int i=l;i<=h;i++)
        {
            if(arr[i]<=pivot)
            {
                int t= arr[j];
                arr[j]= arr[i];
                arr[i]=t;

                j++;

            }

        }



        return j-1;



    }

    public static void quicksort(int[] arr, int l , int h)
    {
        if(l<h)
        {
            int partitionIndex= findPivot(arr,l,h);
            quicksort(arr,l,partitionIndex-1);
            quicksort(arr, partitionIndex+1,h);
        }
    }

    public static void main(String[] args) {
        int[] arr= new int[]{8,9,5,0,2,8,7,0,1,6};
        quicksort(arr,0, arr.length-1);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
