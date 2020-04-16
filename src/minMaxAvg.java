import java.util.Scanner;

public class minMaxAvg {
    public static void main(String[] args)
    {
        int min = 0;
        int max = 0;
        int sum = 0;
        double avg = 0;
        int score;
        int counter = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a test score. Type -1 to quit.");
        score = sc.nextInt();
        sc.nextLine();

        while (score != -1)
        {
            if(score > 0) {
                sum = sum + score;
                counter++;
                min = score;
                if (score < min) {
                    min = score;
                } else if (score > max) {
                    max = score;
                }
            }
            System.out.println("Enter a test score. Type -1 to quit.");
            score = sc.nextInt();
            sc.nextLine();
        }

        if (counter > 0)
            avg = sum / counter;

        System.out.println("Sum: "+ sum + " Count: " + counter + " Min: " + min + " Max: " + max + " Avg: " + avg);
    }
}
