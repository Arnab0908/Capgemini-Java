package m1_tasks;
//input---> "ghuigkig" output-->3
//


class StringPlay{
	 int convert;
	 int max;
	 public StringPlay() {//default constructor
		 
	 }
}
class StringMethods{
	public int convertToint(StringPlay sp , String str) {
		
		int x=Integer.parseInt(str);
		sp.convert=x;
		return sp.convert;
	}
	
public int getMax(StringPlay sp , String str , char ch) {
	
	char[] s=str.toCharArray();
	int total=0;
	for(int i=0;i<s.length;i++) {
		if(s[i]==ch)
			total+=1;
	}
	sp.max=total;
	return total;
		}
	

}


