package p1;
import java.util.Random;
import java.util.Scanner;
public class FriendsGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		Scanner s=new Scanner(System.in);
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<4;i++)
		{
			int n=r.nextInt(10);
			sb.append(Integer.toString(n));
		}
		System.out.println("enter the 4 letter String containg 4 letters");
		String str=s.nextLine();
		int bu=0,co=0;
		for(int i=0;i<sb.length();i++)
		{
			char c=str.charAt(i);
			if(sb.charAt(i)==str.charAt(i))
			{
				bu++;
				sb.replace(i, i+1, Character.toString('c'));
			}else
			{
				for(int j=0;j<sb.length();j++)                                                                                                           
				{
					if(c==sb.charAt(j))
					{
						co++;
					}
				}
			}
		}
		StringBuffer ss=new StringBuffer("xAyB");
		for(int i=0;i<ss.length();i++)
		{
			if(i==0)
				ss.replace(i, i+1, Integer.toString(bu));
			else if(i==2)
				ss.replace(i, i+1, Integer.toString(co));
		}
		System.out.println(ss);
	}

}
