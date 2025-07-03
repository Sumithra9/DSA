class Solution {
    public int firstUniqChar(String s) {
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<alphabet.length();i++){
            char c=alphabet.charAt(i);
            map.put(c,0);
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.get(c)+1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}