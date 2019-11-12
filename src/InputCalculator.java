import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long average = 0;
        int counter = 0;

        while(true){
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                counter = counter + 1;
                int number = scanner.nextInt();
                sum += number;
                average =  Math.round((double)sum/counter);

            }else{
                System.out.println("SUM = " + sum + " AVG = " + average );
                break;
            }
            scanner.nextLine(); //handle end of line enter key
        }
        scanner.close();
    }
}
