package ventaeventos;

public class Ticket {
    private String bought = "";
    private String type; // Tipo de ticket, VIP, Pref., etc
    private int remain;
    private int total;
    //private double discount;

    public void addTicket(String nameEvent, int price) {
        bought += nameEvent + "\n";
        total += price;
    }

    public int minusStock(int stock, int decrease) { // CONCEPTO ???
        remain = stock - decrease;
        return remain;
    }

    public void showTickets() {
        System.out.println("Tickets comprados: \n" + bought);
        System.out.println("Monto total: " + total);

    }

}
