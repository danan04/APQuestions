public class Unit4Q16
{
    public static void main(String[]args)
    {

        int a = 100;

        while (a > 1)

        {

            System.out.println("$");

            a /= 2;

        }
    }
}
//prints out 6 $ b/c ecause the body of the while loop executes 6 times 
//each loop iteration prints one $ 
//end of 1st iteration --> 50
//end of the second iteration --> a=25
//end of the third iteration --> a=12
//end of the fourth iteration --> a=6
//end of the fifth iteration --> a=3
//end of 6th iteration --> a=1
//while loop terminates after the 6th iteration b/c  a > 1 is not true
