class Solution {
    public int findKthPositive(int[] arr, int k) {
        int max=Integer.MIN_VALUE;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
            if(arr[i]>max)max=arr[i];
        }
        int count=0;

        for(int i=1;i<max;i++){
            if(!set.contains(i)){
                count++;
                if(count==k)return i;
            }
        }
        while(count!=k){
            max++;
            count++;
        }
        return max;
    }
}