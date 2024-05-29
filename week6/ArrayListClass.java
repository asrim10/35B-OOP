import java.util.ArrayList;
public class ArrayListClass {
    public static void main(String[] args) {
        /*Import ArrayList from java.util at the top */
        /*Cannot use primitive data type,use wrapper for it */
        ArrayList<Integer> arrayList1= new ArrayList<>();
        System.out.println(arrayList1);
        /*To add on array list */
        arrayList1.add(10);
        arrayList1.add(20);
        System.out.println(arrayList1);
        /*Can also add at index directly */
        arrayList1.add(1, -20);
        /*This will shift the currently element in the 1st intex to 2nd index  */
        System.out.println(arrayList1);
        /*To remove .remove(index) */
        arrayList1.remove(0); // will remove 0th index element and shift 1st to 0
        System.out.println(arrayList1);
        /*To update .set(index,value) */
        arrayList1.set(0, -200);
        System.out.println(arrayList1);
        /*To access .get(index) */
        System.out.println("0th element = " + arrayList1.get(0));

        /*Task
         * Make ArrayList of the following
         * ["Apple","Orange","Banana","Watermelon","pineapple"]
         * Add "Grapes" in index 1
         * Remove Orange from the arrayList
         * Remove Watermelon
         * Add pear in 0th index
         * Change "pineapple" to "Avocado"
         * Note: Print on every add and remove to get new index of array list
         */

         ArrayList<String> fruits= new ArrayList<>();
         System.out.println(fruits);
         fruits.add("Apple");
         fruits.add("Orange");
         fruits.add("Banana");
         fruits.add("Watermelon");
         fruits.add("Pineapple");
         System.out.println(fruits);

         fruits.add(1, "Grapes");
         System.out.println(fruits);
        
         fruits.remove("Orange");
         System.out.println(fruits);

         fruits.remove("Watermelon");
         System.out.println(fruits);

         fruits.add(0, "Pear");
         System.out.println(fruits);

         fruits.set(4, "Avocado");
         System.out.println(fruits);
         
    }
}
