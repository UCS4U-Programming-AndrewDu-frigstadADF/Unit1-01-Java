import java.util.Scanner;

class LoggingCompany {
 public static void main(String[] args) {
   Scanner myObj = new Scanner(System.in);
   System.out.println("Choose either 0.25, 0.5 or 1 meter logs");
   String LogLength = myObj.nextLine();
   float LogLengthInt = Float.parseFloat (LogLength);
   float LogNum = 1100/(20*LogLengthInt);
   System.out.println("You can fit The following number of logs on the logging truck: " + LogNum);
 }
}
