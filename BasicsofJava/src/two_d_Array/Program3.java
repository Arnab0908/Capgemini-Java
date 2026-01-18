package two_d_Array;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]a= {{7,9},{4,2}};
		int[][]b= {{1,2},{3,1}};
		int[][]res=sum(a,b);
		print(res);
	}public static int[][] sum(int a[][],int b[][]){
		int row=a.length;
		int col=a[0].length;
		int[][]res=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				res[i][j]=a[i][j]+b[i][j];
			}
		}return res;
	}
		public static void print(int[][]arr) {
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+" ");
				}
			
				System.out.println();
		}
		}}
	


	
	

	
	
	

