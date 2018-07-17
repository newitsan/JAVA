	class sample
	
		{
		
			int x,y;
			
			public int display (int a,int b)
			
			{
				
				x=a;y=b;
					
				int tot=x+y;
				
				return tot;
			
			}
	
			
			public String display1 (String s1,String s2)
			
			{
				
				String c=s1+s2;
				
				return c;
			
			}
	
		}
	
	class arith

		{
			
		public static void main(String args[])
			
			{
				
				sample obj=new sample();
//				
				int tot= obj.display (10,10);
//				
				String c= obj.display1 ("android","google");
						System.out.println(obj.display(10,10));
							System.out.println(obj.display1("android","google"));	
						}
	
		}

