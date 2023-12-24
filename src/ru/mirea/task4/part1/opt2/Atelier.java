package ru.mirea.task4.part1.opt2;

public class Atelier {
    public void dressWomen(Clothes clothes[]){
        System.out.println("Женская одежда:");
        for (Clothes cloth : clothes){
            if( cloth instanceof WomenClothing) {
                System.out.print("Размер: ");
                cloth.getSize().getDescription();
                System.out.println("Стоимость: " + cloth.getCost());
                System.out.println("Цвет: " + cloth.getColor());
                ((WomenClothing )cloth).dressWomen();
                System.out.println();
            }
        }
    }
    public void dressMen(Clothes clothes[]){
        System.out.println("Мужская одежда:");
        for (Clothes cloth : clothes){
            if( cloth instanceof MenClothing) {
                System.out.print("Размер: ");
                cloth.getSize().getDescription();
                System.out.println("Стоимость: " + cloth.getCost());
                System.out.println("Цвет: " + cloth.getColor());
                ((MenClothing )cloth).dressMan();
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Pants pants = new Pants(ClothSize.L, 29.99, "Коричневый");
        Skirt skirt = new Skirt(ClothSize.XXS, 29.99, "Розовый");
        Tie tie = new Tie(ClothSize.XS, 9.99, "Красный");
        TShirt tShirt = new TShirt(ClothSize.S, 25.99, "Черный");

        Clothes[] clothes = {pants, skirt, tie, tShirt};

        Atelier atelier = new Atelier();
        atelier.dressWomen(clothes);
        atelier.dressMen(clothes);
    }
}
