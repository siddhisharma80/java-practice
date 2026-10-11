 import java.util.ArrayList;
import java.util.Iterator;
 class Fruits{
     public static void main(String[]args){
     ArrayList<String>list = new ArrayList<>();
      list.add("mango");
       list.add("apple");
        list.add("papaya");
        list.add("pear");
      list.add("banana");

       Iterator<String> itr = list.iterator();
       while(itr.hasNext())
       {
         System.out.println(itr.next());
   } }
 }




/*import java.util.ArrayList;
import java.util.Iterator;
class Fruits {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("mango");
        list.add("apple");
        list.add("banana");

        System.out.println("arraylist : "+ list);
        System.out.println("Fruit at index 1 :" + list.get(1));
        list.remove("apple");
        System.out.println("After remove :" + list);
        
    }
}*/