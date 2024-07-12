import java.util.*;
class Average
{
public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     int a,b,c,largest,lcm=0,i;
      System.out.println("enter the value of n");
      n=sc.nextInt();
	for(i=1;i<=n;i++)
       {
       System.out.println("enter the num");
	num=sc.nextInt();
	if(num==0)
	 break;
	else
	  sum=sum+num;
	  count++;
	}
	avg=sum/count;