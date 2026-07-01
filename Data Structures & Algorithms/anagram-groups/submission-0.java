class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List> hm= new HashMap<String, List>();
        for(String s:strs)
        {
            int[] arr = new int[26];

            for(char c : s.toCharArray())
            {
                arr[c-'a']++;
            }

            StringBuilder sb = new StringBuilder();

            for(int i:arr)
            {
                sb.append("#");
                sb.append(i);
            }
            String key = sb.toString();

            if(!hm.containsKey(key))
            {
                hm.put(key, new ArrayList<String>());
            }
            hm.get(key).add(s);
        }
        return new ArrayList(hm.values());
       
    }
}
