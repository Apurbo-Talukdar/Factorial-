import java.util.*;
class Fact
{
public static void main(String args[])
{
	int n,f=1,i;
	Scanner obj = new Scanner(System.in);

	System.out.println("Enter n value" );
	n= obj.nextInt();
	for(i=1;i<=n;i++)
	{
	f=f*i;
	}
	System.out.println("Factorial is : "+f);
	
}
}

