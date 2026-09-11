class Solution {
    public int countCommas(int n) {
        if(n<1000) return 0;
        int x=0;
        for(long i=1000;i<=n;i*=1000) {
            x+=(n-i+1);
        }
        return x;
    }
}