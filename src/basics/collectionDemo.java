package basics;

import java.util.ArrayList;

public class collectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<Integer>();
		int a[] = {4,5,5,5,4,6,8,6,8,9};
		//if 1st element put in al,counter incr by 1, then 2nd time it checks/compares, increases the counter by not add.
	for(int i = 0;i<a.length;i++)
	{
		int k=0;
			
		if(!al.contains(a[i]))
		{
			al.add(a[i]);
			k++;
		
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				k++;
				
			}
			
		}
		System.out.println(a[i]);
		System.out.println(k);
		if(k==1)
		{
			System.out.println(a[i]+ " is unique number" );
		}
		}	
	}
	}

}
