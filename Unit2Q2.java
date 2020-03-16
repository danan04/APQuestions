public class Unit2Q2
{
    public static void main(String[]args)
    {
        int val = (int) (Math.random() * 4 + 1);
        //missing code --> Math.random() returns random double value 0<val<1
        //if you multiply the value by 4 and add 1 --> 1<val<5
        //cast that piece of code to an int assigns the value to an integer.
        //multiply val by 2 makes the val either 2,4,6,8.
        val *= 2;
        System.out.println(val);
    }
}