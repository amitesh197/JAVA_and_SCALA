public class Complex {
    private double realPart;
    private double imaginaryPart;

    // Default constructor
    public Complex() {
        this.realPart = 0.0;
        this.imaginaryPart = 0.0;
    }

    // Constructor with parameters
    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    // Setter for real part
    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    // Setter for imaginary part
    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    // Getter for real part
    public double getRealPart() {
        return realPart;
    }

    // Getter for imaginary part
    public double getImaginaryPart() {
        return imaginaryPart;
    }
}
