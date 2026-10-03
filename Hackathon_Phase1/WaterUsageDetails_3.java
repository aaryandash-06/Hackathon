package Hackathon_Phase1;
import java.util.Scanner;
public class WaterUsageDetails_3{

    public static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter morning water usage: ");
        int morning = sc.nextInt();

        System.out.print("Enter evening water usage: ");
        int evening = sc.nextInt();

        int totalConsumption = calculateTotal(morning, evening);
        System.out.println("The total water consumption is: " + totalConsumption);

        sc.close();
    }
}
