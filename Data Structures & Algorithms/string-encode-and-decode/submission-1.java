class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for( String str : strs) {
            encoded.append(str.length()).append("#").append(str);

        }
   return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
        
            int j = i;
                //find #
            while(str.charAt(j) != '#') {  //charAt Used to get a single character at a specific index in a string.
                j++;
            }
            //extract length
            int len = Integer.parseInt(str.substring(i,j)); //parse.Int Converts a string into an integer.

            //extract actual string
            String word = str.substring(j+1, j+1 + len); //substring Extracts part of a string.

            result.add(word);

            //move to next encoded string4
            i = j + 1 + len;

        }
        return result;

    }
}
