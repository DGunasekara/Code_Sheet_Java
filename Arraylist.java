import java.util.ArrayList;

public class Arraylist{

	public static void main(String[] args){
	
		ArrayList<String> name = new ArrayList<String>();

		name.add("hey");
		name.add("You");
		name.add("are");
		name.add("my");
		name.add("love");

		for(int i=0;i<name.size();i++){

			System.out.println(name.get(i));

		}
	}

}
