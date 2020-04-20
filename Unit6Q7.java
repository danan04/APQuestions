public class Unit6Q7
{
    public static void main(String[]args)
    {

        int[] fibs = new int[10];
        fibs[0] = 1;
        fibs[1] = 1;
        for (int j = 2; j < fibs.length; j++)
        //used to be j = 1 --> wrong b/c accuess to fibs[j-2] during 1st loop
        //iteration will throw ArrayIndexOutOfBoundsException.
        {
            fibs[j] = fibs[j - 2] + fibs[j - 1];
            System.out.println(fibs[j]);
        }
        
    }
}