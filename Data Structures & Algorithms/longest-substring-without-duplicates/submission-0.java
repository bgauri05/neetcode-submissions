class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        for(int i =0; i< s.length(); i++){
        Set<Character> substring = new HashSet<>();
        for(int j =i ; j< s.length(); j++){
            if(substring.contains(s.charAt(j))){
                break;
            }
            substring.add(s.charAt(j));
        }
        res = Math.max(res,substring.size());        
        }
 return res;
    }
}
