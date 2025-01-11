package R1_bronze;

import java.util.Scanner;

public class p32978 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        String[] total = in.nextLine().split(" ");
        String[] use = in.nextLine().split(" ");

        for (String el : total) {
            boolean found = false;
            for (String used : use) {
                if (el.equals(used)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(el);
                break;
            }
        }

         in.close();
    }
}
