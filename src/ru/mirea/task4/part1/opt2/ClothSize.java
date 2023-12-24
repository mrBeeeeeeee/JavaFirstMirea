package ru.mirea.task4.part1.opt2;

public enum ClothSize {
    XXS(32){
        @Override
        public void getDescription(){
            System.out.println("Детский размер");
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    private final int euroSize;
    private ClothSize(int euroSize){
        this.euroSize = euroSize;
    }

    public void getDescription(){
        System.out.println("Взрослый размер");
    }
}
