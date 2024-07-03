import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
	Scanner s = new Scanner (System.in);



	  System.out.println ("Enter Range");
	int range = s.nextInt ();

	for (int i = 3; i <= range; i++)
	  {

		for (int j = i + 1; j <= range; j++)
		  {

			for (int k = j + 1; k <= range; k++)
			  {

				if (i * i + j * j == k * k
					&& arecoprime (i, j)
					&& arecoprime (i, k) && arecoprime (j, k))
				  {

					System.out.println (i + " " + j + " " + k);
				  }

			  }

		  }

	  }

  }

  public static boolean arecoprime (int a, int b)
  {

	return gcd (a, b) == 1;
  }

  public static int gcd (int a, int b)
  {

	while (b != 0)
	  {

		int temp = b;
		b = a % b;

		a = temp;
	  }
	return a;
  }

}
