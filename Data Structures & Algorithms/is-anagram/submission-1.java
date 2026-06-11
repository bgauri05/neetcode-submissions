class Solution {
        public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length()){

            return false;
        }

            char[] tArr = t.toCharArray();

                    
        for (int i = 0; i < s.length(); i++) {
         char c = s.charAt(i);
         boolean found = false;
                        
            for (int j = 0; j < tArr.length; j++) {
            if (c == tArr[j]) {
             tArr[j] = '#';
             found = true;
             break;
            }
            }
                          
            if (!found) {
                return false;
            }
        }
              return true;   

        }

        }
   
