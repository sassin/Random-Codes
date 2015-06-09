/*
problem: https://leetcode.com/problems/excel-sheet-column-number/
Given a column title as appear in an Excel sheet, return its corresponding column number.
Example:	A -> 1
			B ->2
			AA -> 27 ... so on
*/
public class Solution {
    public int titleToNumber(String s) {
        int colNum =0;
        char ch;
        int ascii;
        int i;
        if(s.length()>1)
        for(i = 0; i < s.length()-1; i++)
        {
            ch = s.charAt(i);
            ascii = (int)ch;
            colNum =  colNum + (ascii - 64)*(int)Math.pow(26, s.length()-1 -i);
        }
        ch = s.charAt(s.length()-1);
            ascii = (int)ch;
            colNum = colNum + (ascii - 64);
        return colNum;
    }
}