public class DateFormatter {

public static void printAmerican(String day, int date, String month, int year) {
	System.out.println(day + ", " + month + " " + date + "," + year);
} 

public static void printEuropean(String day, int date, String month, int year){ 
	System.out.println(day + " " + date + " " + month + " " + year); 
	
} 

public static void main (String[] args){
	printAmerican("Monday", 22, "July", 2019);
	printEuropean("Monday", 22, "July", 2019);
	
}
}
