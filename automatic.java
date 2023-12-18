class AutomatiNumber
{
	public static void main(String args[])
	{
	int num=76,sum=0,result=0;
	sum=num*num;
	result=sum%100;
	if(result==num)
	{
	System.out.println("Automatic Number");
	}
	else
	System.out.println("Not Automatic Number");	
	}
}