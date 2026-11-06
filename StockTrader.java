import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class StockTrader {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("tiny.txt"));
        String symbol = in.next();
        int n = in.nextInt();

    int [] years = new int[n];
    int [] months = new int[n];
    double [] price = new double[n];
    loadData(in, years, months, price);
    printData(years, months, price);
    }

public static void loadData(Scanner in, int[] years, int[] months, double [] price){
for (int i = 0; i < years.length; i++){
	years[i] = in.nextInt();
	months[i] = in.nextInt();
	price[i] = in.nextDouble();
}
printData(years, months, price);
}
public static String monthName(int month){
	String[] names = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	return names[month - 1];
}
public static void printData(int[] years, int[] months, double[] prices) {
for(int i = 0; i < months.length; i++){
	System.out.print(monthName(months[i]) + " " + years[i] + ": $");
	System.out.printf("%.2f%n", prices[i]);
}
}
public static int indexOfLowest(double[] prices) {
	int lowestNumber = 0;
	 for (int i = 0; i < prices.length; i++){
		 if (prices[i] < prices[0]){
public static int indexOfHighest(double[] prices) {

}
