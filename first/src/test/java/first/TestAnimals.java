package first;

import java.util.HashSet;
import java.util.Set;

import com.google.gson.Gson;

import demo.Animals;
import demo.Shelter;

public class TestAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shelter shelter1 = new Shelter("home1", 200, "bangalore");
		Shelter shelter2 = new Shelter("home2", 100, "mumbai");
		Shelter shelter3 = new Shelter("home3", 150, "noida");
		
		Animals animal1 = new Animals("cujo", "dog", 4, 12, true, shelter1);
		Animals animal2 = new Animals("juno", "cat", 3, 8, true, shelter2);
		Animals animal3 = new Animals("alpha", "chimpanzee", 12, 30, false, shelter3);
		Animals animal4 = new Animals("beta", "sea turtle", 50, 120, true, shelter2);
	
		Set<Animals> newset = new HashSet<Animals>();
		newset.add(animal1);
		newset.add(animal2);
		newset.add(animal3);
		newset.add(animal4);
		
		
		for(Animals animal: newset) {
			System.out.println(animal.getName());
		}

		
		Gson gson = new Gson(); // Or use new GsonBuilder().create();
	//	String p = gson.toJson(animal1);
		//String p1 = gson.toJson(animal2);
		
	//System.out.println(p);
	//System.out.println(p1);
		System.out.println(gson.toJson(newset));

	}

}
