import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingwithLinkedList {

    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("alex",21));
        linkedList.add(new Person("alexa",21));
        linkedList.add(new Person("alexb",22));
        linkedList.addLast(new Person("Last element",21));
        ListIterator<Person> personListIterator = linkedList.listIterator();
        while(personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }
        while(personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }

    }


    static record Person(String name, int age){}
}
