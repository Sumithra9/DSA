class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+"); // Fix here
        int start = 0;
        int end = str.length - 1;
        while (start < end) {
            String temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
        String result = String.join(" ", str); // Cleaner way to join
        return result;
    }
}