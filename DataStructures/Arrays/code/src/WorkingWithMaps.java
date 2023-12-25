import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        //Inser to a map
        map.put(1, new Person("Alex"));
        map.put(2, new Person("Alexs"));
        map.put(3, new Person("Alexs"));
        map.put(1, new Person("Alex")); //No effect map also dont allow dupplicate
        //The result of Map look like this {1=Person[name=Alex], 2=Person[name=Alexs], 3=Person[name=Alexs]}
        // key = value
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.entrySet()); //entry set la tat ca moi thu trong map
        map.entrySet().forEach(x -> System.out.println(x.getKey() + "-" + x.getValue()));
        System.out.println(map.getOrDefault(3, new Person("default")));
        System.out.println(map.values());
        System.out.println("Hash function start from here");
        Map<Person, Diamond> map2 = new HashMap<>();
        map2.put(new Person("Hi"), new Diamond("cara"));
        System.out.println(map.get(new Person("Hi")));
        System.out.println(new Person("Hi").hashCode());
    }

    record Person(String name){}

    record Diamond(String name){}
}
