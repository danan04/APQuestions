public class Unit3Q4
{
    public static void main(String[]args)
    {
        int j = 3;
        int k = 2;
        int m = 5;
        if (!((j==k) && (k>m)))
        {
            System.out.print("yessirr");
        }
        else
        {
            System.out.print("no");
        }
        if ((j!=k) || (k<=m)) // this is DeMorgan Rule
        {  // !((j==k) && (k>m)) = !(j==k) || !(k>m) = (j!=k) || (k<=m)
            System.out.print("ok");
        }
        else
        {
            System.out.print("notok");
        }
    }
}