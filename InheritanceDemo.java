// Single and Multi-level Inheritance Example
class Cars {
    String brand = "Generic Car";

    public void showBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Single level inheritance
class Sedan extends Cars {
    int seats = 5;

    public void showDetails() {
        System.out.println("This is a Sedan with " + seats + " seats.");
    }
}

// Multi-level inheritance
class LuxurySedan extends Sedan {
    boolean hasSunroof = true;

    public void showLuxuryFeatures() {
        System.out.println("Luxury Sedan Sunroof: " + hasSunroof);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        // Single level: Sedan inherits Cars
        Sedan s1 = new Sedan();
        s1.showBrand();
        s1.showDetails();

        System.out.println("----------------");

        // Multi level: LuxurySedan inherits Sedan (which inherits Cars)
        LuxurySedan ls1 = new LuxurySedan();
        ls1.showBrand();          // From Cars
        ls1.showDetails();        // From Sedan
        ls1.showLuxuryFeatures(); // From LuxurySedan
    }
}