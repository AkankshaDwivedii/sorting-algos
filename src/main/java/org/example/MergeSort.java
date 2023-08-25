package org.example;

public class MergeSort {


    public static void merge(int[] arr, int l, int h, int mid)
    {
        //mid is included in the left array so left=mid-l+1
        int left=mid-l+1;
        int right= h-mid;


        int[] lr= new int[left];
        int[] rr= new int[right];

        for(int i=0;i<lr.length;i++)
        {
            lr[i]=arr[l+i];
        }
        for(int i=0;i<rr.length;i++)
        {
            //right array start with mid+1
            rr[i]= arr[i+mid+1];
        }

        int i=0;
        int j=0;
        int k=l;
        while(i<left && j<right)
        {
            if(lr[i]<=rr[j])
            {
                arr[k++]= lr[i++];
            }
            else {
                arr[k++]=rr[j++];
            }
        }

        while(i<left)
        {
            arr[k]= lr[i]; k++; i++;
        }

        while(j<right)
        {
            arr[k]= rr[j]; k++;j++;
        }

    }


    public static void mergeSort(int[] arr,int l,int h){

        if(l<h)
        {
            int mid=l+(h-l)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,h);
            merge(arr,l,h,mid);
        }

    }

    public static void main(String[] args) {
        int[] arr= new int[]{8,9,5,0,2,8,7,0,1,6};
        mergeSort(arr,0, arr.length-1);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
