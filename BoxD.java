import java.util.Scanner;
public class BoxD
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");	
		String name=sc.next();
		System.out.println("Enter the rows and colums");
		int r=sc.nextInt();
		int c=0;
		int cc=sc.nextInt();
		if(cc>name.length()+2) 
			c=cc;
		else
			System.out.println("Cannot be done");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if((i==0&&j==0)||(i==0&&j==c-1)||(i==r-1&&j==0)||(i==r-1&&j==c-1))
				System.out.print("+");
				else if(i==0||i==r-1)
				System.out.print("-");
				else if(j==0||j==c-1)
				System.out.print("|");
				else if(i==r-3&&j==c-(name.length()+2))
				{
					for(int k=0;k<name.length();k++)
					System.out.print(name.charAt(k));
					j=j+name.length()-1;
				}
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}