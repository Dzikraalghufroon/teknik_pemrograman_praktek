import java.util.Scanner;

public class Strings
{
    public static void main(String[] args)
    {
        String[] words;
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.print("How many strings? ");
        size = scan.nextInt();
        scan.nextLine();

        words = new String[size];

        System.out.println("Enter the strings:");
        for(int i=0;i<size;i++)
            words[i] = scan.nextLine();

        Sorting.insertionSort(words);

        System.out.println("\nSorted strings:");
        for(String s : words)
            System.out.println(s);
    }
}