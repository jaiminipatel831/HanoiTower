import java.util.Scanner;

public class hanoi 
{
	private tower[] thetowers;
	public hanoi()
	{
		thetowers = new tower[3];
		thetowers[0] = new tower(3);
		thetowers[1] = new tower(0);
		thetowers[2] = new tower(0);
	}
	public void play()
	{
		Scanner input = new Scanner(System.in);
		int count = 0;
		while(this.thetowers[2].isfull())
		{
			this.display();
			System.out.print("source");
			int start = input.nextInt();
			System.out.print("desti");
			int end = input.nextInt();
			if(this.move(start, end));
			{
				count++;
			}
			//break;
		}
		this.display();
		System.out.println("it takes" + count + "moves");
	}
	public boolean move(int start, int end)
	{
		if(start == end || start < 0 || end < 0 || start > 2 || end > 2)
		{
			return false;
			
		}
		else
		{
			disk temp = this.thetowers[start].pop();
			if(temp == null)
			{
				return false;
			}
			if(this.thetowers[end].push(temp));
			{
				return true;
			}
			else
			{
				this.thetowers[start].push(temp);
				return false;
			}
		}
	}
	private String getparString(int count)
	{
		String s = "";
		for(int i = 0; i < count; i++)
		{
			s = s + " ";
		}
		return s;
	}
	public void display()
	{
		String base = "___________";
		disk[] currentdisks;
		disk temp;
	}
}
