package workshop;

import java.util.Comparator;

public class WorkshopImpl implements Workshop, Comparable {
    private String worker;
    private String part;
    private int quantity;
    private double price;

    public WorkshopImpl(String worker, String part, int quantity, double price) {
        this.worker = worker;
        this.part = part;
        this.quantity = quantity;
        this.price = price;
    }

    public String getWorker() {
        return worker;
    }

    public void setWorker(String worker) {
        this.worker = worker;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "WorkshopImpl{" +
                "worker='" + worker + '\'' +
                ", part='" + part + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public int compareTo(Object o) {
        return Comparator.comparing(WorkshopImpl::getQuantity)
                .reversed()
                .thenComparing(WorkshopImpl::getPart)
                .compare(this, (WorkshopImpl) o);
    }
}
