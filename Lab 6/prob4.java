import java.util.*;

class prob4 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        System.out.println("List: " + list);

        Set<String> set = new HashSet<String>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        System.out.println("Set: " + set);

        Queue<String> queue = new LinkedList<String>();
        queue.add("One");
        queue.add("Two");
        queue.add("Three");
        System.out.println("Queue: " + queue);

        Map<String, Integer> map = new HashMap<String,Integer>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        System.out.println("Map: " + map);
    }
}