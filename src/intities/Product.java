package intities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalVelueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){

        this.quantity += quantity;
    }

    public void removeProducts(int quantity){

        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", R$ "
                + String.format("%.2f", price )
                + ", "
                + quantity
                + " unidades, Total: R$"
                + String.format ("%.2f", totalVelueInStock());
    }
}
