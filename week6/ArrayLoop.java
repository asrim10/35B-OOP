public class ArrayLoop {
    public static int arrayFinder(String[] alph, String find){
        for (int index = 0 ; index < alph.length; index++){
            if (alph[index] == find) {
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = -10;
        arr[1] = 0;
        arr[2] = 10;
        arr[3] = 20;

        /*We need length of array first, use.length */
        int arrayLength = arr.length;

        /*Loop from 0 - (arraylength)-1, 0-3 */
        for (int index = 0; index < arrayLength; index ++){
            System.out.println(arr[index]);
        }

        // or, use condition, index<=arraylength-1
        System.out.println("Descending Loop ");
        for (int index = (arrayLength)-1; index >= 0; index--){
            System.out.println(arr[index]);
        }

        /*Task
        Loop the arr using while loop */
        int[] a= new int[3];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        int i =0 ;
        int alength=a.length;
        while (i<alength) {
            System.out.println(a[i]);
            i++;
        }

        /*Task
         * Make an array of ["John","Doe","Foo","Bar"]
         * Make a String "Foo"
         * Loop the array and find in which index is "Foo" on
         * Print the index
         */
        String[] alpha={"John","Doe","Foo","Bar"};
        int arrlength=alpha.length;
        for(int j=0; j<arrlength; j++ ){
            if (alpha[j]=="Foo"){
                System.out.println(j);
            }
        }

        /*Task
        Make the function for the above name arrayFinder
         * Takes array of String and String as parameter
         * return index if 2nd argument value matches any element of array
         * else return -1
         * print the returned index value
         */
        String[] alph={"John","Doe","Foo","Bar"};
        String Findalph="a";
        int index = arrayFinder(alph, Findalph);
        System.out.println("Index of " + Findalph + " in the array " + index);
    }
}
