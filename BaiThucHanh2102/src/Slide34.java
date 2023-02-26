import java.util.Scanner;
public class Slide34 {
    
    public static void main(String[] args) {
      double a, b, c, x1, x2, delta;
      Scanner sc = new Scanner(System.in);
      System.out.println("nhap a (a # 0): ");
      a = sc.nextDouble();
      System.out.println("nhap b: ");
      b = sc.nextDouble();
      System.out.println("Nhap c: ");
      c = sc.nextDouble();
      delta = Math.pow(b, 2) - 4 * a * c;
      if (delta < 0) {
        System.out.println("vo nghiem");
      }
      else if (delta == 0) {
        x1 = -b / (2 *a);
        System.out.println("nghiem kep x1 = x2 = " + x1);
      }
      else {
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("2 nghiem x1 = " + x1 + ", x2 = " + x2);
      }
    }
}