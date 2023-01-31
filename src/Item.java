import java.util.Scanner;

public class Item {
    protected String size;
    protected double price;
    protected boolean undecidedItem = true;
    protected boolean undecidedSize = true;

    protected String choice;

    public void showSize(){
        System.out.printf("-------- Size ------- \n" +
                "\t1 -> Small  - -0.5$\n" +
                "\t2 -> Medium + +0$\n" +
                "\t3 -> Tall  - +1$\n" +
                "-------- Drinks ------- \n");
    }

    protected String askInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose number");
        String input = sc.nextLine();
        return input;
    }

    protected void setSize(String size){
        switch (size){
            case "1" -> {this.size = "Small "; this.price -= 0.5;}
            case "2" -> {this.size = "Medium "; this.price += 0;}
            case "3" -> {this.size = "Tall "; this.price += 1;}
            default -> {
                showSize();
                System.out.println("Choose amongst the following list");
                return;
            }
        }
        undecidedSize = false;
    }

    @Override
    public String toString() {
        return "Item{" +
                "size='" + size + '\'' +
                ", choice=" + choice +
                ", price='" + price + '\'' +
                '}';
    }
}
