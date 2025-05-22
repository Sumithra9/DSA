class Solution {
    public int reverse(int x) {
        int r=0;
        int p=0;
        while(x!=0){
            int num=x%10;
            if (r > Integer.MAX_VALUE / 10 || (r == Integer.MAX_VALUE / 10 && num > 7)) {
                return 0;
            }
            if (r < Integer.MIN_VALUE / 10 || (r == Integer.MIN_VALUE / 10 && num < -8)) {
                return 0;
            }
            r=(r*10)+num;
            x=x/10;
        }
        return r;
    }
}