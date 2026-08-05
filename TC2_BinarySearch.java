public class TC2_BinarySearch {
    static int binarySearch(int[] arr,int target){
        int l=0,r=arr.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]==target) return m;
            if(arr[m]<target) l=m+1;
            else r=m-1;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={0,2,3,4,8,61};
        int ans=binarySearch(arr,4);
        System.out.println(ans!=-1?"Found at index: "+ans:"Not Found");
    }
}
/*
Worst: O(log N)
Space: O(1)
*/