import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Masukkan jumlah case");
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        for (int i = 0; i < N; i++) {
            try {
                long data = input.nextLong();
                System.out.println(data + " can be fitted in: \n");

                if (data >= -128 && data <= 127 ) { 
                  System.out.println("* byte");
                }
                if (data >= -32768 && data <= 32767 ) { 
                  System.out.println("* short");
                }
                if (data >= -2147483648 && data <= 2147483647 ) { 
                  System.out.println("* integer");
                }
                  System.out.println("* long");

            } catch (Exception e) {
                String s = input.next();
                System.out.println(s + " can't be fitted anywhere");
            }
        }
        input.close();
    }
}
