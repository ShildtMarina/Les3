package les3as1;

import java.util.Scanner;


public class Les3As1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        int max = 0;

        Scanner cs = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Input number:");
            num = cs.nextInt();
            if (max <= num) {
                max = num;
            }
        }
        System.out.println(max);
        cs.close();
    }

}
