
import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String [] colors = new String[5]; //Empty array with size 5
        colors[0] = "purple";
        colors[1] = "blue";

        System.out.println(Arrays.toString(colors));

        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);

        int[] numbers = {100,200}; //Once you define array you cannot change

        //Cach 1: Normal for loop
        for(int i = 0; i < colors.length-1; i++){
            System.out.println(colors[1]);
        }

        //Cach 2: For eacH (Type ten : ten array)
        for(String color : colors){
            System.out.println(color);
        }

        //Cach 3 dung Stream

        Arrays.stream(colors).forEach(System.out::println);



    }
}
