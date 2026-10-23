class Solution {
    public boolean isPerfect(int n) {
        if(n%2 == 0){
            int sum = 1;
            for(int i = 2; i <= n/2; i++)
                if(n % i == 0)
                    sum += i;

            if(sum == n)
                return true;
        }
        
        return false;
    }
}
