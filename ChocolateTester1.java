class Chocolate {
    private int barCode;
    private String name;
    private double weight;
    private double cost;

    // Default constructor
    public Chocolate() {
        // Initializing with default values
        this(101, "Cadbury", 12, 10);
    }

    // Parameterized constructor using "this" keyword
    public Chocolate(int barCode, String name, double weight, double cost) {
        // Initializing member variables using "this" keyword
        this.barCode = barCode;
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    // Getter and setter methods
    public int getBarCode() {
        return barCode;
    }

    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}

public class ChocolateTester1 {
    public static void main(String[] args) {
        // Create an object of chocolate using parameterized constructor
        Chocolate choco = new Chocolate(101, "Cadbury", 12, 10);

        // Use getter methods to display the default values
        System.out.println("Default Values:");
        System.out.println("BarCode: " + choco.getBarCode());
        System.out.println("Name: " + choco.getName());
        System.out.println("Weight: " + choco.getWeight());
        System.out.println("Cost: " + choco.getCost());

        // Use setter methods to modify the values
        choco.setBarCode(102);
        choco.setName("Hershey's");
        choco.setWeight(24);
        choco.setCost(50);

        // Use getter methods to display the modified values
        System.out.println("\nModified Values:");
        System.out.println("BarCode: " + choco.getBarCode());
        System.out.println("Name: " + choco.getName());
        System.out.println("Weight: " + choco.getWeight());
        System.out.println("Cost: " + choco.getCost());
    }
}
