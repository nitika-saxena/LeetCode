/*
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 

Constraints:

1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.
*/

class IndexOfTheFirstOccurrenceInString {
    public int strStr(String haystack, String needle) {
        //return haystack.indexOf(needle);    -- one Line Solution
        if(needle.length()>haystack.length())
            return -1;
        for(int i =0; i< haystack.length() ; i++ ){
            String match = "";
            if(haystack.charAt(i)==(needle.charAt(0))){
                try{
                match = haystack.substring(i,i+needle.length());
                }
                catch(Exception e){
                    return -1;
                }
            }
            if(match.equalsIgnoreCase(needle))
                return i;
        }
        return -1;
    }
}
