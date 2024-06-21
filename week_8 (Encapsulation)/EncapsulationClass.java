public class EncapsulationClass {
    public static void main(String[] args) {
    Laptop l1 = new Laptop("Asus", "Asus Tuf Gaming");
    l1.year = 2022;
    l1.setPrice(300000);
    l1.inflation(50000);
    l1.setRam(16);
    l1.setStorage(128);
    l1.upgrade(4, 128);
    System.out.println("Brand : " + l1.brand);
    System.out.println("Name : " + l1.name);
    System.out.println("Price : " + l1.getPrice());
    System.out.println("Ram : " + l1.getRam());
    System.out.println("Storage : " + l1.getStorage());
    System.out.println("Year : " + l1.year);
    }
}

 /*Task
     * make a constructor of Laptop that takes brand and name 
     * Make a setter and getter for remaining attributes, ram, storage
     * Make a function upgrade() takes , 2 number for ram and storage
     * and add them to the current values of ram and storage
     * Make a function inflation() takes 1 number price and add to the current value of price
     * Make 2 object, fill the attribute and call upgrade & inflation
     * Print the following
     * Output
     * Brand : Apple 
     * Price : 150000
     * Ram : 10GB
     * Storage : 256GB
     * Year 2022
     */

//1.Encapsulation enclose/bundles similar properties/attributes
// and function/methods inside a single class
class Laptop{
    public String brand;
    public String name;
    // 2. Data hiding can be done using private modifier
    private double price;
    private int ram;
    private int storage;
    public int year;
    // 3. Data attributes can have a better control using setter/getter
    // Write only using setter
    public void setPrice(double price){
        this.price = price; 
    }
    // read only using getter
    public double getPrice(){
        return this.price;
    }
    Laptop(String brand, String name){
        this.brand = brand;
        this.name = name;
    }
    public void setRam(int ram){
        this.ram = ram;
    }
    public int getRam(){
        return this.ram;
    }
    public void setStorage(int storage){
        this.storage = storage;
    }
    public int getStorage(){
        return this.storage;
    }
    public void upgrade(int ram , int storage){
        this.ram = this.ram + ram;
        this.storage = this.storage + storage;
    }
    public void inflation(double price){
        this.price += price; 
    }
    void branding(){
        System.out.println("Brand");
    }
}

