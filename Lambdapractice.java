package p1;

import java.util.ArrayList;
import java.util.List;

import p2.Inter;

public abstract class Lambdapractice implements Inter{
	
	static List<String> ram(List<String> ll)
	{
		List<String> stt=new ArrayList<String>();
		Inter<String> ch=s->s.length()==4;
		for (String s: ll) {
			try {
				if (ch.king(s)) {
				    stt.add(s);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		return stt;
		return stt;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li=List.of("king","brahma reddy");
		System.out.println(li);
		System.out.println(Lambdapractice.ram(li));
		
		

	}

}
