package sum.game.pack;

import java.util.Random;

public class AllRandomGen {
	public static int randomPosGen()
	{
		Random rand=new Random();
		int n=rand.nextInt(9);
		return n+1;
	}
	public static int randomPosValueGen()
	{
		return randomPosGen();
	}
	public static int numberOfValuesToBeFilled()
	{
		Random rand=new Random();
		int n=rand.nextInt(3);
		return n+3;
	}
}
