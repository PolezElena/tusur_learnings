
public class MyException extends RuntimeException 
{
	protected MyException(int min, int max, int val)
	{
		this.min = min;
		this.max = max;
		this.val = val;
	}
	
	public String toString()
	{
		return "Ошибка ввода данных. Число должно быть в пределах (" + min + ".." + max + "). Значение: " + val;
	}
	
	private int min = 0;
	private int max = 0;
	private int val = 0;
	
	public static void check(int min, int max, int val)
	{
		if((val <= min)||(val >= max))
			throw new MyException(min, max, val);
	}
}
