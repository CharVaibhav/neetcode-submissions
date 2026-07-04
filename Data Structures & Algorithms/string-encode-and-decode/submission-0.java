class Solution {

    public String encode(List<String> strs) {

        String str="";

        for(String i:strs)
        {
            int n= i.length();
            str=str+n+"#"+i;
        }
        return str;

    }

    public List<String> decode(String str) {

        ArrayList<String> arr = new ArrayList<String>();

        int i=0;
        while(i<str.length())
        {
            int j=i;

            while(str.charAt(j)!='#')
            {
                j++;
            }

            int len = Integer.parseInt(str.substring(i,j));

            j++;

            arr.add(str.substring(j,j+len));

            i=j+len;
        }
        return arr;

    }
}
