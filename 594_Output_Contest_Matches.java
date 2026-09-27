class Solution {
    public String findContestMatch(int n) {
        // Your code goes here\

        List<String> ans = new ArrayList<>();

        int beg = 1, end = n;

        while(beg<end){
            String str = "(" + String.valueOf(beg) + "," + String.valueOf(end) + ")";
            ans.add(str);

            beg++;
            end--;
        }

        return pair(ans, 0).get(0);

/*
        while(true)
            if(ans.size() > 1){
                int size = ans.size(), i = 0;

                while(true)
                    if(ans.size() > size/2){
                        String str = "(" + ans.get(i) + "," + ans.get(ans.size() - 1) + ")";

                        ans.remove(i);
                        ans.remove(ans.size() - 1);
                        ans.add(i, str);

                        i++;
                    }

                    else
                        break;
            }
            else
                break;

        return ans.get(0);
*/
    }

    public static List<String> pair(List<String> ans, int beg){
        if(ans.size() == 1)
            return ans;
        
        String str = "(" + ans.get(beg) + "," + ans.get(ans.size() - 1) + ")";

        ans.remove(beg);
        ans.remove(ans.size() - 1);
        ans.add(beg, str);

        if(beg < ans.size() - 1)
            beg++;
        
        else
            beg = 0;
            
        return pair(ans, beg);
    }
}
