package ventaeventos;

public class Event {
    private String id;
    private String name;
    private  int stock; // Cantidad de entradas disponibles
    //private String type; // Encontrar una forma de implementar tipo de ticket
    private int price;
    private double discount;
    
    public Event(String id, String name, int stock, /*String type ,*/ int price) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        //this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public int getStock() {  // Como disminuir el stock?
        return  stock;
    }
    /*public String getType() {
        return type;
    } */
    public int getPrice(int ageIn) {  // APLICA EL DESCUENTO MAS DE UNA VEZ??
        if (ageIn < 20) {
            discount = price * 0.25;
            // price = (int) discount;
        }
        return (price - (int) discount);
    }
    public int updateStock() {
        return (stock -= 1);
    }
}
