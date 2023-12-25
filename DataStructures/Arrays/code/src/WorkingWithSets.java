import java.util.HashSet;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) { //Unique dont allow duplicate
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("red"));
        balls.add(new Ball("yellow"));
        balls.forEach(System.out::println);

    }

    record Ball(String color){}
}
