package spring;

public class sortBinary 
{
	public static void main(String[] args)
	{
		int[] B,C;
		int[] A = {6,0,2,0,1,3,4,6,1,3,2};
		B = new int[50];
		C = new int[50];
		
		for(int i=0; i<C.length ; i++)
			C[i] = 0;
		
		for(int j=0 ; j<A.length ; j++)
			C[A[j]]++;
		
		for(int i=0; i<C.length; i++)
			C[i] = C[i] + C[i-1];
		
		for(int j=A.length ; j>0 ; j--)
		{
			B[C[A[j]]] = A[j];
			C[A[j]] = C[A[j]] - 1;
		}
	}
}