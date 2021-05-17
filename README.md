# Box.java
Here is a program to get a box using - as rows and | as coloums and Printing the user given name at the second last row with leaving two spaces from last.
So the output will be like this:

![image](https://user-images.githubusercontent.com/84003405/118488519-704c4e80-b739-11eb-8b7d-9b18973a53a2.png)

Firstly, the user has to give the input for the name.
Next, I have declared r for rows and c for columns with fixed size.

    int r=8;
		int c=22;
    
 So, By using below code we can get the desired output.
 
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

    
