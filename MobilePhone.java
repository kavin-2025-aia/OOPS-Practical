public class MobilePhone {
    private String brand;
    private String model;
    private int batteryPercentage;
    public void setDetails(String brand, String model, int batteryPercentage) {
        this.brand = brand;
        this.model = model;
        this.batteryPercentage = batteryPercentage;
    }
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Battery: " + batteryPercentage + "%");
    }

    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone();
        MobilePhone phone2 = new MobilePhone();
        phone1.setDetails("Apple", "iPhone 15", 75);
        phone2.setDetails("Samsung", "Galaxy S23", 50);
        System.out.println("=== Phone 1 ===");
        phone1.displayInfo();

        System.out.println("\n=== Phone 2 ===");
        phone2.displayInfo();
    }
}