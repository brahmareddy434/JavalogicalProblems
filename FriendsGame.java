package p1;
import java.util.Random;
/*
 You are playing the Bulls and Cows game with your friend.

You write down a secret number and ask your friend to guess what the number is. When your friend makes a guess, you provide a hint with the following info:

The number of "bulls", which are digits in the guess that are in the correct position.
The number of "cows", which are digits in the guess that are in your secret number but are located in the wrong position. Specifically, the non-bull digits in the guess that could be rearranged such that they become bulls.
Given the secret number secret and your friend's guess guess, return the hint for your friend's guess.

The hint should be formatted as "xAyB", where x is the number of bulls and y is the number of cows. Note that both secret and guess may contain duplicate digits.

 

Example 1:

Input: secret = "1807", guess = "7810"
Output: "1A3B"
Explanation: Bulls are connected with a '|' and cows are underlined:
"1807"
  |
"7810"
Example 2:

Input: secret = "1123", guess = "0111"
Output: "1A1B"
Explanation: Bulls are connected with a '|' and cows are underlined:
"1123"        "1123"
  |      or     |
"0111"        "0111"
Note that only one of the two unmatched 1s is counted as a cow since the non-bull digits can only be rearranged to allow one 1 to be a bull.
 

Constraints:

1 <= secret.length, guess.length <= 1000
secret.length == guess.length
secret and guess consist of digits only.
 */
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
		System.out.println(sb);
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
