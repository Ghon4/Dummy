import java.util.*;

public class Question_5 {
    public static void main(String[] args) {
        sortById();
    }

    static void sortById() {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(4, "abc");
        hm.put(10, "ab2");
        hm.put(5, "abc3");
        hm.put(6, "abc5");
        Map<Integer, String> treeMap = new TreeMap<Integer, String>(hm);
        SortedSet<Integer> keys = new TreeSet<>(treeMap.keySet());
        for (Integer key : keys) {
            System.out.println(key + " " + treeMap.get(key));
        }
    }
}
