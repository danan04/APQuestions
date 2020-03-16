public class Unit3Q3part1
{
    public static void main(String[]args)
    {
        int x = 5; //initialize example
        int y = 4; // initialize example
        int result = 0;
        if(x > y)
        {
            result = x-y;
            System.out.print(result);
            //prints out b/c x>y --> 1
        }
        else if(x<y)
        {
            result = y-x;
            System.out.print(result);
            //false blc x>y
        }
        else 
        {
            System.out.print(result);
            //false b/c x>y
        }
    }
}
//this code and Unit3Q3part1 prints out the same output for all values of x. 
//if x>y then both print x-y. if x<y then both print y-x. if x=y both print 0