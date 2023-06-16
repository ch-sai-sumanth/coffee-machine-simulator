import java.util.Scanner;

public  class Coffee {
    int price;
    int water;
    int milk;
    int beans;

    int userMoney;

    private static int moneyInMachine=0;
    private static int milkInMachine=1000;
    private static int beansInMachine=1000;
    private static int waterInMachine=1000;

    public static int getMoneyInMachine() {
        return moneyInMachine;
    }

    public static void setMoneyInMachine(int moneyInMachine) {
        Coffee.moneyInMachine = moneyInMachine;
    }

    public static int getMilkInMachine() {
        return milkInMachine;
    }

    public static void setMilkInMachine(int milkInMachine) {
        Coffee.milkInMachine = milkInMachine;
    }

    public static int getBeansInMachine() {
        return beansInMachine;
    }

    public static void setBeansInMachine(int beansInMachine) {
        Coffee.beansInMachine = beansInMachine;
    }

    public static int getWaterInMachine() {
        return waterInMachine;
    }

    public static void setWaterInMachine(int waterInMachine) {
        Coffee.waterInMachine = waterInMachine;
    }

    public Coffee(){};
    public Coffee(int price, int water, int milk, int beans) {
        this.price = price;
        this.water = water;
        this.milk = milk;
        this.beans = beans;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getBeans() {
        return beans;
    }

    public void setBeans(int beans) {
        this.beans = beans;
    }



    public void displayPrice()
    {
        System.out.println("Price is : "+this.price);
    }

    public void collectMoney() throws Exception {

        Scanner sc=new Scanner(System.in);
        System.out.println("please insert correct money: ");
        int userMoney=sc.nextInt();

        boolean status=validateAndAddMoneyToMachine(userMoney);


        //dispenses coffee of current obj
        if(status)
            dispenseCoffee(this,userMoney);
        else
            throw new Exception("you have not inserted the required money for the coffee you choosen , try again");

    }



    private void dispenseCoffee(Coffee coffee,int userMoney) {

        //check for the sufficient ingredients;

        //validating ingredients
        if(milkInMachine>=coffee.milk && waterInMachine>=coffee.water && beansInMachine>=coffee.beans)
        {
            System.out.println("Dispense started");
            milkInMachine-=coffee.milk;
            waterInMachine-=coffee.water;
            beansInMachine-=coffee.beans;

            moneyInMachine+=userMoney;
        }
        else
        {
            System.out.println("Insufficient ingredients in the machine , sorry for the inconvinience");
            System.out.println("please take your money back");
        }
    }

    private boolean validateAndAddMoneyToMachine(int userMoney){
           if(userMoney==this.price)
            {
                System.out.println("money validated succesfully");
                return true;
            }
            else
            {
                return false;
            }
    }

    public void fillMilk(int milkQuantity) {
        milkInMachine+=milkQuantity;
    }

    public void fillWater(int waterQuantity) {
        waterInMachine+=waterQuantity;
    }

    public void fillBeans(int beansQuantity) {
        beansInMachine+=beansQuantity;
    }
}
