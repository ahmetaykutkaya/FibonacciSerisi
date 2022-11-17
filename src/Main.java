import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner data =new Scanner(System.in);
        int n , firstTerm = 0, secondTerm = 1;

        System.out.print("N sayisini giriniz : ");
        n =data.nextInt();

        while (firstTerm <= n) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }
    }
}