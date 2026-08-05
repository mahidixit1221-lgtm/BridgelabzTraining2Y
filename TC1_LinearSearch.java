public class TC1_LinearSearch {
    public static int linearSearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) return i;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={8,61,2,3,4,0};
        int index=linearSearch(arr,8);
        System.out.println(index!=-1?"Found at index: "+index:"Not Found");
    }
}
/*
Best: O(1)
Average: O(n)
Worst: O(n)
Space: O(1)
*/