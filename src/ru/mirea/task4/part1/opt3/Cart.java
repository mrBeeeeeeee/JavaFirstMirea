package ru.mirea.task4.part1.opt3;
import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> products;

    public Cart() {
        this.products = new ArrayList<>();
    }
    public void addProduct(Product product){
        products.add(product);
    }

    public void showProducts(){
        System.out.println("Ваша корзина: ");
        for (Product prod : products) {
            prod.showInfo();
        }
    }
}
