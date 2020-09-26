public class KLists
{
private int arrsize;
	public double [] mergeKLists (double[][] outerArray)
	{
		double [] result = new double[arrsize];

		//pull out all values into one arrray
		int index=0;
		for( int r =0; r<outerArray.length; r++)
		{
			for (int c =0; c<outerArray[r].length;c++)
			{
			result[index]= outerArray[r][c];
			index++;
			}
		}
		//sort
		for (int  i=0; i<result.length-1;i++)
		{
			for (int j =0; j<result.length-i-1;j++)
			{
				if (result[j]>result[j+1])
				{
					double temp = result[j];
					result[j] = result[j+1];
					result[j+1] = temp;
				}
			}
		}

		return result;
	}

	private int arrSize(double[][] outerArray)
	{
		for(int q =0; q<outerArray.length;q++)
		{
			for (int w =0; w<outerArray[q].length;w++)
			{
				arrsize++;
			}
		}	
		return arrsize;	
	}

	public static void main(String[] args)
	{
		double [][] outerArray = {{1.1,4.4,5.5},{1.1,3.3,4.4},{2.2,6.6}};
		KLists list = new KLists();
		int size =list.arrSize(outerArray);	
		System.out.println(size);	
		double [] output = new double[size];
		output = list.mergeKLists(outerArray);
		System.out.print('[');
		for (int i =0; i<output.length;i++)
		{
			System.out.print(output[i]);
			if(i<output.length-1)
			{
				System.out.print(", ");
			}
		}
		System.out.print(']');
	}
}