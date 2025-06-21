class Solution {
    public int[] plusOne(int[] digits) {
        int carry=1;
        ArrayList<Integer>digit=new ArrayList<>();
        for (int d : digits) {
            digit.add(d);
        }
        for(int i=digits.length-1;i>=0;i--){
            digit.set(i,digit.get(i)+carry);
            if(digit.get(i)<10){
                carry=0;
                break;
            }
            else{
                digit.set(i,0);
                carry=1;
            }
        }
        int size;
        if(carry==1){
            size=digits.length+1;
            int arr[]=new int[size];
            arr[0]=1;
            int i=1;
            for(int num:digit){
                arr[i]=num;
                i++;
            }
            return arr;
        }
        else {
            size=digits.length;
            int arr[]=new int[size];
            int i=0;
            for(int num:digit){
                arr[i]=num;
                i++;
            }
            return arr;
        }
    }
}