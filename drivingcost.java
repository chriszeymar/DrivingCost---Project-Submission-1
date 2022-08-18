
/**
 * Project 1 DrivingCost
 *
 * @author C K Zema - 34946039
 * Date: 16-08-2022
 */
import java.util.Scanner;
public class drivingcost
{
    public static void main (String args[])
    {
        double distance, kilometers, price;
        double cost;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the driving distance: ");
        distance = input.nextDouble();
        
        System.out.println("Enter the kilometers per liter: ");
        kilometers = input.nextDouble();
        
        System.out.println("Enter the price per liter: ");
        price = input.nextDouble();
        
        cost = (distance * price)/kilometers;
        
        System.out.printf("%s%2.2f$","The cost of driving is ",cost);
    }
}
