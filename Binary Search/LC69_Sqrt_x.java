class Solution{

    public int mySqrt(int x){
        return sqrtNumber(x,0, x, -1);
    }
    
    static int sqrtNumber(int x, int start, int end, int ans){
        if (start > end){
            return ans;
        }
        int mid = start + (end - start)/2;
        long val = (long) mid * mid;
        if(val == x){
            return mid;
        } else if ( val > x){
            return sqrtNumber(x,0, mid - 1, ans);
        } else {
            return sqrtNumber(x,mid + 1, end, mid);
        }
    }
}
        
           
