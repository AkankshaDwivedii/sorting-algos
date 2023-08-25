package org.example;

public class BubbleSort {
    public static void sort(int[] arr)
    {
          int n =arr.length;

          //last element is sorted at the end
          for(int i=0;i<n-1;i++)
          {
              //after each pass elements are sorted
              for(int j=0;j<n-i-1;j++)
              {
                  if(arr[j]>arr[j+1])
                  {
                      int t= arr[j];
                      arr[j]=arr[j+1];
                      arr[j+1]=t;
                  }
              }
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
