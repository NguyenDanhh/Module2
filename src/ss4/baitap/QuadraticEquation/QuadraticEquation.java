package ss4.baitap.QuadraticEquation;

public class QuadraticEquation {
    float number1, number2, number3;

    public QuadraticEquation(float number1, float number2, float number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public float getDiscriminant() {
        return (this.number2 * this.number2) - 4 * this.number1 * this.number3;
    }

    public double getRoot1() {
        if (getDiscriminant() < 0) {
            return 0;
        } else {
            return (-this.number2 + Math.sqrt(getDiscriminant())) / (2 * this.number1);
        }
    }

    public double getRoot2() {
        if (getDiscriminant() < 0) {
            return 0;
        } else {
            return (-this.number2 - Math.sqrt(getDiscriminant())) / (2 * this.number1);
        }
    }
}
