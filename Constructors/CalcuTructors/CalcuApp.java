package calculator;

public class CalcuApp {
	int x, y;

	public CalcuApp() 
	{
		x = 0;
		y = 0;
	}

	public CalcuApp(int i, int j) 
	{
		x = i;
		y = j;
	}
	protected int sum() 
	{
		return x+y;
	}
	protected int diff()
	{
		return x-y;
	}
	protected int quot() 
	{
		return x/y;
	}
	protected int prod() 
	{
		return x*y;
	}
}
