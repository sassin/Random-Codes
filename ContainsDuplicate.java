/*
Problem: https://leetcode.com/problems/contains-duplicate-ii/

Given an array of integers and an integer k, find out whether there there are two distinct indices i and j in the array 
such that nums[i] = nums[j] and the difference between i and j is at most k.
*/

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int size = nums.length;
        boolean isSolution = false;
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < size; i++)
        {
            if(hm.containsKey(nums[i]))
            {
                if((i - hm.get(nums[i])) <= k)
                {
                    return true;
                }
                else
                {
                    hm.put(nums[i],i);
                }
            }
            else
            {
                hm.put(nums[i],i);
            }
        }
        return isSolution;
    
            
    }
        
}