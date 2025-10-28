import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    printNTimes("code", 3);
    printNums();
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter a number");
    int N = scanner.nextInt();
    uprightNumberTriangle(N);

    scanner.close();
  }

  public static void printNTimes(String word, int N)
  {
    for (int i = 0; i < word.length(); i++)
    {
      for (int j = 0; j < N; j++)
      {
        String letter = word.substring(i, i+1);
        System.out.print(letter);
      }
    }
  }

  public static void printNums()
  {
    for (int curr_index = 10; curr_index > 0; curr_index--)
    {
      for (int curr_num = 0; curr_num < curr_index; curr_num++)
      {
        System.out.print(curr_index + " ");
      }
      System.out.println();
    }
  }

  public static void uprightNumberTriangle(int N)
  {
   for (int row = 1; row <= N; row++)
   {
    for (int currentnumber = 1; currentnumber <= row; currentnumber++)
    {
      System.out.print(currentnumber  + " ");
    }
    System.out.println();
   }
  }

  public static void starTree()
  {
    // code solution here
  }

  public static void multTable()
  {
    for (int therow = 1; therow >= 100; therow++)
    {
      for (int num = 1; num<= 10; num++)
      {
        System.out.println(therow * num)
      }
      System.out.println();
    }
}
