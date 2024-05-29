
public class MultiDimArray {
    public static void main(String[] args) {
        /*One D Array , one square bracket [] */
        int[] oneDArray;
        /*Two D Array , two square bracket [] [] */
        int [][] twoDArray;
         /*Three D Array , three square bracket [] [] [] */
         int [] [] [] threeDArray;

         /*Memory alloc , must give size to each dimension */
         twoDArray = new int[2][3];
         /*Visual
          * [
            [0,0,0], -> 0
            [0,0,0], -> 1
          ]
          */
          // twoDArray[0] -> access  0th index array
          twoDArray[0][0]=10;
          twoDArray[0][1]=20;
          twoDArray[1][0]=100;
          twoDArray[1][2]=200;

          //access in variable
          int arrayElement = twoDArray[0][0];
          System.out.println(arrayElement);
          System.out.println(twoDArray[0][1]);

          /*Task
           * Make the following array
           * [
           * [10,-10],
           * [20,-20],
           * [-30,8],
           * [40,45],
           * [50,56]
           * ]
           * print the value 50,56
           */
          int [][] twoD;

          twoD=new int[5][2];

          twoD[0][0] = 10;
          twoD[0][1] = -10;
          twoD[1][0] = 20;
          twoD[1][1] = -20;
          twoD[2][0] = -30;
          twoD[2][1] = 8;
          twoD[3][0] = 40;
          twoD[3][1] = 45;
          twoD[4][0] = 50;
          twoD[4][1] = -56;

          System.out.println(twoD[4][0] + "," + twoD[4][1]);

          // int [] [] arrTwo = {
          //   {10,-10},
          //   {20,-20},
          //   {-30,8},
          //   {40,45},
          //   {50,56}
          // };
          // System.out.println(arrTwo[0][1]);

    }
    
}
