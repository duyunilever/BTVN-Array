import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập số lượng phần tử mảng: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i+1));
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Giá trị lớn nhất trong mảng là: " + arr[arr.length-1]);
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + arr[0]);
    }
}