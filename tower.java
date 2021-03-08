
public class tower 
{
	disk[] thedisks;
	int currenttop;
	public tower(int nodisks)
	{
		currenttop = 3;
		thedisks = new disk[3];
		int currentsize = 1;
		for(int i = 0; i < nodisks; i++) 
		{
			thedisks[i] = new disk(currentsize);
			currentsize++;
			currenttop--;
		}
		
	}
	public boolean isfull()
	{
		return currenttop == 0;
	}
	 public disk pop()
	 {
		 if(currenttop == 3)
		 {
			 return null;
		 }
		 else
		 {
			 disk temp = this.thedisks[currenttop];
			 
			 this.thedisks[currenttop] = null;
			 currenttop++;
			 return temp;
		 }
	 }
	 
	 public disk peek()
	 {
		 if(currenttop == 3)
		 {
			 return null;
		 }
		 else
		 {
			 return this.thedisks[currenttop];
		 } 
	 }
	 
	 public boolean push(disk d)
	 {
		 if(currenttop == 3)
		 {
			 currenttop--;
			 this.thedisks[currenttop] = d;
		return true;
		 }
		 else
		 {
			 if(d.getsize() < this.thedisks[currenttop].getsize())
			 {
				 currenttop--;
				 this.thedisks[currenttop] = d;
				 return true;
			 }
			 else
			 {
				 return false;
			 }
		 }
	 }
	public disk[] getdisks()
	{
		return this.thedisks;
	}
	
}
