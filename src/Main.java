public class Main {
    public static void main(String[] args) {
        System.out.println("task 1");
        for (int i = 1; i <= 10; i = i + 1){
            System.out.println(i);
        }
        System.out.println("task 2");
        for (int i = 10; i >= 1; i = i - 1){
            System.out.println(i);
        }
        System.out.println("task 3");
        for (int i = 0; i <= 17; i = i + 2){
            System.out.println(i);
        }
        System.out.println("task 4");
        for (int i = 10; i>=-10; i = i -1){
            System.out.println(i);
        }
        System.out.println("task 5");
        for (int i = 1904; i<=2096; i = i + 4){
            System.out.println(i+" год является високосным");
        }
        System.out.println("task 6");
        for (int i = 7; i<=98; i = i + 7){
            System.out.println(i);
        }

        System.out.println("task 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        System.out.println("task 8");
        int savings = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++){
            total = total + savings;
            System.out.println("Месяц " +i+ " , сумма накоплений равна " + total +" рублей");
        }

        System.out.println("task 9");
        int salary = 29000;
        int totall = 0;
        for (int i = 1; i <= 12; i++) {
            totall = totall + salary;
            totall += totall/100;
            System.out.println("Месяц " + i + " Итого " + totall);
        }

        System.out.println("task 10");
        int a = 2;
        for (int i = 1; i <= 10; i++ ){
            int c = a * i;
            System.out.println("2*" + i + "="+c);
        }









    }
}