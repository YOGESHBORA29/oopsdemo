
/* Java program to perform addition of 2 Time
 * t1 --> 12 : 45 :55
 * t2 --> 10 : 30 :30
 *
 * t1 + t2
 *   if sec> 60 .. mins should be incremented & sec -60,,
 *   if min> 60  ... hrs should be incremented & min -60
 */

public class Add_Time {
int hrs,min,sec;
 Add_Time()
{hrs=min=sec=0;
	}
 Add_Time(int h,int m,int s)
{hrs=h;
min=m;
sec=s;

	}

void Add(Add_Time t)
{
	this.hrs+=t.hrs;
	this.min+=t.min;
	this.sec+=t.sec;
if(this.sec>60)
	{this.min=this.min+1;
this.sec=this.sec-60;
}
if(this.min>60)
{
	this.hrs=this.hrs+1;
	this.min=this.min-60;
	}
	
}

void print()
{
	System.out.println(this.hrs+":"+this.min+":"+this.sec);
	}
}






