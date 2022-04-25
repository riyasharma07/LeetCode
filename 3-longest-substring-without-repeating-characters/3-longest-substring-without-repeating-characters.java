class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap <Character, Integer> set = new HashMap<Character, Integer>();
        int left=0;
        int right=0;
        int n= s.length();
        int len=0;
        while(right < n){
            if(set.containsKey(s.charAt(right))){
                left = Math.max(set.get(s.charAt(right))+1, left);
            }
            set.put(s.charAt(right),right);
            len=Math.max(len, right -left +1);
            right++;
        }
        return len;
    }
}