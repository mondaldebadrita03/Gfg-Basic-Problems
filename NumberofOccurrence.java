//Basic Approach : Time Complexity O(n)
class Solution {
    int countFreq(int[] arr, int target) {
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target)
                count++;
        }
        return count;
    }
}

//Optimal Approach : Time Complexity O(logn)
class Solution {
    int countFreq(int[] arr, int target) {
        int first=getFirst(arr,target);
        if(first==-1)
            return 0;
        int last=getLast(arr,target);
        return last-first+1;
    }
    private int getFirst(int[] arr, int x){
        int low=0;
        int high=arr.length -1;
        int result=-1;
        while(low<=high){
            int mid=low+ (high-low)/2;
            if(arr[mid]==x){
                result=mid;
                high=mid-1;
            }else if(arr[mid]<x){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return result;
    }
    private int getLast(int[] arr, int x){
        int low=0;
        int high=arr.length -1;
        int result=-1;
        while(low<=high){
            int mid=low+ (high-low)/2;
            if(arr[mid]==x){
                result=mid;
                low=mid+1;
            }else if(arr[mid]<x){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return result;
    }
}
