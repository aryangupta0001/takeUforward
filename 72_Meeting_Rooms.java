class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        // Your code goes here

        int[] temp = new int[2];

        for(int i = 0; i<intervals.length; i++)
            for(int j = 0; j<intervals.length - i - 1; j++)
                if(intervals[j][0] > intervals[j+1][0]){
                    temp[0] = intervals[j][0];
                    temp[1] = intervals[j][1];
                    
                    intervals[j][0] = intervals[j+1][0];
                    intervals[j][1] = intervals[j+1][1];

                    intervals[j+1][0] = temp[0];
                    intervals[j+1][1] = temp[1];
                }

        for(int i = 1; i<intervals.length; i++)
            if(intervals[i][0] < intervals[i-1][1])
                return false;
        
        return true;
    }
