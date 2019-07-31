import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation();

        double a;
        double b;
        double c;
        double x1;
        double x2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap a, b, c :");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        quadraticEquation.setA(a);
        quadraticEquation.setB(b);
        quadraticEquation.setC(c);
        x1 = quadraticEquation.getRoot1();
        x2 = quadraticEquation.getRoot2();
        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println(" phuong trinh vo ngiem ");
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println(" phuong trinh co nghiem kep x =" + x1);
        } else {
            System.out.println(" phuong trinh co 2 nghiem phan biet x1 =" + x1 + "va x2 =" + x2);
        }
    }
}
