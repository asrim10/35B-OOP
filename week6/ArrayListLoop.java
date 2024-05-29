import java.util.ArrayList;
public class ArrayListLoop {
    public static void main(String[] args) {
        /*Import ArrayListLoop on top, import java.util.ArrayList */
        ArrayList<Integer> intArr = new ArrayList<>();
        intArr.add(10);
        intArr.add(20);
        intArr.add(30);
        intArr.add(40);
        intArr.add(50);
        /*To Loop ArrayList, same as array , get length/size first */
        /*To get length use .size() */
        int arrlen=intArr.size();
        /*Loop from 0 to size/len-1 */
        for(int i=0; i < arrlen; i++){
            System.out.println("Index " + i + " Value " + intArr.get(i));
        }
        // Using for each
        for(Integer element: intArr){
            System.out.println(element);
        }
        
        /*Make an ArrayList as student as following
         * ["Aruna","Shreeya","Asrim", "Kimty","Sneha","Amit"]
         * Make 2 another ArrayList males and females
         * add "Asrim","Amit" in males
         * add "Aruna","Shreeya","Kimty","Sneha" in females
         * Print Anjali from females
         * Print Yudip from males
         */

        ArrayList<String> student= new ArrayList<>();
        student.add("Aruna");
        student.add("Shreeya");
        student.add("Asrim");
        student.add("Kimty");
        student.add("Sneha");
        student.add("Amit");
        System.out.println(student);

        ArrayList<String> males=new ArrayList<>();
        ArrayList<String> females= new ArrayList<>();
        
        for (String students : student) {
            if (students.equals("Asrim") || students.equals("Amit")) {
                males.add(students);
            } else if (students.equals("Aruna") || students.equals("Shreeya") || students.equals("Kimty") || students.equals("Sneha")) {
                females.add(students);
            }
        }
        System.out.println(males);
        System.out.println(females);
        
        if (females.contains("Kimty")) {
            System.out.println("Kimty");
        } 
        if (males.contains("Asrim")) {
         System.out.println("Asrim");   
        }
    }
}
