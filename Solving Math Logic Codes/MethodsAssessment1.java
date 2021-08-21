public class Main
{
	public static void main(String[] args) {
		System.out.println(printHeader());
		System.out.println("The F of n is: " + evaluateF(5));
		System.out.println(deduct());
	}
	
	public static String printHeader()
	{
	    String header = "";
	    header += "Method  Call test\n";
	    header += "with parameter values\n";
	    
	    return header;
	}
	
	public static int evaluateF(int n)
	{
	    int f = 1;
	    while(n>=1)
	    {
	        f*=n;
	        n--;
	    }
	    return f;
	}
	
	public static String deduct()
	{
	    String info = "The difference of M and N is : ";
	    int m = 8, n = 0;
	    
	    n = evaluateF(4);
	    info += (m-n);
	    
	    return info;
	}
}

/*Output:

Method  Call test
with parameter values

The F of n is: 120
The difference of M and N is : -16

*/

