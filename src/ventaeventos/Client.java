package ventaeventos;

public class Client {
    private String id;
    private String fname;
    private String lname;
    private int age;
    private Ticket boughtT;

    public Client(String id, String fname, String lname, int age) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.boughtT = new Ticket();
    }

    public void addTicket(Event event) {
        boughtT.addTicket(event.getName(), event.getPrice(age));
        //boughtT.minusStock(event.getStock(), 1);
    }
    /*public void addDiscount(Event event) {
        boughtT.ageDiscount(age, event.getPrice());
    }*/
    public void showTickets() {
        boughtT.showTickets();
    }

}
