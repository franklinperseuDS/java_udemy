package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm:SS");
    private Date moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order() {}

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public double total() {
        double sum = 0.0;
        for (OrderItem oi: items ) {
                sum += oi.subTotal();

        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment)+"\n");
        sb.append("Order status: ");
        sb.append(status+"\n");
        sb.append(client+"\n");
        sb.append("Order items:\n");
        for (OrderItem oi: items) {
            sb.append(oi.getProduct().getName()+", $");
            sb.append(String.format("%.2f",oi.getPrice()));
            sb.append(", Quantity: ");
            sb.append(oi.getQuantitiy());
            sb.append(", Subtotal: $");
            sb.append(String.format("%.2f",oi.subTotal())+"\n");

        }
        sb.append("Total price: $");
        sb.append(""+String.format("%.2f",total()));


        return sb.toString();
    }
}
