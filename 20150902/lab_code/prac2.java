//package lab_code;
import java.util.Random;
//random number generator
	public class prac2
	{
		public static void main(String[] args)
		{
			Random x = new Random();
		
			//generate 2 random numbers between 0 and 3
			System.out.println(x.nextInt(4));
			System.out.println(x.nextInt(4));
		}
	}
