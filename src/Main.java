public class Main {
    public static void main(String[] args) {

        int amount = 300; //сумма пополнения
        int check = 100; //сумма на счету
        if (amount > 1000) {
            System.out.println("Итоговый счёт: " + (check + amount + (amount / 100)));
            System.out.println("Количество бонусных рублей: " + amount / 100);
        } else {
            System.out.println(check + amount);
            System.out.println("Количество бонусных рублей: " + 0);
        }
    }
}