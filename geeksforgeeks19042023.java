package p1;

public class geeksforgeeks19042023 {
	public static void main(String[] args) {
		int n = 3, r = 1,count=0;
		StringBuffer s = new StringBuffer("10010");
		for(int i=1;i<n-1;i++)
		{
			char c=s.charAt(i);
			if(c=='1')
			{
				
			}
		}//for loop

		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='1')
				count++;
		}
		if(count==n)
		{
			System.out.println(1);
		}else
			System.out.println(0);
	}

}
