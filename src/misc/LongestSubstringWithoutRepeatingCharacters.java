package misc;


import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {

        int pointer1 = 0;
        int pointer2 = 0;
        int max = 0;

        Set<Character> hashSet = new HashSet<>();

        while(pointer2 < s.length()){
            if(!hashSet.contains(s.charAt(pointer2))){
                hashSet.add(s.charAt(pointer2));
                pointer2++;
                max = Math.max(hashSet.size(),max);
            }else{
                hashSet.remove(s.charAt(pointer1));
                pointer1++;
            }
        }
        return max;
    }

    //Driver code
    public static void main(String[] args) {
        String s = "pwwkew";

        int result = lengthOfLongestSubstring(s);

        System.out.println(result);
    }
}
