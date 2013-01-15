package repeat2011;

interface Order{
	boolean lte(Object j);
}


abstract class Time implements Order{
	 private int hours;
	 private int mins;
	 
	 Time(int hours0, int mins0){
		 hours = hours0;
		 mins = mins0;
	 }
	 
	 void put(){
		 System.out.printf("%02d:%02d\n",hours,mins);
	 }
	 
	 public boolean lte(Time other){
		 return ( (other.hours*60) + other.mins ) <= ( (this.hours*60) + this.mins ); 
	 }

}