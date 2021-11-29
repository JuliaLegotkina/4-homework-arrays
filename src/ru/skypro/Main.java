package ru.skypro;

public class Main {

    public static void main(String[] args) {
        int[] items = new int[3];
        items[0] = 11;
        items[1] = 22;
        items[2] = 33;
        {
            System.out.print(items[0] + ", ");
            System.out.print(items[1] + ", ");
            System.out.print(items[2] + " ");
        }

        double[] tools = {1.57,7.654,9.986};
        tools[0] = 1.57;
        tools[1] = 7.654;
        tools[2] = 9.986;
        {
            System.out.print(tools[0] + ", ");
            System.out.print(tools[1] + ", ");
            System.out.print(tools[2] + " ");
            System.out.println();
        }

        int[] hoursIStudу = {6, 8, 2, 1, 7, 5, 9};
        hoursIStudу[0] = 6;
        hoursIStudу[1] = 8;
        hoursIStudу[2] = 2;
        hoursIStudу[3] = 1;
        hoursIStudу[4] = 7;
        hoursIStudу[5] = 5;
        hoursIStudу[6] = 9;

        int hoursIStudyMon = hoursIStudу[0];
        int hoursIStudyTue = hoursIStudу[1];
        int hoursIStudyWed = hoursIStudу[2];
        int hoursIStudyThu = hoursIStudу[3];
        int hoursIStudyFri = hoursIStudу[4];
        int hoursIStudySat = hoursIStudу[5];
        int hoursIStudySun = hoursIStudу[6];

        {
            System.out.print("В понедельник я изучаю Java " + hoursIStudyMon + " часов" + ", ");
            System.out.print("Во вторник я изучаю Java " + hoursIStudyTue + " часов" + ", ");
            System.out.print("В среду я изучаю Java " + hoursIStudyWed + " часа" + ", ");
            System.out.print("В четверг я изучаю Java " + hoursIStudyThu + " час" + ", ");
            System.out.print("В пятницу я изучаю Java " + hoursIStudyFri + " часов" + ", ");
            System.out.print("В субботу я изучаю Java " + hoursIStudySat + " часов" + ", ");
            System.out.print("В воскресенье я изучаю Java " + hoursIStudySun + " часов" + " ");
        }
        System.out.println();

        int[] itemsTwo = new int[3];
        itemsTwo[0] = 11;
        itemsTwo[1] = 22;
        itemsTwo[2] = 33;
        for (int i = itemsTwo.length-1; i >=0; i--) {
            System.out.print(itemsTwo[i] + ", ");
        }

        double[] toolsTwo = {1.57,7.654,9.986};
        toolsTwo[0] = 1.57;
        toolsTwo[1] = 7.654;
        toolsTwo[2] = 9.986;
        for (int r = toolsTwo.length-1; r >=0; r--) {
            System.out.print(toolsTwo[r] + ", ");
        }

        int[] hoursIStudуJava = {6, 8, 2, 1, 7, 5, 9};
        hoursIStudуJava[0] = 6;
        hoursIStudуJava[1] = 8;
        hoursIStudуJava[2] = 2;
        hoursIStudуJava[3] = 1;
        hoursIStudуJava[4] = 7;
        hoursIStudуJava[5] = 5;
        hoursIStudуJava[6] = 9;
        for (int s = hoursIStudуJava.length-1; s >=0; s--)
        {
            System.out.print(hoursIStudуJava[s] + ", ");
        }

        System.out.println();

        int[] a = new int[3];
        a[0] = 11;
        int f = a[0];
        for(f = 0; f < a.length; f++)
        { if(f % 2 != 0)
            System.out.println(a[0] + 1);
        }

        a[1] = 22;
        System.out.println(a[1]);

        a[2] = 33;
        int v = a[2];
        for(v = 0; v < a.length; v++)
        { if(v% 2 != 0)
            System.out.println(a[2] + 1);
        }
    }
}