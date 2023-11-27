package cs141.jlhenry2;
import java.util.ArrayList;

public class Arraysssss {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add(new String("Scooby"));
		names.add(new String("Shaggy"));
		names.add(new String("Velma"));
		names.add(new String("Fred"));
		names.add(new String("Daphne"));
		//We created an array list of names and we added new objects to it 
		
		names.add(new String("Black Knight"));
		
		String fakeMonster = names.set(5, "Mr.Wickles");
		
		System.out.println(fakeMonster);
		
		boolean arrested = names.remove("Mr.Wickles");
		
		names.add(new String ("Ghost of Redbeard"));


	}

}
