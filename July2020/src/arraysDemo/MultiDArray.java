package arraysDemo;

public class MultiDArray {
	
	public static void main(String[] args) {
		
		
		//dataType arrayRefVar[][]; 
		// int a[][];
		
		int a[][] = new int [3][3];
		
		a[0][0] = 10;
		a[0][1] = 102;
		a[0][2] = 104;
		a[1][0] = 105;
		a[1][1] = 106;
		a[1][2] = 170;
		a[2][0] = 180;
		a[2][1] = 110;
		a[2][2] = 120;
		
		
		for(int i = 0 ;i < 3 ; i ++)  //row travel
		{
			for(int j=0 ; j <3 ;j ++) // col
			{
				System.out.println("print mul array--> "+a[i][j]);
			}
		}
		
	}

}
