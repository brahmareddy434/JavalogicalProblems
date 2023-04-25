package p1;

import java.util.Scanner;

public class MaximumPath {
	static int maximumPath(int n,int[][] ar)
	{
		int co=0 ,count=0,k=0,d;
		
		for(int i=0;i<ar.length;i++)
		{
			if(k<ar[0][i])
				k=ar[0][i];
		}
		d=k;
		count=k;
		for(int r=0;r<ar.length-1;r++)
		{
			for(int c=0;c<ar.length;c++)
			{
				d=k+ar[r+1][c];
				if(d>co)
				{
				co=d;
				}
			}
			if(co>count)
			{
				count=co;
				k=count;
			}
				
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=3;
		int[][] ar=new int[n][n];
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				System.out.println("enter the number");
				ar[i][j]=s.nextInt();
			}
			
		}
		 
		int ans=MaximumPath.maximumPath(n, ar);
		
		System.out.println(ans);

	}

}
