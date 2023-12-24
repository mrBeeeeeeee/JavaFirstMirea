package ru.mirea.task4.part1.opt3;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        //Создание каталогов и продуктов
        ArrayList<Catalog> catalogs = new ArrayList<>();
        ArrayList<Product> milkProd = new ArrayList<>();
        milkProd.add(new Product("Bottle of milk", 1.00));
        milkProd.add(new Product("yogurt", 0.5));
        ArrayList<Product> bakery = new ArrayList<>();
        bakery.add(new Product("Bread", 0.25));
        bakery.add(new Product("Bun", 1.00));
        catalogs.add(new Catalog("Milk products", milkProd));
        catalogs.add(new Catalog("Bakery", bakery));

        Cart cart = new Cart();
        Scanner scan = new Scanner(System.in);
        for (Operation operation : Operation.values()){
            doOperation(operation, cart, catalogs, scan);
        }

    }
    public static void doOperation(Operation operation, Cart cart, ArrayList<Catalog> catalogs, Scanner scan){
        switch (operation){
            case LOG_IN:
                System.out.println("Введите логин и пароль:");
                String login = scan.next();
                String password = scan.next();
                User user = new User(login, password);
                break;
            case VIEW_CATALOGS:
                System.out.println("Каталоги: ");
                int i = 0;
                for (Catalog catalog : catalogs){
                    System.out.println("(" + i + ") " + catalog.getName());
                    i += 1;
                }
                break;
            case VIEW_PRODUCTS: {
                System.out.println("Наберите цифру каталога ");
                int catalog_ind = scan.nextInt();
                catalogs.get(catalog_ind).showCatalog();
                break;
            }
            case ADD_TO_CART: {
                System.out.println("Введите желаемый товар: \"0 1\", где 0 - номер каталога, 1- номер товара");
                int catalog_ind = scan.nextInt();
                int product_ind = scan.nextInt();
                cart.addProduct(catalogs.get(catalog_ind).getProducts().get(product_ind));
                break;
            }
            case PURCHASE:
                cart.showProducts();
                System.out.println("Вы успешно купили эти товары!");
                break;
        }
    }
}
