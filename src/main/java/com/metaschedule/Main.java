package com.metaschedule;
import com.google.gson.Gson;

import com.metaschedule.roles.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        User user = new User();
        int opt;

        do {
            System.out.println("\nThese are the actions you can perform:");
            System.out.println("  1) Create a new group.");
            System.out.println("  2) Print user info.");
            System.out.println("  3) Import your user.");
            System.out.println("  4) Export your user.");
            System.out.println("  0) Exit.");
            System.out.print("Select an option between 0 and 3: ");
            opt = scanner.nextInt();

            switch (opt) {
                case 0: {
                    System.out.println("\nBye :D\n");
                    break;
                }
                case 1: {
                    user.addGroup();
                    break;
                }
                case 2: {
                    try {
                        System.out.println(user);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                }
                case 3: {
                    User.importUser();
                    break;
                }
                case 4: {
                    user.exportUser();
                    break;
                }
                default: System.out.println("\nInvalid option, please try again.");
            }
        }while (opt != 0);

        System.out.println(user.getGroups().get(0).getId());
        System.out.println(user.getGroups().get(0).getTeacher().getName());
        System.out.println(user.getGroups().get(0).getLanguage());
        System.out.println(user.getGroups().get(0).getSessions().get(0).getDay());
        System.out.println(user.getGroups().get(0).getSessions().get(0).getClassroom());
        System.out.println(user.getGroups().get(0).getSessions().get(0).getInit_hour());
        System.out.println(user.getGroups().get(0).getSessions().get(0).getEnd_hour());
        System.out.println(user);

        Persona persona = new Persona("Juan", 25, "juan@example.com");
        Cuaderno cuaderno1 = new Cuaderno("Moleskine", 100);
        Cuaderno cuaderno2 = new Cuaderno("Oxford", 200);
        Hoja hoja1_1 = new Hoja("Contenido 1_1");
        Hoja hoja1_2 = new Hoja("Contenido 1_2");
        Hoja hoja2_1 = new Hoja("Contenido 2_1");
        Hoja hoja2_2 = new Hoja("Contenido 2_2");
        persona.getCuadernos().add(cuaderno1);
        persona.getCuadernos().get(0).getHojas().add(hoja1_1);
        persona.getCuadernos().get(0).getHojas().add(hoja1_2);
        persona.getCuadernos().add(cuaderno2);
        persona.getCuadernos().get(1).getHojas().add(hoja2_1);
        persona.getCuadernos().get(1).getHojas().add(hoja2_2);
        System.out.println(persona);
    }
}

