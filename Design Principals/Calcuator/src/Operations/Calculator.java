package Opearations;
import java.util.*;
public class Calculator {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		try
		{
		int a=sc.nextInt();
		int b=sc.nextInt();
		Operations h=new Operations();
		int add=h.add(a, b);
		int sub=h.sub(a, b);
		int div=h.div(a, b);
		int mul=h.mul(a, b);
		System.out.println(add);
		System.out.println(sub);
		System.out.println(div);
		System.out.println(mul);
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		
		
		
		
	}

}
