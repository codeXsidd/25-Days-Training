//use map
//1st step sort str therefore change string to chararray
//the key will store the sorted string
// the value part will have the jumbled string
//the sorted string is made to be the key and the string that got sorted must also get added in the value part of the map
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char[] c=str.toCharArray();
            Arrays.sort(c);
            String s=new String(c);
            if(!map.containsKey(s))
            map.put(s,new ArrayList<>());
            map.get(s).add(str);

        }
        return new ArrayList<>(map.values());
    }
}
