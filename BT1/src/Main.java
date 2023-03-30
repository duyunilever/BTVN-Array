import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = s1.toLowerCase();
        //tach chuoi dua tren khoang trang
        String[] arr = s2.split("\\s");
        //su dung vong lap foreach de in cac element cua mang chuoi thu duoc
        for (String w : arr) {
            System.out.print(w.substring(0,1).toUpperCase() + w.substring(1) + " ");
        }
    }
}