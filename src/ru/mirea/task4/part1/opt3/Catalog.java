package ru.mirea.task4.part1.opt3;
import java.util.ArrayList;
public class Catalog {
    private String name;
    private ArrayList<Product> products;

    public Catalog(String name, ArrayList<Product> products) {
        this.name = name;
        this.products = products;
    }
    public void showCatalog(){
        System.out.println("Каталог " + name + ":");
        int i = 0;
        for (Product prod : products){
            System.out.print("(" + i + ") ");
            prod.showInfo();
            i += 1;
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}
