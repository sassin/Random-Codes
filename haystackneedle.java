/*
Problem statement: https://leetcode.com/problems/implement-strstr/
Implement strStr().
Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
*/

public class Solution {
    public int strStr(String haystack, String needle) {
        
        if(haystack == null || needle == null)
            return -1;
            
        if(haystack.toLowerCase().contains(needle.toLowerCase()))
        {
            return haystack.indexOf(needle);
        }
        else
        {
            return -1;
        }
        
    }
}