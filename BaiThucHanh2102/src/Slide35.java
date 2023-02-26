import java.util.Scanner;
public class Slide35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int a, b;
    System.out.println("nhap so nguyen a: ");
    a = sc.nextInt();
    System.out.println("nhap so nguyen b: ");
    b = sc.nextInt();
    if (a>b)
     System.out.println("so nho nhat la " + b);
    else
     System.out.println("so nho nhat la " + a);
    }

}
