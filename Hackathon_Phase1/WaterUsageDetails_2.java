package Hackathon_Phase1;
import java.util.Scanner;
public class WaterUsageDetails_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter water consumption in litres: ");
        double consumption = sc.nextDouble();

        int billAmount;

        if(consumption <= 500){
            billAmount = 100;
        }else{
            billAmount = 200;
        }

        System.out.println("Calculated Water Bill: Rs." + billAmount);

        sc.close();
    }
}
