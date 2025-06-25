class Solution {
    class Freq{
        char character;
        int num;
        Freq(char a,int n){
            character=a;
            num=n;
        }
    }
    public String frequencySort(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char a=s.charAt(i);
            map.put(a,map.getOrDefault(a,0)+1);
        }
        Freq[] freq=new Freq[map.size()];
        int i=0;
        for(Character key:map.keySet()){
            freq[i]=new Freq(key,map.get(key));
            i++;
        }
        Arrays.sort(freq,(a,b)->Integer.compare(b.num,a.num));
        String result="";
        for(Freq f:freq){
            for(int j=0;j<f.num;j++) result+=f.character;
        }
        return result;
    }
}