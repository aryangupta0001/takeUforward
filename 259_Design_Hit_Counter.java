class HitCounter {

    int[] time;
    int k;
    
    public HitCounter() {
        time = new int[300];
        k = 0;
    }
    
    public void hit(int timestamp) {
        time[k++] = timestamp;
    }
    
    public int getHits(int timestamp) {
        int target = timestamp - 300 + 1;
        int beg = 0;
        int end = k-1;

        while(beg <= end){
            int mid = beg + (end - beg) / 2;

            if(time[mid] == target)
                return k-mid;
            
            else if (time[mid] < target)
                beg = mid + 1;
            
            else
                end = mid - 1;
        }
        return k-beg;
    }
}

/**
 * Your HitCounter object will be instantiated and called as such:
 * HitCounter obj = new HitCounter();
 * obj.hit(timestamp);
 * int param_2 = obj.getHits(timestamp);
 */
