import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        while(true)
        {
            System.out.println("Are you 'USER' or 'ADMIN' ?");
            String user=sc.next();

            //user means customer and has only buy option
            if(user.equals("USER"))
            {
                User userObj=new User();
                userObj.buy();
            }
            else if(user.equals("ADMIN"))
            {

                System.out.println("please enter your AdminID: ");
                String ID=sc.next();

                if(validateAdmin(ID))
                {
                    Admin admin=new Admin();
                    admin.run();
                    System.out.println("Do you want to 'EXIT / STOP ' ? Y/N ");
                    char c=sc.next().charAt(0);

                    if(c=='Y')
                    {
                        System.out.println("Application stopped");
                        break;
                    }

                }
            }
        }


    }

    private static boolean validateAdmin(String id) {
        Admin admin=new Admin();
        String adminID=admin.getID();
        return (adminID.equals(id));
    }


}