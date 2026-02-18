package m1_tasks;

import java.util.ArrayList;
import java.util.List;

class Book{
	String bookName;
	int bookCost;
	public Book(String bookName, int bookCost) {
		this.bookName=bookName;
		this.bookCost=bookCost;}
	
		public String getbookName() {
			return bookName;
		}
		public void setbookName() {
			this.bookName=bookName;
		}public int getbookCost() {
			return bookCost;
		}public void setbookCost() {
			this.bookCost=bookCost;
		}
		
	}
class BookImplementation {
	public String getNameofBooks(List<Book>books) {
		
		String s="";
		for(Book b :books) {
			s=s+b.getbookName()+"  "+b.getbookCost();
			
		}
		return s;
		
	}
	
	public int sumCostofAllBooks(List<Book>books) {
		
		int res=0;
		for(Book b:books) {
			res=res+b.getbookCost();
			
		}return res;
		
		
	}
	public int getmax(List<Book>books) {
		int max=0;
		for(Book b : books) {
			if(b.getbookCost()>max)
				max=b.getbookCost();
		}return max;	
	}
	
}
	
public class Source1 {
	public static void main(String[] args) {
		List<Book>book=new ArrayList<>();
		book.add(new Book("Sapiens",500));
		book.add(new Book("Chander Pahar",1000));
		book.add(new Book("Thakumar jhuli",1200));
		BookImplementation obj =new BookImplementation() ;
		
		System.out.println(obj.getNameofBooks(book));
		System.out.println(obj.sumCostofAllBooks(book));
		System.out.println(obj.getmax(book));
		
		
		
		
	}

}
