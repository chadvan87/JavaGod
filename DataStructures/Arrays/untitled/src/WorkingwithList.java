import java.util.ArrayList;
import java.util.List;

public class WorkingwithList {
    public static void main(String[] args) {
        //List la interface cua
        List<String> colors = new ArrayList();
        System.out.println(colors.size());
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.add("green");
        System.out.println(colors);
        System.out.println(colors.contains("pink"));

        //3 cach loop for each for thuong
        for(String color : colors){
            System.out.println(color);
        }

        colors.forEach(System.out::println);
    }
}
