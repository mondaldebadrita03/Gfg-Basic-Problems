class Solution {
    static boolean armstrongNumber(int n) {
        int num = n;
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }
        return n == sum;
    }
}
