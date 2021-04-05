import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        double mininyr=60*24*365;
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");
        double min = input.nextDouble();
        long years = (long)(min/mininyr);
        int days = (int)(min/60/24)%365;
        System.out.println((int)min + " minutes in approximately " + years + " years and " + days + " days ");
    }
}
