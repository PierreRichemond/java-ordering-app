public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger();
        ItemDrink drink = new ItemDrink();
        ItemDish dish = new ItemDish();
        Meal meal = new Meal(burger, dish, drink);
        System.out.println(meal.printBill());
    }
}