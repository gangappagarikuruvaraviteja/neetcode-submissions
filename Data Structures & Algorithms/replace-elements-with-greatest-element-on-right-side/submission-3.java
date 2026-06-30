class Solution {
    public int[] replaceElements(int[] arr) {

    int n=arr.length;
    int rightmax=-1;

    for(int i=n-1;i>=0;i--){

        int current=arr[i];
        arr[i]=rightmax;
        rightmax=Math.max(rightmax,current);
    }


    return arr;
        
    }
}