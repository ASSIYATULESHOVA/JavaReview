package week09_Review;

public class Cloth {

    private String type;
    private String color;
    private String material;
    private char size;
    private int quantity;


    public Cloth(String type, String color, String material, char size, int quantity) {
        this.type = type;
        this.color = color;
        this.material = material;
        this.size = size;
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        if(material.equalsIgnoreCase("Cotton"))
        this.material = material;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Cloth{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", size=" + size +
                ", quantity=" + quantity +
                '}';
    }


}
