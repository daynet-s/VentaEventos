package ventaeventos;

public class Ticket {
    private String bought = "";
    private int total;
    //private double discount;

    public void addTicket(String nameEvent, int price) {
        bought += nameEvent + "\n";
        total += price;
    }

    public void showTickets() {
        System.out.println("Tickets comprados: \n" + bought);
        System.out.println("Monto total: " + total);

    }

}
