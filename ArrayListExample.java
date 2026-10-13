import java.util.ArrayList;
public class ArrayListExample {
    public static void main(Static[]args)
    {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add ("Apple");
        fruits.add ("Mango");
        fruits.add ("Banana");
        System.out.println("Arraylist : " + fruits);
        fruits.remove("Mango");
        System.out.println("After remove :" + fruits);
        System.out.println("First fruit :" + fruits.get(0));


    }
}
