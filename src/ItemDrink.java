import java.util.Scanner;

public class ItemDrink extends Item {

    private String type;

    public ItemDrink() {
        super();
        SelectDrink();
    }

    private void SelectDrink(){
        showDrinks();
        while(undecidedItem){
            String drink = askInput();
            setDrink(drink);
        }
        showSize();
        while(undecidedSize){
            String size = askInput();
            super.setSize(size);
        }
        System.out.println(toString());
    }

    private void showDrinks(){
        System.out.printf("-------- Drinks ------- \n" +
                "\t1 -> Soda  - 2$\n" +
                "\t2 -> Water - 1$\n" +
                "\t3 -> Juice  - 1.5$\n" +
                "-------- Drinks ------- \n");
    }

    private void setDrink(String drink){
        switch (drink){
            case "1" -> {super.choice = "Soda"; super.price = 2;}
            case "2" -> {this.choice = "Water"; super.price = 1;}
            case "3" -> {this.choice = "Juice"; super.price = 1.5;}
            default -> {
                showDrinks();
                System.out.println("Choose amongst the following list");
                return;
            }
        }
        undecidedItem = false;
    }
}
