package singleton;

import singleton.FileManager;
import singleton.User;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileManager fileManager = FileManager.getInstance();
        FileManager fileManager1 = FileManager.getInstance();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("1.Write to file \n2.Read from file \n");
            int option = scanner.nextInt();
            scanner.nextLine();
            if(option == 1){
                User user = new User();
                fileManager.add(user);
                fileManager.write();
            }else if(option == 2){
                List<User> list = fileManager1.read();
                list.stream().forEach(user -> System.out.println("Username: " + user.getUsername() + "  ID: " + user.getId()));
            }else if(option == 0){
                System.exit(0);
            }
        }

    }
}
