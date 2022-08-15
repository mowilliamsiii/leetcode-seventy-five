package daytwo;

//#TODO comment code with explanation

//https://leetcode.com/problems/multiply-strings/
public class MultiplyStrings {

    public static String multiply(String num1, String num2) {

        int m = num1.length();
        int n = num2.length();
        int[] values = new int[m + n];

        int i = m-1;
        int j = n-1;

        while(i >= 0){
            if(j < 0){
                i--;
                j = n-1;
            }
            if(j >= 0 && i >= 0){
            int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
            int sum = values[i + j + 1] + mul;
            values[i + j] += sum/10;
            values[i + j + 1] = sum % 10;
            j--;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(int val : values){
            if(stringBuilder.length() != 0 || val != 0){
                stringBuilder.append(val);
            }


        }
        return stringBuilder.length() == 0 ? "0" : stringBuilder.toString();
    }


    //driver code
    public static void main(String[] args) {
        String str1 = "9";
        String str2 = "99";
        multiply(str1,str2);
    }
}
