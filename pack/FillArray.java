package sum.game.pack;

public class FillArray {
	public static String[][] fillArray(int count,char val)
	{
		
		int numberOfValues=AllRandomGen.numberOfValuesToBeFilled();
		String array[][]=new String[3][3];
		
		
		for(int i=0;i<3;i++)
		{
			
			int k=count+1;
			
			char p=val;
			if(i==1)
			{
				val=(char) (val+1);
			}
			else if(i==2)
			{
				val=(char) (val+2);
			}
			
			for(int j=0;j<3;j++)
			{
				
				array[i][j]=Character.toString(val)+(k++);
			}
			val=p;
		}
		
		while(numberOfValues>=0)
		{
		int position=AllRandomGen.randomPosGen();
		int value=AllRandomGen.randomPosValueGen();
		if(position>=0 && position<=2)
		{
			array[0][position]=" "+Integer.toString(value);
		}
		else if(position>=3 && position<=5)
		{
			array[1][position-3]=" "+Integer.toString(value);
		}
		else if(position>=6 && position<=8)
		{
			array[2][position-6]=" "+Integer.toString(value);
		}
		numberOfValues--;
		}
		return array;
	}
}
