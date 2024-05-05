public class JumpStatement {
    public static void main(String[] args) {
        /*break and continue are jump statement */
        for(int index = 0; index<3; index++){
            if(index==1){
                break;//this will end the loop forn here
            }
            System.out.println("Index "+ index);
        }//break will exit scope here

        /*Can be used in while/do while */
        int counter = 0;
        while (counter<3) {
            if (counter==1) {
                break;//exit from here
            }
            System.out.println("While counter " +counter);
            counter ++;
        }
        /*continue will skip the current iteration
         * or will bypass all the statement below it
         */
        for(int index = 0; index<5; index++){
            if (index==2) {
                continue; //when called, it will bypass everything below
            }
            System.out.println("Continue Index " + index);
        }
        /*Break on nested loop */
        for(int outer =0; outer<2;outer++){
            for(int inner = 0; inner <=5 ; inner++){
                if (inner==2) {
                    break; //this will only exit the inner for loop
                }
                System.out.println("Inner Index " +inner);
            }//break will exit his scope if used in inner
            System.out.println("Outer Index "+ outer);
        }

        System.out.println("Labeled Break");
        /*Labeled Brea */
        outerloop: for(int outer=0; outer<2; outer++){
            innerloop:for(int inner=0;inner<=5; inner++){
                if (inner==2) {
                    break outerloop;//this will break the loop with this label
                }
                System.out.println("Inner Index "+ inner);
            }
            System.out.println("Outer index " + outer);
        }
        
        /*Task
         * loop fron -5 to 5
         * break the loop if the value is positive
         */
        for(int i=-5;i<6;i++){
            if (i>0) {
                break;
            }
            System.out.println("Num " + i);
        }
        /*Task
         * loop from 1 to 20
         * print the number if only even
         * use continue to complete
         */
        for(int i = 1; i <= 20; i++){
            if (i%2!=0) {
            continue;
            }
            System.err.println("EVEN " + i);
        }
    }
}
