package repeat2011;
/*
 * Code covers Q3 part II
 */
import java.util.HashSet;
import java.util.Scanner;
public class QuestionThree{
	
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		HashSet <String> occurrence = new HashSet<>();
		String input;
		do{
			input = scanner.next();
			if(occurrence.add(input)){
				System.out.println("Success, First Occurence");
			}else
				System.out.println("Success, but Occurred Previously");
		}while(input.equals("Stop"));
		scanner.close();
	}
}
