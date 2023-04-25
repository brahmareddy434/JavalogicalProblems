package p1;

import java.util.StringTokenizer;

public class emailsecret {
	public static void main(String[] args) {
		String s = "brahma@gmail.com";
		StringTokenizer st = new StringTokenizer(s, "@");
		StringBuffer st1 = new StringBuffer(st.nextToken());
		StringBuffer st2 = new StringBuffer(st.nextToken());
		for (int i = 0; i < st1.length(); i++) {
			if (i != 0 && i != st1.length() - 1) {
                  st1.replace(i, i+1, "*");
			}
		}//for loop end
		System.out.println(st1);
		//for after @
		StringTokenizer stt=new StringTokenizer(new String(st2),".");
		StringBuffer st3 = new StringBuffer(stt.nextToken());
		StringBuffer st4 = new StringBuffer(stt.nextToken());
		for(int i=0;i<st3.length();i++)
		{
			if(i!=0)
				st3.replace(i, i+1, "*");
		}
		String after=new String(st1)+"@"+new String(st3)+"."+new String(st4);
		System.out.println(after);

	}
}
