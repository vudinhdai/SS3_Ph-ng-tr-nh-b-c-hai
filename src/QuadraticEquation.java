public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadraticEquation() {

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }


    public String toString() {
        return "QuadraticEquation{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }

    public double getDiscriminant() {
        double delta;
        delta = this.b * this.b - 4 * this.a * this.c;
        return delta;
    }

    public double getRoot1() {
        if (this.getDiscriminant() < 0) {
            return -1;
        }
        double delta = Math.sqrt(this.getDiscriminant());
        double x1 = (-b + delta) / (2 * a);
        return x1;
    }

    public double getRoot2() {
        if (this.getDiscriminant() < 0) {
            return -1;
        }
        double delta = Math.sqrt(this.getDiscriminant());
        double x2 = (-b - delta) / (2 * a);
        return x2;
    }
}

