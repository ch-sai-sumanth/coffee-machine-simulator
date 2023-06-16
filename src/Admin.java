import java.util.Scanner;

public class Admin {

    Coffee coffeeObj=new Coffee();
    Scanner sc=new Scanner(System.in);
    String ID="ADMIN123";

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }


    public void run() {
        System.out.println("\npress 1 to 'FILL' \n press 2 to 'TAKE' \n " +
                "press 3 to 'SHOW'");
        int option=sc.nextInt();

        switch (option)
        {
            case 1:
                fillmachine(); break;
            case 2:
                takeMoney(); break;
            case 3:
                showIngredientsLeft(); break;
            default:
                System.out.println("incorrect option");
        }
    }

    private void showIngredientsLeft() {
        System.out.println("Quantity of Water left in machine : "+coffeeObj.getWaterInMachine());
        System.out.println("Quantity of Milk left in machine : "+coffeeObj.getMilkInMachine());
        System.out.println("Quantity of Beans left in machine : "+coffeeObj.getBeansInMachine());
        System.out.println();
        System.out.println("Total collection of money is: "+coffeeObj.getMoneyInMachine());
    }

    private void takeMoney() {
        int money=coffeeObj.getMoneyInMachine();
        System.out.println("Withdrawn money in machine is: "+money);
        coffeeObj.setMoneyInMachine(0);
    }

    private void fillmachine() {

        System.out.println("what do you want to add ? \n 'MILK' or 'WATER' or 'BEANS' ?");
        String str=sc.next();

        if(str.equals("MILK"))
        {
            System.out.println("Enter milk quantity: ");
            int milkQuantity = sc.nextInt();

            coffeeObj.fillMilk(milkQuantity);
            System.out.println("milk added succesfully");
        }

       else if(str.equals("WATER"))
       {
            System.out.println("Enter water quantity: ");
            int waterQuantity = sc.nextInt();

            coffeeObj.fillWater(waterQuantity);
           System.out.println("water added succesfully");
        }

        else if(str.equals("BEANS"))
        {
            System.out.println("Enter beans quantity: ");
            int beansQuantity=sc.nextInt();

            coffeeObj.fillBeans(beansQuantity);
            System.out.println("beans added succesfully");
        }
        else
        {
            System.out.println("please enter correct item to fill");
        }

        }
    }

