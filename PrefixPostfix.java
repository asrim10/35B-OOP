public class PrefixPostfix {
    public static void main(String[] args) {
        int prefixValue=10;
        System.out.println("Prefix will update here" + ++prefixValue);
        System.out.println("It will remain the same" + prefixValue);
        /*Prefix is when you put operator in the left side of value/var */

        int postfixValue= 20;
        System.out.println("Postfix value will not update here" + postfixValue++);
        System.out.println("It will update here"+ postfixValue);
        /*Postfix is when you put operator in the right side */

    }
}
