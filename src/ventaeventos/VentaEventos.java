package ventaeventos;

import java.util.Scanner;

public class VentaEventos {
    public static void main(String[] args) {
        Scanner scanF = new Scanner(System.in);
        System.out.println("Ingrese su Nombre: ");
        String clFname = scanF.nextLine();
        Scanner scanL = new Scanner(System.in);
        System.out.println("Ingrese su Apellido ");
        String clLname = scanL.nextLine();
        Scanner scanA = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int clAge = scanA.nextInt();

        Client client1 = new Client("001", clFname, clLname, clAge);

        Event event1 = new Event("Event1", "Nombre 1", 24,1200);
        Event event2 = new Event("Event2", "Nombre 2", 3,2400);
        Event event3 = new Event("Event3", "Nombre 3", 100,950);
        Event event4 = new Event("Event4", "Nombre 4", 12,4000);

        int option = 0;
        do {
            System.out.println("--- HUB TICKET EVENTOS ---");
            if (clAge < 20) {
                System.out.println("(DESCUENTO APLICADO)");
            }
            System.out.println("EVENTOS DISPONIBLES:");
            System.out.println("1. "+event1.getName()+" - $"+event1.getPrice(clAge)+" - Disponibles: "+event1.getStock());
            System.out.println("2. "+event2.getName()+" - $"+event2.getPrice(clAge)+" - Disponibles: "+event2.getStock());
            System.out.println("3. "+event3.getName()+" - $"+event3.getPrice(clAge)+" - Disponibles: "+event3.getStock());
            System.out.println("4. "+event4.getName()+" - $"+event4.getPrice(clAge)+" - Disponibles: "+event4.getStock());
            System.out.println("5. Tickets comprados");
            System.out.println("6. Salir");
            System.out.print(">> ");
            option = scanA.nextInt();
            switch (option) {
                case 1: // Detener al alcanzar 0!!!!
                    if (event1.getStock() > 0) {
                        client1.addTicket(event1);
                        event1.updateStock();
                    }
                    else {
                        System.out.println("AGOTADO");
                    }
                    break;
                case 2:
                    if (event2.getStock() > 0) {
                        client1.addTicket(event2);
                        event2.updateStock();
                    }
                    else {
                        System.out.println("AGOTADO");
                    }
                    break;
                case 3:
                    if (event3.getStock() > 0) {
                        client1.addTicket(event3);
                        event3.updateStock();
                    }
                    else {
                        System.out.println("AGOTADO");
                    }
                    break;
                case 4:
                    if (event4.getStock() > 0) {
                        client1.addTicket(event4);
                        event4.updateStock();
                    }
                    else {
                        System.out.println("AGOTADO");
                    }
                    break;
                case 5:
                    client1.showTickets();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("!! Invalid Input !!");
                    break;
            }
        } while (option != 6);
    }
    
}
