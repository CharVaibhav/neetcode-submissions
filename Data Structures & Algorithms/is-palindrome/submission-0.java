class Solution {
    public boolean isPalindrome(String s) {

        String str = s.replaceAll("[^a-zA-Z0-9]", "");

        str=str.toLowerCase();

        String reveresed = new StringBuilder(str).reverse().toString();

        if(str.equals(reveresed))
        {
            return true;
        }

        return false;
        
    }
}
