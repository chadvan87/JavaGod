import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class WorkingwithQueues {
    public static void main(String[] args) {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex",  21));
        supermarket.add(new Person("Kim",  22));
        supermarket.add(new Person("John",  23));

        System.out.println(supermarket.size()); //size cua queue
        System.out.println(supermarket.peek()); // lay thang o top
        System.out.println(supermarket.poll()); // vut thang o top
        System.out.println(supermarket.size());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());

    }

    static record Person(String name, int age){}
}
