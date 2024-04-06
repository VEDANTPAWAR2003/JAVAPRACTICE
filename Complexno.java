 class Complex {
    double real;
    double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex add(Complex other) {
        double realPart = this.real + other.real;
        double imaginaryPart = this.imag + other.imag;
        return new Complex(realPart, imaginaryPart);
    }

    public Complex subtract(Complex other) {
        double realPart = this.real - other.real;
        double imaginaryPart = this.imag - other.imag;
        return new Complex(realPart, imaginaryPart);
    }

   
    public String toString() {
        if (imag >= 0) {
            return real + " + " + imag + "i";
        } else {
            return real + " - " + (-imag) + "i";
        }
    }

    public static void main(String[] args) {
        Complex num1 = new Complex(2.3, 4.5),
                num2 = new Complex(3.4, 5.0),
                sum, diff;

        sum = num1.add(num2);
        System.out.printf("Sum = %.1f + %.1fi", sum.real, sum.imag);

        diff = num1.subtract(num2);
        System.out.printf("%nDifference = %.1f + %.1fi", diff.real, diff.imag);
    }
}
