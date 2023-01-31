import java.util.Scanner;

public class Burger extends Item{
    private int numberOfTopping;
    private int decidedNumberOfTopping;
    public String toppings = "";
    private boolean deluxe;
    private double burgerPrice = 5;


    @Override
    public String toString() {
        return super.toString() + "Burger{" +
                "numberOfTopping=" + numberOfTopping +
                ", toppings=" + toppings +
                "} ";
    }

    public Burger() {
        pickBurger();
    }

    public void pickBurger(){
        showBurger();
        while(undecidedItem){
            String burger = askInput();

            int burgerInput = 1;
            try {
                burgerInput = Integer.parseInt(burger);
            } catch (NumberFormatException nfe){
                System.out.println("Wrong input");
            };
            setBurger(burgerInput);
        }
    }

    private void setBurger(int burger){

        if (burger == 2){
            this.choice = "Deluxe Burger";
            this.price = 10;
            this.size = "All in";
            this.deluxe = true;
            numberOfTopping = 5;
            addTopping();
            this.price = 10;
            undecidedItem = false;
        }else if (burger == 1){
            this.choice = "Burger";
            this.size = "Regular";
            numberOfTopping = 3;
            addTopping();
            this.price = burgerPrice;
            undecidedItem = false;
        }else {
            System.out.println("Wrong input");
        }


    }
    private void showBurger(){
        System.out.printf("-------- Burger ------- \n" +
                "\t1 -> Regular Burger - 5$ + 3toppings (1~1.5$)\n" +
                "\t2 -> Deluxe Burger - 10$, 5toppings included\n" +
                "-------- Burger ------- \n");
        System.out.println("Choose a burger type");
    }
    public void addTopping(){
        showToppings();
        while(decidedNumberOfTopping < numberOfTopping){
            String topping = askInput();
            setTopping(topping);
        }
    }

    private void showToppings(){
        System.out.printf("-------- Toppings ------- \n" +
                "\t1 -> Onions  - 1$\n" +
                "\t2 -> Pickles - 1.2$\n" +
                "\t3 -> Bacon  - 1.5$\n" +
                "\t4 -> Cabbage  - 1$\n" +
                "\t5 -> Cheese  - 1$\n" +
                "\t6 -> stop ordering toppings \n" +
                "-------- Toppings ------- \n");
        System.out.println("Choose " + (numberOfTopping - decidedNumberOfTopping) + " more amongst those");
    }

    private void setTopping(String topping){
        switch (topping){
            case "1" -> {
                if (!deluxe){burgerPrice += 1;}
                this.toppings += "Onions ";
            }
            case "2" -> {
                if (!deluxe){burgerPrice += 1.2;}
                this.toppings += "Pickles ";
            }
            case "3" -> {
                if (!deluxe){burgerPrice += 1.5;}
                this.toppings += "Bacon ";
            }
            case "4" -> {
                if (!deluxe){burgerPrice += 1;}
                this.toppings += "Cabbage ";
            }
            case "5" -> {
                if (!deluxe){burgerPrice += 1;}
                this.toppings += "Cheese ";
            }
            case "6" -> {
                decidedNumberOfTopping = numberOfTopping;
                return;
            }
            default -> {
                System.out.println("Choose amongst the following list");
                showToppings();
                return;
            }
        }
        decidedNumberOfTopping += 1;
    }
}
