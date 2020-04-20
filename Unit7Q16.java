public class Unit7Q16
{
        public static void main(String[]args)
    {
        int[] arr = {10, 8, 3, 4};
        //insertionSort(arr);
        System.out.println(insertionSort(arr));
    }
    
    public static int insertionSort(int[] elements)
    {
        int c = 0;
        for (int j = 1; j < elements.length; j++)
        {
            int temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
            {
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;   // line 10
                c++;
            }
            elements[possibleIndex] = temp;
        }
        
        return c;
    }
}
/*prints out 5 --> the while loop iterates once each time array element shifts to right
   for each array, 10 shifts to right when 8 is inserted before it. then again when 3 
   is inserted, then again when 4 is inserted. 5shifts occur*/