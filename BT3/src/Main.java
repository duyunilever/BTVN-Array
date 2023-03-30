import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Nhập số lượng phần tử mảng:");
        do {
            a = sc.nextInt();
            if (a>0)
                break;
            System.out.println("Nhập sai, nhập lại số lượng phần tử mảng:");
        } while (a <= 0);

        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Giá trị lớn nhất trong mảng là: " + arr[arr.length - 1]);
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + arr[0]);
    }
}