package Date;

public class Date {
	
	int dd;
	int mm;
	int yy;
	
	int[] month= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	String[] days = {"Sunday","Monday","Tuseday","Wednesday","Thursday","Friday","Sataurday"};
	
	public Date(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
		if(yy%4==0&&yy%100!=0||yy%400==0)
			month[2]=29;
	}
	
	public String toString()
	{
		return dd+"/"+mm+"/"+yy;
	}
	
	public int noOfDays()
	{
		int y = yy-1;
		int days = y*365+y/400+y/4-y/100;
		for(int i=1;i<mm;i++)
		{
			days=days+month[i];
		}
		days=days+dd;
		
		return days;
	}
	
	public String day()
	{
		return days[noOfDays()%7];
	}

}
