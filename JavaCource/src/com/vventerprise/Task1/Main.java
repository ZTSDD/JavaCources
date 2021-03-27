package com.vventerprise.Task1;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String param = "";
        if (args.length > 0) {
            param = args[0];
        }
        while (true){
            while (param == null || param == "") {
                PrintMenu();
                System.out.print("Введите корректный номер операции: ");
                param = ReadString();
            }
            ResolveCommand(param);
            param = "";
        }
    }

    private  static  void PrintMenu() {
        System.out.print("1 - ввести число\n2 - ввести строку\n3- ввести символ\n0 - выйти.\n");
    }

    private static void ResolveCommand(String param) {
        String input;
        switch (param){
            case "1":
                System.out.print("Введите число: ");
                input = ReadString();
                ExecuteIntHandler(input);
                break;
            case "2":
                System.out.print("Введите строку: ");
                input = ReadString();
                ExecuteStringHandler(input);
                break;
            case "3":
                System.out.print("Введите символ: ");
                input = ReadString();
                ExecuteCharHandler(input);
                break;
            case "0":
                System.exit(0);
                break;
            default:
                System.out.println("Такой операции не существует");
        }
    }

    private  static  String ReadString() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (input.isEmpty()) {
            System.out.print("Вы ввели пустую строку, попробуйте ввести снова: ");
            input = scanner.nextLine();
        }
        return input;
    }

    private  static  void ExecuteStringHandler(String input) {

        System.out.println("Вы ввели строку: " + input);
    }

    private  static  void ExecuteIntHandler(String input) {
        try{
            int val = Integer.parseInt(input);
            System.out.println("Вы ввели число: " + val);
        }
        catch (NumberFormatException e){
            System.out.println("Вы ввели число неверно");
        }
    }

    private  static  void ExecuteCharHandler(String input) {
        if (input.length() > 1)
            System.out.println("Вы ввели слишком много символов");
        System.out.println("Вы ввели символ: " + input.charAt(0));
    }
}
