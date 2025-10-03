class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
       HashMap<Integer,Integer> map=new HashMap<>();//using hash map the array values are keys and the index are values in hashing in our case
       int diffrence=0,i;
       for(i=0;i<nums.length;i++)
       {
        diffrence=target-nums[i];
        if(map.containsKey(diffrence)){
            arr[0]=i;
            arr[1]=map.get(diffrence);
            return arr;  //you can return like this also return new int[] {map.get(diffrence),i} 
        }
        map.put(nums[i],i);
       }
       return arr;
    }
}
