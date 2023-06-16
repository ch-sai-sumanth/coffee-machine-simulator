import java.util.Scanner;

public class User {


    static void buy() {
        Scanner sc=new Scanner(System.in);

        System.out.println("Choose type of coffee you want : ");
        System.out.println(" \nESPRESSO\n LATTE\n CAPPUCCINO");
        String coffeeType=sc.next();

        Coffee myCoffee = null;

        if(coffeeType.equals("ESPRESSO"))
        {
            myCoffee=new Espresso();
            myCoffee.displayPrice();
        }
        else if(coffeeType.equals("LATTE"))
        {
            myCoffee=new Latte();
            myCoffee.displayPrice();
        }
        else if(coffeeType.equals("CAPPUCCINO"))
        {
            myCoffee=new Cappuccino();
            myCoffee.displayPrice();
        }

        System.out.println("Do you want to continue? Y/N");
        char c=sc.next().charAt(0);
        if(c=='Y')
        {
            try
            {
                myCoffee.collectMoney();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        else
        {
            System.out.println("Terminated");
            return;
        }
    }
}
