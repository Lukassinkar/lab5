import workshop.WorkshopImpl;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        WorkshopImpl workshop1 = new WorkshopImpl("lukas", "ssd", 1500, 150);
        WorkshopImpl workshop2 = new WorkshopImpl("Almantas", "gpu", 1300, 350);
        WorkshopImpl workshop3 = new WorkshopImpl("Mantas", "cpu", 1700, 250);
        WorkshopImpl workshop4 = new WorkshopImpl("Tomas", "psu", 900, 80);
        WorkshopImpl workshop5 = new WorkshopImpl("Paulius", "hdd", 2000, 50);
        WorkshopImpl workshop6 = new WorkshopImpl("Justas", "ram", 400, 30);
        WorkshopImpl workshop7 = new WorkshopImpl("Dovydas", "cpu fan", 2200, 15);
        WorkshopImpl workshop8 = new WorkshopImpl("Antanas", "water cooling", 2300, 170);
        WorkshopImpl workshop9 = new WorkshopImpl("Aurimas", "case", 600, 90);
        WorkshopImpl workshop10 = new WorkshopImpl("Domantas", "keyboard", 1500, 90);

        ArrayList<WorkshopImpl> workshops = new ArrayList<>();
        workshops.add(workshop1);
        workshops.add(workshop2);
        workshops.add(workshop3);
        workshops.add(workshop4);
        workshops.add(workshop5);
        workshops.add(workshop6);
        workshops.add(workshop7);
        workshops.add(workshop8);
        workshops.add(workshop9);
        workshops.add(workshop10);

        System.out.println("Pradinis sarasas");
        for (WorkshopImpl workshop : workshops) {
            System.out.println(workshop);
        }

        System.out.println("\nDetaliu sarasas");
        for (WorkshopImpl workshop : workshops) {
            System.out.println("detale = " + workshop.getPart()
                    + ", kiekis = " + workshop.getQuantity()
                    + ", suma = " + workshop.getQuantity() * workshop.getPrice());
        }

        Collections.sort(workshops);
        System.out.println("\nSurikiuotas detaliu sarasas");
        for (WorkshopImpl workshop : workshops) {
            System.out.println("detale = " + workshop.getPart()
                    + ", kiekis = " + workshop.getQuantity()
                    + ", suma = " + workshop.getQuantity() * workshop.getPrice());
        }

        System.out.println("\nDetaliu dienos normos");
        for (WorkshopImpl workshop : workshops) {
            System.out.println("detale = " + workshop.getPart()
                    + ", kiekis = " + workshop.getQuantity()
                    + ", suma = " + workshop.getQuantity() * workshop.getPrice()
                    + ", " + (workshop.getQuantity() > 1000 ? "norma ivykdyta" : "norma neivykdyta"));
        }

        workshops.removeIf(workshop -> workshop.getPrice() > 100);
        System.out.println("\nDetaliu sarasas po istrinimu");
        for (WorkshopImpl workshop : workshops) {
            System.out.println("detale = " + workshop.getPart()
                    + ", kiekis = " + workshop.getQuantity()
                    + ", suma = " + workshop.getQuantity() * workshop.getPrice());
        }
    }
}
