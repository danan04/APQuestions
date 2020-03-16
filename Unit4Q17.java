public class Unit4Q17
{
    public static void main(String[]args)
    {
        int k = 35;

        while (k >= 0)

        {

            System.out.println("X");

            k -= 5;

        }
    }
}
// k starts out with 35.
//When k >= 0 is true, the body of loop is executed.
//"X" is printed and k is updated --> current value minus 5 every time
//k = 35, 30, 25, 20, 15, 10, 5, and 0 --> 8 times through the loop. --> "X" prints 8 times