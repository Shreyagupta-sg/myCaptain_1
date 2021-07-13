import java.util.Scanner;
public class myCaptain_1 {
    public static void main(String[] args) {
        int choice;
        System.out.println("print Hi OR Hey OR Hello ");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("you said hi");
                break;
            case 2:
                System.out.println("you said hey");
                break;
            case 3:
                System.out.println("you said Hello");
                break;
            default:
                System.out.println("Invalid choice");

        }


    }
}
