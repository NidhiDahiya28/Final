import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        var anagrams = new GroupAnagrams();
        var result = anagrams.groupAnagrams(strs);
        System.out.println(result.toString());
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String t =new String(c);
            if(map.containsKey(t)){
                List<String> te = map.get(t);
                te.add(s);
                map.put(t,te);
            }else{
                List<String> te = new ArrayList<>();
                te.add(s);
                map.put(t,te);
            }
        }
        for(String s : map.keySet()){
            List<String> tem= map.get(s);
            res.add(tem);
        }
        return res;
    }
}

//The time complexity is  n(Logn)
//The space complexity n(Logn)