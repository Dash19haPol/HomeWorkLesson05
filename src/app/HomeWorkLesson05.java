package app;

import java.util.Scanner;

public class HomeWorkLesson05 {
    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);
        System.out.print("Введіть доход: ");
        int income = c.nextInt();
        System.out.println("");
        if(income <= 10000) {
            System.out.println("Сума податку дорівнює: " + (int)((income * 2.5) / 100));
        }else if((income > 10000) && (income <= 25000)) {
            System.out.println("Сума податку дорівнює: " + (int)((income * 4.3) / 100));
        }else {
            System.out.println("Сума податку дорівнює: " + (int)((income * 6.7) / 100));
        }





    }
}
