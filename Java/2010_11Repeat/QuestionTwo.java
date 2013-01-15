package repeat2011;

class QuestionTwo{
	//Main constructed to test the "Bag" class
	public static void main(String [] args){
		Bag <String> testBag = new Bag<>();
		
		for(int i = 0; i < 200; i++){
			//Alternates between adding two strings
			if(i%2 == 0)
				testBag.add("String");
			else
				testBag.add("stttring");
		}
		System.out.println("Frequency of String: " +testBag.freq("String"));
		System.out.println("Frequency of stttring: " +testBag.freq("stttring"));
	}
}
class Bag<T>{
	@SuppressWarnings("unchecked")
	private T [] collection = (T[]) new Object[100];
	private int tracker = 0;
	Bag(){
		//Default no args constructor
	}
	
	void add(T x){
		if(tracker == collection.length)
			expand();
		collection[tracker] = x;
		tracker++;
	}
	
	int freq(T x){
		int counter = 0;
		for(int i = 0; i < tracker; i++){
			if(collection[i].equals(x))
				counter++;
		}
		return counter;
	}
	
	private void expand(){
		@SuppressWarnings("unchecked")
		T [] temp = (T[]) new Object[collection.length*2];
		for(int i = 0; i < collection.length; i++){
			temp[i] = collection[i];
		}
		collection = temp;
	}
	
}