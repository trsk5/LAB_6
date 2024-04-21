// package geometry

public class SolidOfRevolution {

    protected double radius;

    public SolidOfRevolution(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
        this.radius = radius;
    }
}
class Cylinder extends SolidOfRevolution {

    private final double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive");
        }
        this.height = height;
    }
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}
class Cone extends SolidOfRevolution {

    private final double height;

    public Cone(double radius, double height) {
        super(radius);
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive");
        }
        this.height = height;
    }

    public double getVolume() {
        return (Math.PI * radius * radius * height) / 3;
    }
}
class Sphere extends SolidOfRevolution {

    public Sphere(double radius) {
        super(radius);
    }

    public double getVolume() {
        return (4 * Math.PI * radius * radius * radius) / 3;
    }
}

class Test {

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5, 10);
        System.out.println("Volume of cylinder: " + cylinder.getVolume());

        Cone cone = new Cone(3, 8);
        System.out.println("Volume of cone: " + cone.getVolume());

        Sphere sphere = new Sphere(4);
        System.out.println("Volume of sphere: " + sphere.getVolume());
    }
}
