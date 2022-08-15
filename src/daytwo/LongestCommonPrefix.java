package daytwo;

//https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        //check for null or empty values
        if(strs == null || strs.length == 0){
            return "";
        }

        //prefix will be equal to first word in the array
        String prefix = strs[0];

        //create loop to iterate through inout array (strs)
        for(int i = 1; i < strs.length; i++){
            //condition stops if prefix only contains 1 letter
            while(strs[i].indexOf(prefix) != 0){
                //remove each letter that is not common among all previous strings
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }

        //return longest common prefix
        return prefix;
    }
}
