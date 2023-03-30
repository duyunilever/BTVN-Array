import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập số lượng phần tử mảng:");
        do {
            n = sc.nextInt();
            if (n>0)
                break;
            System.out.println("Nhập sai, nhập lại số lượng phần tử mảng:");
        } while (n <= 0);
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            arr[i] = sc.nextInt();
        }
        System.out.println("In ra mảng: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("Mảng sau khi tăng: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                arr[i]++;
            }
            System.out.print( arr[i] + " ");
        }
    }
}