
import java.util.Scanner;

class Boxx {

    // Instance variables
    double height, width, depth;

    // 1. Constructor for initialization
    Boxx(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }

    // 2. Method to calculate volume
    double volume() {
        return height * width * depth;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        System.out.print("Enter width: ");
        double w = sc.nextDouble();

        System.out.print("Enter depth: ");
        double d = sc.nextDouble();

        // 3. Object creation and initialization
        Boxx b1 = new Boxx(h, w, d);

        // 4. Execution
        System.out.println("Height: " + b1.height);
        System.out.println("Width: " + b1.width);
        System.out.println("Depth: " + b1.depth);

        System.out.println("Volume of Box: " + b1.volume());

        sc.close();
    }
}
