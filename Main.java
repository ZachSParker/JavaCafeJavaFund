public class Main { 
    public static void main(String[] args)
    { }

    public int getStreakGoal(int end){
        int sum = 0;
        for (int i = 1; i<end;i++){
            sum+=i;
        }
        return sum;
    }
    public double getOrderTotal(double[] prices){
        double sum = 0.0;
        for (int i = 0; i<prices.length;i++){
            sum +=prices[i];
        }
        return sum;
    }
    public static void displayMenu(String[] menuItems){

        for (int i = 0;i<menuItems.length;i++)
        {
            System.out.println(i+' '+menuItems[i]);
        }

    }
}