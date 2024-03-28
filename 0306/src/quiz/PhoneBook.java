package quiz;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class PhoneBook implements Serializable {
    private static final long serialVersionUID = 1L;
    private static Map<String, Map<String, String>> groups = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    private static final String FILE_NAME = "phonebook.dat";

    public static void main(String[] args) {
        loadData();

        boolean running = true;
        while (running) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addGroup();
                    break;
                case 2:
                    printAll();
                    break;
                case 3:
                    addAddress();
                    break;
                case 4:
                    findPhone();
                    break;
                case 5:
                    findName();
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        saveData();
    }

    private static void printMenu() {
        System.out.println("==== What to do ====");
        System.out.println("1. New Group");
        System.out.println("2. Print");
        System.out.println("3. New Address");
        System.out.println("4. Find Phone");
        System.out.println("5. Find Name");
        System.out.println("6. Exit");
        System.out.print("> ");
    }

    private static void addGroup() {
        System.out.print("Enter group name: ");
        String groupName = scanner.nextLine();
        groups.put(groupName, new HashMap<>());
    }

    private static void printAll() {
        for (Map.Entry<String, Map<String, String>> group : groups.entrySet()) {
            System.out.println("Group: " + group.getKey());
            for (Map.Entry<String, String> entry : group.getValue().entrySet()) {
                System.out.println("  Phone: " + entry.getKey() + ", Name: " + entry.getValue());
            }
        }
    }

    private static void addAddress() {
        System.out.print("Enter group name: ");
        String groupName = scanner.nextLine();
        Map<String, String> group = groups.get(groupName);
        if (group == null) {
            System.out.println("Group does not exist.");
            return;
        }
        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        group.put(phone, name);
    }

    private static void findPhone() {
        System.out.print("Enter phone prefix: ");
        String phonePrefix = scanner.nextLine();
        for (Map.Entry<String, Map<String, String>> group : groups.entrySet()) {
            for (Map.Entry<String, String> entry : group.getValue().entrySet()) {
                if (entry.getKey().contains(phonePrefix)) {
                    System.out.println("Group: " + group.getKey() + ", Phone: " + entry.getKey() + ", Name: " + entry.getValue());
                }
            }
        }
    }

    private static void findName() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        for (Map.Entry<String, Map<String, String>> group : groups.entrySet()) {
            for (Map.Entry<String, String> entry : group.getValue().entrySet()) {
                if (entry.getValue().equals(name)) {
                    System.out.println("Group: " + group.getKey() + ", Phone: " + entry.getKey() + ", Name: " + entry.getValue());
                }
            }
        }
    }

    private static void saveData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(groups);
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    private static void loadData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            groups = (Map<String, Map<String, String>>) ois.readObject();
            System.out.println("Data loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }
}