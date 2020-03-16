public class Unit3Q3part2
{
    public static void main(String[]args)
    {
        int x = 5; //initialize example
        int y = 4; // initialize example
        if(x<y)
        {
            System.out.print(y-x);
            //false b/c x>y
        }
        else
        {
            System.out.print(x-y);
            //prints b/c x>y -->1
        }
    }
}
//this code and Unit3Q3part1 prints out the same output for all values of x. 
//if x>y then both print x-y. if x<y then both print y-x. if x=y both print 0