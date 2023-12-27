import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        boolean runProgram = true;
        while (runProgram) {
            System.out.println("Please select one of the option:");
            System.out.println("1. Register a bank account");
            System.out.println("2. View Balance");
            System.out.println("3. Make a deposit");
            System.out.println("4. Withdraw money");
            System.out.println("5. Transfer money");
            System.out.println("6. Exit");
            int userInput;
            if (scanner.hasNextInt()) {
                userInput = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
            } else {
                System.out.println("Invalid input. Please enter a valid option.");
                scanner.nextLine(); // Consume the invalid input
                continue; // Restart the loop
            }
            if(userInput==1){


                System.out.println("Enter your email: ");
                String email = scanner.next();

                System.out.println("Enter your date of birth: ");
                String dateOfBirth = scanner.next();
                scanner.nextLine(); // Consume the newline character

                System.out.println("Enter your house number/address: ");
                String houseNumber = scanner.nextLine(); // Read the entire line, including spaces

                System.out.println("Enter your city: ");
                String city = scanner.next();
                scanner.nextLine(); // Consume the newline character

                System.out.println("Enter your province: ");
                String province = scanner.next();
                scanner.nextLine(); // Consume the newline character

                System.out.println("Enter your postal code: ");
                String postalCode = scanner.next();

                System.out.println("Enter your first name: ");
                String firstName = scanner.next();

                System.out.println("Enter your last name: ");
                String lastName = scanner.next();

                User user = new User(firstName, lastName, email, dateOfBirth, houseNumber, city, province, postalCode);
                bank.addUser(user);

            }

            if(userInput==2){
                System.out.println("Enter your user ID");
                int userID = scanner.nextInt();
                try {
                    System.out.println(bank.getBalance(userID));
                } catch (Exception e){
                    System.out.println("User ID does not exist");
                }

            }
            if(userInput==3){
                System.out.println("Enter your user ID");
                int userID = scanner.nextInt();
                try {
                    bank.accountExists(userID);
                } catch (Exception e){
                    System.out.println("User ID does not exist");
                }
                System.out.println("Enter your account:");
                int accountPosition = scanner.nextInt();
                System.out.println("Enter the amount:");
                int amount = scanner.nextInt();
                bank.makeDeposit(userID,amount,accountPosition);
            }
            if(userInput==4){
                System.out.println("Enter your user ID");
                int userID = scanner.nextInt();
                try {
                    bank.accountExists(userID);
                } catch (Exception e){
                    System.out.println("User ID does not exist");
                }
                System.out.println("Enter your account:");
                int accountPosition = scanner.nextInt();
                System.out.println("Enter the amount:");
                int amount = scanner.nextInt();
                bank.makeDeposit(userID,amount,accountPosition);
            }

            if(userInput==5){
                System.out.println("Enter your user ID");
                int userID = scanner.nextInt();
                try {
                    bank.accountExists(userID);
                } catch (Exception e){
                    System.out.println("User ID does not exist");
                }
                System.out.println("Enter your account:");
                int accountPosition = scanner.nextInt();
                System.out.println("Enter the amount:");
                int amount = scanner.nextInt();
                
            }
            if(userInput==6){
                runProgram=false;
            }
        }
        System.out.println("Thank you for using our banking service.");
        System.out.println("Program by Mayank Arora.");

    }
}
