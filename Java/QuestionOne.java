public class QuestionOne{
  
	static <T extends Printable> void print(T [] t){
		if(t.length != 0){
			for(int i = 0; i < t.length; i++){
				if(t[i] != null)
					t[i].put();
			}
		}
	}
}

interface Printable{
	void put();
}
class Date implements Printable{
		private int day, month, year;
		Date(){}
		void get(){
			//Do not code
		}
		boolean lte(Date d){
			return true;
			//Do not code
		}
		
		public void put() {
			System.out.println(day + "/"+ month + "/" + year);
		}
}
