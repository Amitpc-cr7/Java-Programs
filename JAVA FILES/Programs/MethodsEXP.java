
class MethodsEXP {
    // Instance variables with initial values
    double height = 10;
    double width = 5;
    double depth = 4;

    // Method to calculate volume
    double volume() {
        return height * width * depth;
    }

    public static void main(String[] args) {

        // 1. Object creation
        MethodsEXP b1 = new MethodsEXP();

        // 2. Object initialization
        b1.height = 10;
        b1.width = 5;
        b1.depth = 4;

        // 3. Execution
        System.out.println("Height: " + b1.height);
        System.out.println("Width: " + b1.width);
        System.out.println("Depth: " + b1.depth);

        System.out.println("Volume of Box: " + b1.volume());
    }
}
