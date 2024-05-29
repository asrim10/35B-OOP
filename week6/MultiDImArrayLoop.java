public class MultiDImArrayLoop {
    public static void main(String[] args) {
        int [] [] twoArray= new int[2][3];
        twoArray[0][0] = 10;
        twoArray[0][1] = 20;
        twoArray[0][2] = 30;
        twoArray[1][0] = -30;
        twoArray[1][1] = -20;
        twoArray[1][2] = -10;

        /*Visual
         * [
         * [10,20,30] ->0
         * [-30,-20,-10] ->1
         * ]
         */
        /*Loop multi dim array with nested loop */
        /*Outer selects the array, inner selects the actual value */
        int outerLength=twoArray.length;
        for (int outer = 0; outer < outerLength; outer++){
            // twoArray[outer] -> iterate each array

            int innerLength = twoArray[outer].length;
            for(int inner=0; inner < innerLength; inner++){
                System.out.println(twoArray[outer][inner]);
            }
        }

        /*Task
         * Make the following Array
         * [
         *      ["Sarjak" , "Ayush" , "Rabi"],
         *      ["Yudip" , "Utsav", "Bibek"],
         *      ["Rabina", "Kimti", "Sneha"]
         * ]
         * Print all the names
         * Also, Find on which array is Kimti is 
         * Output:
         * 2
         */
        String[][] names;
        names = new String[3][3];
        names[0][0] = "Sarjak";
        names [0][1] = "Ayush";
        names [0][2] =  "Rabi";
        names[1][0] = "Yudip";
        names [1][1] = "Utsav";
        names [1][2] =  "Bibek";
        names[2][0] = "Rabina";
        names [2][1] = "Kimti";
        names [2][2] =    "Sneha";  

        int outerL = names.length;
        for (int i = 0; i < outerL; i++) {
            int innerL = names[i].length;
            for (int j = 0; j < innerL; j++) {
                System.out.println(names[i][j]);
            }
        }
        String target="Kimti";
        int targetArrayIndex = -1;
        for (int i = 0; i < outerL; i++) {
            for (int j = 0; j < names[i].length; j++) {
                if (names[i][j].equals(target)) {
                    targetArrayIndex = i;
                    break;
                }
            }
            if (targetArrayIndex != -1) {
                break;
            }
        }
        System.out.println(targetArrayIndex + 1);
    }
    
}
