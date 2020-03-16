public class Unit3Q1
{
    public static void main(String[]args)
    {
        int temp;
        //temp = 30; --> DOESNT WORK this assigns the value to warm b/c temp>=51 goes to false
        temp = 51; //works b/c this assigns the value to moderate b/c temp>=51 goes to true
        //temp = 60; --> works blc this assigns the value to moderate b/c temp>=51 goes to true
        String weather;
        if (temp<=31)
        {
            weather = "cold";
        }
        else
        {
            weather = "cool";
        }
        if (temp>=51)
        {
            weather = "moderate";
        }
        else
        {
            weather = "warm";
        }
        System.out.println(weather);
    }
}