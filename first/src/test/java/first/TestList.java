package first;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestList {
 public static void main (String args[]) {
	 Map<Integer,String> mymap = new HashMap<Integer, String>();
	 
	 mymap.put(0, "a");
	 mymap.put(1, "b");
	 mymap.put(2, "c");
	 mymap.put(3, "b");
	 
	 for(Integer key:mymap.keySet()) {
		 System.out.println(key);
		 System.out.println(mymap.get(key));
	 }
 }
}
