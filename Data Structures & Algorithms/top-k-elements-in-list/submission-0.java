class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    
    HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();

    for(int i: nums)
    {
        if(!hm.containsKey(i))
        {
            hm.put(i,1);
        }
        else{
            hm.put(i,hm.get(i)+1);
        }
    }
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hm.entrySet());

        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        int[] arr = new int[k];

        for(int i=0;i<k;i++)
        {
            arr[i]=list.get(i).getKey();
        }
    
        return arr;
        
    }
}
