package com.metaschedule;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.metaschedule.roles.User;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Teacher teacher = new Teacher("Juan");
        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.writeValue(new File("Teacher.json"),teacher);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
         */

        Scanner scanner = new Scanner(System.in);
        User user = new User();
        int opt;

        do {
            System.out.println("\nThese are the actions you can perform:");
            System.out.println("  1) Create a new group.");
            System.out.println("  2) Import your user.");
            System.out.println("  3) Export your user.");
            System.out.println("  0) Exit.");
            System.out.print("Select an option between 0 and 3: ");
            opt = scanner.nextInt();

            switch (opt) {
                case 0 -> {
                    System.out.println("\nBye :D\n");
                }
                case 1 -> {
                    user.addGroup();
                    System.out.println("\nGroup created.");
                }
                case 2 -> {
                    user.importUser(Paths.get("User.json"));
                    System.out.println("\nUser imported successfully.");
                }
                case 3 -> {
                    user.exportUser();
                    System.out.println("\nUser exported successfully.");
                }
                default -> System.out.println("\nInvalid option, please try again.");
            }
        }while (opt != 0);
    }
}