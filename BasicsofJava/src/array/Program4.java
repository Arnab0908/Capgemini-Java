package array;

public class Program4 {

	public static void main(String[] args) {
		int[] a= {1,4,6};
		//refvar[index]
		System.out.println(a.length);
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
		for(int i=0;i<a.length;i++){
		System.out.println(a[i]);
		}
		a[0]=10;
		a[1]=100;
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		

	

}
}
