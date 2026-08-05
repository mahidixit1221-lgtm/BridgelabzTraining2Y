import java.util.Arrays;
public class TC3_MergeSort {
    static void mergeSort(int[] a,int l,int r){
        if(l>=r)return;
        int m=(l+r)/2;
        mergeSort(a,l,m);
        mergeSort(a,m+1,r);
        merge(a,l,m,r);
    }
    static void merge(int[] a,int l,int m,int r){
        int[] t=new int[r-l+1];
        int i=l,j=m+1,k=0;
        while(i<=m&&j<=r)t[k++]=a[i]<=a[j]?a[i++]:a[j++];
        while(i<=m)t[k++]=a[i++];
        while(j<=r)t[k++]=a[j++];
        for(i=0;i<t.length;i++)a[l+i]=t[i];
    }
    public static void main(String[] args){
        int[] arr={8,61,2,3,4,0};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
/*
Recurrence: T(n)=2T(n/2)+O(n)
Time: O(n log n)
Space: O(n)
*/