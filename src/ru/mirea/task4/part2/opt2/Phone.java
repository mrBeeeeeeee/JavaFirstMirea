package ru.mirea.task4.part2.opt2;

public class Phone {
    private String number;
    private String model;
    private double weight;


    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }


    public Phone() {
    }

    public void recieveCall(String name){
        System.out.println("Звонит {" + name + "}");
    }

    public void recieveCall(String name, String number){
        System.out.println("Звонит {" + name + " - " + number+ "}");
    }

    public void sendMessege(String... numbers){
        System.out.println("Вы отправили сообщение на эти номера:");
        for (String number : numbers){
            System.out.println(number);
        }
    }
    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
