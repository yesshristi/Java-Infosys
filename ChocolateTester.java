class Chocolate {
    private int barCode;
    private String name;
    private int weight;
    private int cost;

    // Constructor to initialize default values
    public Chocolate() {
        barCode = 101;
        name = "Cadbury";
        weight = 12;
        cost = 10;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}

public class ChocolateTester {
    public static void main(String[] args) {
        // Create an object of chocolate
        Chocolate choco = new Chocolate();

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
