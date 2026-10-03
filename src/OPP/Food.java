package OPP;

public class Food {

	String name;
	
	Food(String name){
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		Food food1 = new Food("Pizza");
		Food food2 = new Food("Biryani");
		Food food3 = new Food("Shawarma");
		
		Food[] refrigerator = new Food[3];
		
		System.out.println();
		
		/*System.out.println(food1.name);
		System.out.println(food2.name);
		System.out.println(food3.name);*/
	}

}
