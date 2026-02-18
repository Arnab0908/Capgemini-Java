package m1_tasks;

import java.util.ArrayList;
import java.util.List;

class Dish {
	String dishName;
	public Dish(String dishName) {
	
		this.dishName=dishName;
	}
	public String getdishName() {
		return dishName;
	}
	public void setdishName(String dishName) {
		this.dishName=dishName;
	}
	public String toString() {
		return "Dish{dishName=" + dishName +"}";
	}

}
class DishTest{
	public List<Dish> addYummytoName(List<Dish>list){
		
		List<Dish> dishList=new ArrayList<>();
		for(Dish d:list) {
			Dish dish=new Dish("Yummy"+d.getdishName());
			dishList.add(dish);
		}
		return dishList;
		
	}

public long count(List<Dish>list , String s) {
	long c=0;
	for(Dish d: list) {
		if(d.getdishName().contains(s)) {
			c=c+1;
		}
	}return c;
	
}
}

public class All_spanish {
	public static void main(String[] args) {
		DishTest dt=new DishTest();
		List<Dish>list=new ArrayList<Dish>();
		list.add(new Dish("Gazpacho"));
		list.add(new Dish("Tomato"));
		list.add(new Dish("Tortilla"));
		list.add(new Dish("Gazpacho"));
	System.out.println(dt.addYummytoName(list));
		System.out.println(dt.count(list, "5"));
		
		
	}
}










