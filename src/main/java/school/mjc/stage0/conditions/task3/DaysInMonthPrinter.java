package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if(month<1 || month > 12){
            System.out.println("wrong number!");
        }
        if(month % 2 == 1){
            System.out.println("31");
        }
        if (month % 2 == 0 && month != 2 && month > 0){
            System.out.println("30");
        }
        if(month == 2) {
            System.out.println("28");
        }

    }
}
