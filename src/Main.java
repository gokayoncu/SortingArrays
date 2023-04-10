import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("Dizinin Boyutunu Gİrin :");
        n= input.nextInt();

        int[]list=new int[n];
        for (int i =0;i< list.length;i++){

            System.out.print(i+".Eleman:");
            int numbers = input.nextInt();
            list[i] =  numbers;
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}