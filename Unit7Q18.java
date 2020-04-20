public class Unit7Q18
{
    public static void main(String[]args)
    {
        int[] arr = {30, 40, 10, 50, 20};
        //selectionSort(arr);
        System.out.println(selectionSort(arr));
    }
    public static int selectionSort(int[] elements)
    {
        int c = 0;
        for (int j = 0; j < elements.length - 1; j++)
        {
            int minIndex = j;
            for (int k = j + 1; k < elements.length; k++)
            {
                if (elements[k] < elements[minIndex])
                {
                    minIndex = k;
                    
                }
            }
            if (j != minIndex)
            {
                int temp = elements[j];
                elements[j] = elements[minIndex];
                elements[minIndex] = temp;   // line 19
                c++;
            }
        }
        return c;
    }
}
/*30 and 10 are swapped. Then 40 and 20 are swapped. then 50 and 40 are swapped --> 3 shifts occur
