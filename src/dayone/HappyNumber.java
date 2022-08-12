package dayone;


//https://leetcode.com/problems/happy-number/

public class HappyNumber {
    public boolean isHappy(int n) {

        if(n == 1){
            return true;
        }
        if(n ==4){
            return false;
        }

        return isHappy(sumDigs(n));
    }

    private static int sumDigs(int n){
        int sum = 0;
        while(n > 0){
            sum += Math.pow(n%10, 2);
            n = n/10;
        }
        return sum;
    }
}
