import java.util.*;

	class sample
		{
			TreeSet<String> a1=new TreeSet<String>();

			sample()
				{
					a1.add("J");
					a1.add("A");
					a1.add("V");
					a1.add("A");
					
				

			for(String s:a1)
				{
					System.out.println(""+s);
				}

			/*Iterator itr=a1.iterator();

			while(itr.hasNext())
				{
					System.out.println(""+itr.next());
				}*/
				}
		}
	class treeset
		{
			public static void main(String args[])
				{
				sample obj=new sample();
				}
		}
