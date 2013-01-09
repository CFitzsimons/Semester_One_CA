import java.util.HashMap;
import java.util.Map;

class Bag{
	private Map <String, Integer> map;
	Bag(){
		map = new HashMap<String, Integer>();
		//Default no args constructor
	}
	void add(String w){
		
		if(map.containsKey(w))
			map.put(w, map.get(w)+1);
		else
			map.put(w, 0);
	}
	int frequency(String w){
		if(!map.containsKey(w))
			return 0;
		
		return map.get(w) + 1;
	}
	boolean remove(String w){
		if(!map.containsKey(w)){
			return false;
		}else if(map.get(w) == 1){
			map.remove(w);
		}else
			map.put(w, map.get(w)-1);
		return true;
	}
}

//Class to test the implementation
class QuestionTwo{
	public static void main(String [] args){
		Bag bag = new Bag();
		bag.add("Hello");
		bag.add("Hello");
		bag.add("Hello");
		bag.add("test");
		System.out.println("Frequency of Hello"+ bag.frequency("Hello"));
		bag.remove("Hello");
		bag.remove("Hello");
		System.out.println("Frequency of Hello"+ bag.frequency("Hello"));
		
	}
}