	class sample

		{
	
			int a,b;	
	
			public int display(int x,int y)
	
	
			{
		
				a=x;b=y;
		
				int sum=a+b;
		
				return sum;
	
			}
	
			public String display1(String s1,String s2)
	
			{
		
				String s=s1+s2;
		
				return s;
	
			}
		
}
	class a
		
{
	
			public static void main(String args[])
	
			{
		
			sample obj=new sample();
		
			System.out.println("The sum is "+(obj.display(20,30)));
					System.out.println("The string is "+(obj.display1("hi","hello")));
				}
		}
		
		
