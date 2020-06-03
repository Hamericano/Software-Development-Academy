package singleton;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {
    private static FileManager fileManager = null;
    private String path = "D:\\file";
    private Scanner scanner = new Scanner(System.in);
    private List<User> userList = new ArrayList<>();

    private FileManager() {
    }

    public static FileManager getInstance() {
        if (fileManager == null) {
            fileManager = new FileManager();
        }
        return fileManager;
    }

    public void add(User user){
        System.out.println("Username: ");
        user.setUsername(scanner.next());
        System.out.println("ID: ");
        user.setId(scanner.next());
        userList.add(user);
    }

    public void write() {
        File file = new File(this.path);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(userList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<User> read() {
        File file = new File(this.path);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            userList = (List<User>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return userList;
    }
}
