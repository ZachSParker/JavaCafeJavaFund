import java.util.ArrayList;
public class CafeUtil {
    //get number of times customer has bought a drink week to week and add them together, return sum value
    // public Integer getStreakGoal(Integer end){
    //     int sum = 0;
    //     for (int i = 1; i<=end;i++){
    //         sum+=i;
    //     }
    //     return sum;
    // }
    // add together all the menu prices from a single customer's order. return sum value
    // public double getOrderTotal(double[] prices){
    //     double sum = 0.0;
    //     for (int i = 0; i<prices.length;i++){
    //         sum +=prices[i];
    //     }
    //     return sum;
    // }
    //display all current menu items including their index position
    // public void displayMenu(ArrayList<String> menuItems){

    //     for (int i = 0;i<menuItems.size();i++)
    //     {
    //         String menuItem = menuItems.get(i);
    //         System.out.println(i+ " " + menuItem);
    //     }

    // }
    public void addCustomer(ArrayList<String> customers){

        
        String username = System.console().readLine("What is your name?:");
        customers.add(username);
        System.out.println("Hello "+username+" You have "+customers.size()+" Ahead of you");
        System.out.println(customers);
    }
}
