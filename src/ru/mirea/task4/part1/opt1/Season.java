package ru.mirea.task4.part1.opt1;
public enum Season {

    WINTER(-5),
    SPRING(8),
    SUMMER(19){
        @Override
        public String getDescription(){
            return "Теплое время года";
        }
    },
    AUTUMN(14)
    ;

    private final int avg_temp;
    private Season(int avg_temp){
        this.avg_temp = avg_temp;
    }

    public void name(Season season){
        switch (season){
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }

    public String getDescription(){
        return "Холодное время года";
    }

    @Override
    public String toString() {
        return "средняя температура=" + avg_temp;
    }
}
