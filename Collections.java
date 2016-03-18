import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by aamir on 2016-03-16.
 */
public class Collections {
    /**
     * This method is used to return intersection of
     * two lists
     * @param list1 This is the first parameter to intersect method
     * @param list2  This is the second parameter to intersect method
     * @return List<String> This returns intersection of l1 and l2.
     */
    public static List<String> intersect(List<String> list1, List<String> list2)
    {
        List<String> result = new ArrayList<String>();
        for (String s : list1)
        {
            if(list2.contains(s))
                result.add(s);
        }
        return result;
    }

    /**
     * This method is used to return union of
     * two lists so there are no duplicates
     * @param list1 This is the first parameter to merge method
     * @param list2  This is the second parameter to merge method
     * @return List<String> This returns intersection of list1 and list2.
     */
    public static List<String> merge(List<String> list1, List<String> list2)
    {
        list1.removeAll(list2);
        list1.addAll(list2);
        return list1;
    }

    /**
     * This method is used to return invert of a map
     * @param map This is the first parameter to intersect method
     * @return Map<Integer, List<String> This returns intersection of map.
     */
    public static Map<Integer, List<String>> invert(Map<String, Integer> map)
    {
        Map<Integer, List<String>> result = new HashMap<Integer, List<String>>();
        for (String s : map.keySet())
        {
            List<String> val = new ArrayList<String>();
            Integer i = map.get(s);
            if(result.containsKey(i))
            {
                val = result.get(i);
                val.add(s);
            }
            else
                val.add(s);
            result.put(i, val);
        }
        return result;
    }


    public static void main(String args[])
    {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();

        list1.add("USA");
        list1.add("Canada");
        list1.add("UK");

        list2.add("Australia");
        list2.add("Germany");
        list2.add("UK");

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(intersect(list1, list2));
        System.out.println("------------------------------");
        //System.out.println(merge(list1, list2));
        System.out.println("------------------------------");

        Map<String, Integer> m = new HashMap<String, Integer>();
        m.put("UK", 2);
        m.put("USA", 5);
        m.put("Canada", 3);
        m.put("Germany", 9);
        m.put("France", 5);
        m.put("China", 1);
        m.put("Brazil", 8);
        m.put("Japan", 4);

        System.out.println(m);
        System.out.println(invert(m));
    }
}
