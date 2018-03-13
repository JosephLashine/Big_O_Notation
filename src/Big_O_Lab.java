
public class Big_O_Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int n=1000;
		int i;
		int j;
		int k;
		
		for(i= 0; i < n; i++)
			for(j = 0; j < i * i; j++)
				for(k = 0; k < j; k++)
					sum++;



		System.out.println(sum);
		
		
		
		
		
		
	}
}
