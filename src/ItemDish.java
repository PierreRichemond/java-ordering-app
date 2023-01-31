public class ItemDish extends Item {
    private String type;

    ItemDish() {
        super();
        SelectDish();
    }


    private void SelectDish(){
        showDish();
        while(undecidedItem){
            String dish = askInput();
            setDrink(dish);
        }
        showSize();
        while(undecidedSize){
            String size = askInput();
            super.setSize(size);
        }
        System.out.println(toString());
    }

    private void showDish(){
        System.out.printf("-------- Side dish ------- \n" +
                "\t1 -> Fries  - 1.5$\n" +
                "\t2 -> Potatoes - 2$\n" +
                "\t3 -> Onion rings  - 2.5$\n" +
                "-------- Side dish ------- \n");
    }

    private void setDrink(String drink){
        switch (drink){
            case "1" -> {super.choice = "Fries"; super.price = 1.5;}
            case "2" -> {this.choice = "Potatoes"; super.price = 2;}
            case "3" -> {this.choice = "Onion rings"; super.price = 2.5;}
            default -> {
                showDish();
                System.out.println("Choose amongst the following list");
                return;
            }
        }
        undecidedItem = false;
    }
}
