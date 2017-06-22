import java.io.*;
public class initial {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String inp;
	
	


	void get()throws Exception
	{
		System.out.println("Please enter your full name with a space included between your first name and surname");
		String input = br.readLine().trim();
		
		inp = input.toLowerCase();
		
	}
	void findandprint()throws Exception
	{
		System.out.println("Your initials are:");
		for(int i = 0 ; i<=inp.length()-1 ; i++)
		{
			char c = inp.charAt(i);
			
			if(i == 0)
			{
				c = Character.toUpperCase(c);
				System.out.print(c+" ");
			}
			else if(c == ' ')
			{
				char f = Character.toUpperCase(inp.charAt(i+1));
				System.out.print(f);
			}
				
		}
	}
	public static void main(String[]args)throws Exception
	{
		initial o1 = new initial();
		o1.get();
		o1.findandprint();
	}
}
