class Solution {
    public boolean isDivisibleBy9(String s) {
        // Your code goes here

        int sum = 0;

        for(int i = 0; i<s.length(); i++){
            sum += Character.getNumericValue(s.charAt(i));
        }

        return (sum %9 == 0);
    }
}
