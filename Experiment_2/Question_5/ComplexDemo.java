public class ComplexDemo {
    public static void main(String[] args) {
        // Create complex numbers using the Complex class
        Complex complex1 = new Complex();
        Complex complex2 = new Complex(3.0, 4.0);

        // Display the real and imaginary parts of the complex numbers
        System.out.println("Complex 1: Real Part = " + complex1.getRealPart() + ", Imaginary Part = "
                + complex1.getImaginaryPart());
        System.out.println("Complex 2: Real Part = " + complex2.getRealPart() + ", Imaginary Part = "
                + complex2.getImaginaryPart());

        // Set new values for complex1
        complex1.setRealPart(1.5);
        complex1.setImaginaryPart(-2.0);

        // Display the updated values
        System.out.println("Complex 1 (Updated): Real Part = " + complex1.getRealPart() + ", Imaginary Part = "
                + complex1.getImaginaryPart());
    }
}
