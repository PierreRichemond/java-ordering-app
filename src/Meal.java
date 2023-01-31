public class Meal {

    private Burger burger;
    private ItemDish dish;
    private ItemDrink drink;

    public Meal() {
        this(new Burger(), new ItemDish(), new ItemDrink());
    }

    public Meal(Burger burger, ItemDish dish, ItemDrink drink) {
        this.burger = burger;
        this.dish = dish;
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "burger=" + burger +
                ", dish=" + dish +
                ", drink=" + drink +
                '}';
    }

    public String printBill(){
        String bill = "";
        bill += "Invoice :\n";
        bill += "\tBurger :\n";
        bill += "\t\t" + burger.choice + ":" + burger.price + "$\n";
        bill += "\t\t" + "toppings = " + burger.toppings + "\n";
        bill += "\tSide dish :\n";
        bill += "\t\t" + dish.choice + " " +dish.size + "size: " + dish.price + "$" + "\n";
        bill += "\tDrink :\n";
        bill += "\t\t" + drink.choice + " "+ drink.size + "size:" + drink.price + "$" + "\n";
        bill += "Total :\n" + totalPrice() + "$";
        return bill;
    }

    private double totalPrice(){
        return burger.price + dish.price + drink.price;
    }
}
