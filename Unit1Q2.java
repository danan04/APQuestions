public class Unit1Q2
{
    public static void main(String[]args)
    {
        double d = 0.25;
        int i = 3;
        double diff = d-i;
        System.out.print((int)diff - 0.5);
        //When this is cast to int --> it leaves -2 because digits to the 
        //right of the decimal are truncated. -2 minus 0.5 equals -2.5
    }
} 