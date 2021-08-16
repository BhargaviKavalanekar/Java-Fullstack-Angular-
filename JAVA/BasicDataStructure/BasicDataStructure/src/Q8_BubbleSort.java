
public class Q8_BubbleSort {

	public class bubblesort {
		
		void Sort(int[] a) {
			
			int n=a.length;
			int temp=0;
			
			for(int i=0;i<n;i++)
			{
				for(int j=1;j<(n-1);j++)
				{
					if(a[j-1]>a[j]) // a[0]>a[1]
					{
						temp=a[j-1];
						a[j-1]=a[j];
						a[j]=temp;
					}
				}
			}
		}

	public void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47}; // array is given in the question
		
        System.out.println("Array before Bubble Sort");
        
        for(int i=0;i<a.length;i++)
        {
       	 System.out.println(a[i]+"");
        }
        
        Sort(a);
        
        System.out.println("Array after Bubble Sort");
        
        for(int i=0;i<a.length;i++)
        {
       	 System.out.println(a[i]+"");
        }

	}
	}
}

