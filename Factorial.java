class Solution {
    int factorial(int n) {
        int facto=1;
        for(int i=n; i>=1; i--){
            facto*=i;
        }
        return facto;
    }
}
