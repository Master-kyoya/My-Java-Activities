public class Main
{
	public static void main(String[] args) {
		System.out.println(printFigure());
	}
	public static String printFigure()
	{
	    String figure = "";
	    int r, c, j, add;
	    r = 1;
	    add = 1;
	    
	    while(r <= 5 )
	    {
	        if(r != 1){
	            for(j = 1 ; j < r; j++)
	            {
	                figure += (" "); //one blank space
	            }
	        }
	        for(c = 1 ; c >= add; c++)
	        {
	            figure += "@";
	        }
	        figure +="\n";
	        add = add + 2;
	        r++;
	    }
	    return figure;
	}
}

/*OUTPUT
@@@@@@@@@
 @@@@@@@
  @@@@@
   @@@
    @
*/


