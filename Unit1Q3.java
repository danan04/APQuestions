public class Unit1Q3
{
  public static void main(String[]args)
  {
      //double fact1 = 1/2;
      //double fact2 = 3*4;
      //wrong because 1 and 2 are int types --> division should return int.
      //when 1/2 --> 0. This is stored in the double fact1 as 0.0. 
      double fact1 = 1.0/2.0;
      //cast numerator and denominator to double --> 0.5
      double fact2 = 3.0*4.0;
      double product = fact1*fact2;
      System.out.println(product);
      //answer should print out 6.0
    }
}