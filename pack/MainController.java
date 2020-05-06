package sum.game.pack;

import java.util.ArrayList;

public class MainController {

	public static void main(String[] args) {
		ArrayList<String[][]> al=new ArrayList<String[][]>();
		System.out.println();
		char val=' ';
		for(int i=0;i<9;i++)
		{
			if(i<=2)
			{
			val='A';
			}
			else if(i>2 && i<=5)
			{
				val='D';
			}
			else if(i>5 && i<=8)
			{
				val='G';
			}
			String array[][]=FillArray.fillArray(i,val);
			al.add(array);
		}
		
		for(int b=0;b<9;b++)
		{
			String newArrayString[][]=al.get(b);
		for(int i=0;i<3;i++)
		{
			
			for(int j=0;j<3;j++)
			{
				if(j==2)
				{
					System.out.print(" "+newArrayString[i][j]+" ");
				}
				else
				{
					System.out.print(" "+newArrayString[i][j]+" | ");
				}
				
				
			}
			if(i==2)
			{
				System.out.print(" ");
			}
			else
			{
			System.out.print(" || ");
			}
			
		}
		System.out.println();
		
		if(b==2 || b==5)
		{
			System.out.println("----------------------------------------------------");
			System.out.println("----------------------------------------------------");
		}
		else
		{
			if(b==8)
			{
				System.out.println();
			}
			else
			{
				System.out.println("----------------------------------------------");
			}
		}
		}

	}

}
