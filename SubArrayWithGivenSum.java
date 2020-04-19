import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mahesh
 *
 */
public class SubArrayWithGivenSum {

	/**
	 * 
	 */
	public SubArrayWithGivenSum() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{			
			int N=sc.nextInt();
			int Sum=sc.nextInt();
			int a[]=new int[N];
			int new_sum=0;
			for(int i=0;i<N;i++)
			{
				a[i]=sc.nextInt();
			} 
			int start_ind=0,end_ind=0;
			while(new_sum!=Sum && end_ind<N)
			{
				while(new_sum<Sum && end_ind<N) 
				{					
					new_sum=new_sum+a[end_ind];
					end_ind++;					
				}
				while(new_sum>Sum && start_ind<end_ind)
				{
					new_sum=new_sum-a[start_ind];
					start_ind++;					
				}				
			}			
			if(new_sum==Sum)
			{
				System.out.println((start_ind+1)+" "+end_ind);
			}
			else
			{
				System.out.println(-1);
			}			
		}
		sc.close();
	}
}
