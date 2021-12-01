package ru.skypro;

public class Main {

    public static void main(String[] args) {

        int[] items = new int[3];
        items[0] = 11;
        items[1] = 22;
        items[2] = 33;

        double[] tools = {1.57, 7.654, 9.986};

        int[] hoursIStudy = {6, 8, 2, 1, 7, 5, 9};

        System.out.println("Задание два");

        for (int i = 0; i < items.length; i++) {
            if (items[i] != items[items.length - 1]) {
                System.out.print(items[i] + ", ");
            } else {
                System.out.println(items[i]);
            }
        }

        for (int i = 0; i < tools.length; i++) {
            if (tools[i] != tools[tools.length - 1]) {
                System.out.print(tools[i] + ", ");
            }
            else {
                System.out.println(tools[i]);
            }
        }

        for (int i = 0; i < hoursIStudy.length; i++) {
            if (hoursIStudy[i] != hoursIStudy[hoursIStudy.length - 1]) {
                System.out.print(hoursIStudy[i] + ", ");
            }
            else {
                System.out.println(hoursIStudy[i]);
            }
        }

        System.out.println("Задание три");

        for (int i = items.length-1; i >=0; i--) {
            if (items[i] != items[0]) {
                System.out.print(items[i] + ", ");
            }
            else {
                System.out.println(items[i]);
            }
        }

        for (int i = tools.length-1; i >=0; i--) {
            if (tools[i] != tools[0]) {
                System.out.print(tools[i] + ", ");
            }
            else {
                System.out.println(tools[i]);
            }
        }

        for (int i = hoursIStudy.length-1; i >=0; i--) {
            if (hoursIStudy[i] != hoursIStudy[0]) {
                System.out.print(hoursIStudy[i] + ", ");
            }
            else {
                System.out.println(hoursIStudy[i]);
            }
        }

        System.out.println("Задание четыре");

        for (int i = 0; i < items.length; i++) {
            if (items[i] % 2 != 0) {
                items[i] = items[i] + 1;
            }
            System.out.println(items[i]);
        }
    }
}