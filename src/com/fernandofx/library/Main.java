package com.fernandofx.library;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static int id = 0;
    private static int userId = 0;
    private static Library library1 = new Library();
    private static boolean enterUser = true;
    private static boolean enterItems = true;
    private static List<LibraryUser> listUsers;

    public static void main(String[] args) {


        while(enterItems){
            System.out.println("Desea ingresar un Item (Si / No)");
            Scanner sc = new Scanner(System.in);
            String result = sc.nextLine();
            if( result.equalsIgnoreCase("no")){
                break;
            }
            addNewItems();

        }

        library1.showAllItems();

        listUsers = new ArrayList<>();

        while(enterUser){
            System.out.println("Desea ingresar un usuario (Si / No)");
            Scanner sc = new Scanner(System.in);
            String result = sc.nextLine();

            if( result.equalsIgnoreCase("no")){
                break;
            }
            LibraryUser l = createUsers();
            listUsers.add( l);
        }

        loanedItem(1,1);

        for( LibraryUser l : listUsers){
            l.showDetail();
        }
    }

    public static void addNewItems(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Indicar que tipo de Item quiere ingresar");
        String type = sc.nextLine();
        String title = "";
        String director = "";
        String author = "";
        int duration = 0;

        switch (type.toLowerCase()){
            case "book":
                System.out.println("Indicar el titulo del libro: ");
                title = sc.nextLine();
                System.out.println("Indicar el autor: ");
                author = sc.nextLine();
                library1.add(new Book(title, ++id, author));
                break;
            case "dvd":
                System.out.println("Indicar el titulo del DVD: ");
                title = sc.nextLine();
                System.out.println("Indicar el director: ");
                director = sc.nextLine();
                System.out.println("Indicar la duracion: ");
                duration = sc.nextInt();
                library1.add(new Dvd(title, ++id, director, duration));
                break;
            default:
                System.out.println("No es un tipo conocido");
                break;
        }
    }

    private static LibraryUser createUsers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un nombre de usuario");
        String username = sc.nextLine();
        return new LibraryUser(username, ++userId);
    }

    private static void loanedItem( int userId, int itemId){
        listUsers.get(userId -1).setLoanedItems(library1.getItem(itemId -1));
    }
}
