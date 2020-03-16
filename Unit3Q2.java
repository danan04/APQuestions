public class Unit3Q2
{
    public static void main(String[]args)
    {
        String first = new String("duck");
        String second = new String("duck");
        String third = new String("goose");
        if(first == second)
        {
            System.out.print("A");
            //doesnt print out b/c == compares object references
        }
        else if (second == third)
        {
            System.out.print("B");
            //doesnt print out b/c == compares object references
        }
        else if (first.equals(second))
        {
            System.out.print("C");
            //prints out because first and second have the same string content
        }
        else if (second.equals(third))
        {
            System.out.print("D");
            //doesnt print out b/c second and third dont have the same content
        }
        else
        {
            System.out.print("E");
            //doesnt print out b/c it prints out C. it fits that condition.
        }
    }
}