package ru.mirea.task4.part2.opt2;

public class Test {
    public static void main(String[] args) {
        Phone[] phones = new Phone[3];
        phones[0] = new Phone("89123321223", "Samsung A22");
        phones[1] = new Phone("89651235217", "IPhone 12", 0.2);
        phones[2] = new Phone();
        for (Phone phone : phones){
            System.out.println(phone.toString());
        }
        phones[0].recieveCall("Valera");
        phones[1].recieveCall("Президент США", "000");
        phones[0].sendMessege("89651235217", "123123142413", "0000");
    }
}
