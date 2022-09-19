package entities;


import java.util.List;

public class OrderItem {
    private Integer quantitiy;
    private Double price;

    private Product product ;

    public OrderItem() {
    }

    public OrderItem(Integer quantitiy, Double price, Product product) {
        this.quantitiy = quantitiy;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantitiy() {
        return quantitiy;
    }

    public void setQuantitiy(Integer quantitiy) {
        this.quantitiy = quantitiy;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double subTotal() {
        return quantitiy * price;
    }

    @Override
    public String toString() {
        return product.getName()+", $"+price+", Quantity: "+String.format("%.2f",quantitiy)+", Subtotal: $"+String.format("%.2f",subTotal());
    }
}
