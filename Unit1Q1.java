public class Unit1Q1
{
    public static void main(String[]args)
    {
        int x;
        int y;
        x = 2 / (5%3);
        y = 2/5+1;
        System.out.println(x);
        System.out.println(y);
        //expression 1 evaluates to 0 because 2/5 goes to 0. 0 %3 goes to 0.
        //2 goes to 1 because 5%3 goes to 2 and 2/2 is 1. 
        //expression 3 goes to 1 because 2/5 = 0 and 0 +1 = 1.
    }
}   