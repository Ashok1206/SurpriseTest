package intervieQues;

import java.util.Scanner;

public class FibboPrime {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the range :");
		int n = in.nextInt();
		int n1=0,n2=1,n3=0;
		System.out.print(n1+" "+n2+" ");
		int i=0;
		while(i<n)
		{
			
			n3=n1+n2;
			int flag =0;
			for(int j =2;j<n3/2;j++)
			{
				if(n3%j==0)
				{
					flag=1;
				}
			}
			if(flag==0 && n3>1)
			{
			System.out.print(n3+" ");
			i++;
			}
			
			n1=n2;
			n2=n3;
		
		}
		
	}

}
