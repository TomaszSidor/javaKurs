package pl.sda.blok1.abstra;

public class FoodTest {
    public static void main(String[] args) {
        Food ham = new Ham("szynka ");
        Food chicken = new Chicken("zagrodowy ");
        Food carrot = new Carrot("pomarańczowy ");
        Food salad = new Salad("lododwa ");

        Food[] foods = {ham, chicken, carrot, salad};
        for (int i = 0; i < foods.length; i++){
            Food food = foods[i];
            System.out.println(food.getName() + food.getTaste() +  food.getType());
        }


    }
}
