public class ForLoop {
    public static void main(String[] args) {
        /*For loop takes initialization
         * condition
         * modify/update
         */
        for(int index = 0; index <= 5; index ++){
            System.out.println("For Index" + index);
        }
        /*can use different update logic like
         * for (int index=0; index<=5; index+=3)
         */

         /*Using decrement */
         for(int index = 10; index >= 0; index --){
            System.out.println("For Index Decrement" + index);
         }


         /*Task
          * Make a mltiplication of 2
          */
          int n=2;
          for (int i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+n*i);
          }

        /*Nested for loop
         *using for loop inside the scope of for loop
         */
        for (int outer=0; outer < 2; outer ++){
            for(int inner=3; inner > 0 ; inner--){
                System.out.println("Inner Index" + inner);
            }
            System.out.println("Outer index" + outer);
        }

        /*Task
         * Make multiplication table like the following
         * 10 x 1 = 10
         * 10 x 2 = 20
         * ..
         * 10 x 10 =100
         * ..
         * Multiplication table of 1
         * 1 x 1 = 1
         * 1 x 2 = 2
         * ..
         * 1 x 10 = 10
         */

        for(int i = 10; i >= 1; i--){
            System.out.println("Multiplication of " +i);
           for (int j = 1; j <= 10; j++){
            System.out.println(i+"x"+j+"="+i*j);
           }
        }
    }
}
