import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mahesh
 *
 */
public class CountTriplets {

	/**
	 * 
	 */
	public CountTriplets() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			int count=0,i=2;
			while(i<n)
			{
				int j=0,k=i-1;
				while(j<k && k<i)
				{
					if(a[j]+a[k]<a[i])
					{
						j++;
					}
					else if(a[j]+a[k]>a[i])
					{
						k--;
					}
					else if(a[j]+a[k]==a[i])
					{
						System.out.println("Its a triplet");
						System.out.println("a[j]:="+a[j]+" a[k]:="+a[k]+" a[i]:="+a[i]);
						count++;
						j++;
						k--;						
					}
				}
				i++;
			}
			if(count>0)
			{
				System.out.println(count);
			}
			else
			{
				System.out.println(-1);
			}
		}
		sc.close();
	}
}
