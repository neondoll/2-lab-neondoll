package com.company;

//Вариант 4

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        try {
            while (choice != 4) {
                System.out.println("\nЗадание:\n1. Задание 1\n2. Задание 2\n3. Задание 3\n4. Выход\n");
                boolean check = true;
                while (check) {
                    System.out.print("Какое задание запустить? ");
                    if (in.hasNextInt()){
                        choice = in.nextInt();
                    }
                    else{
                        System.out.println("Допускается только int.");
                        in.next();
                        continue;
                    }
                    check = false;
                }
                switch (choice) {
                    case 1:
                        taskOne();
                        break;
                    case 2:
                        taskTwo();
                        break;
                    case 3:
                        taskThree();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Нету такого объекта");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        in.close();
    }

    private static void taskOne() {
        Scanner in1 = new Scanner(System.in);

        System.out.print("\nВведите строку: ");
        TaskOne to = new TaskOne(in1.nextLine());

        System.out.print("\nПеревод строк в нижний регистр: ");
        to.wordConversion();
        to.printText();

        System.out.print("Массив из слов: ");
        to.wordsFormationArray();
        to.printArray();

        System.out.print("Массив вхождения каждого найденного слова в текст: ");
        to.occurrenceFormationArray();
        to.printArrayOccurrence();

        System.out.print("Введите префикс: ");
        System.out.println(to.wordsPrefixFind(in1.next()) + " - столько слов начинаются с заданного префикса");
    }

    private static void taskTwo() {
        Scanner in2 = new Scanner(System.in);

        System.out.print("\nВведите текст: ");
        TaskTwo tt = new TaskTwo(new StringBuffer(in2.nextLine()));

        System.out.println("\nЗамена двузначных числе плюсами");
        tt.textChange();
        tt.printText();

        System.out.println("\nДобавление в самое короткое предложение слово КОНЕЦ");
        tt.addWordEnd();
        tt.printText();

        System.out.println("\nЗамена трехзначных чисел обратными");
        tt.numberReplacement();
        tt.printText();
    }

    private static void taskThree() {
        Scanner in3 = new Scanner(System.in);

        TackThree tt = new TackThree();

        System.out.print("\nОпределение является ли строка корректным e-mail\nВведите e-mail: ");
        System.out.println(tt.complianceCheck(in3.nextLine()));

        System.out.print("\nФормирование списка электронных адресов\nВведите текст: ");
        ArrayList <String> list = tt.listBuilding(in3.nextLine());
        System.out.println("\nСписок e-mail адресов:");
        for (int i = 1; i < list.size()+1; i++) {
            System.out.println("" + i + ". " + list.get(i-1));
        }
    }
}