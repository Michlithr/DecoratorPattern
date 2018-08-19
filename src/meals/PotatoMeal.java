package meals;

import meals.Meal;

public class PotatoMeal extends Meal {
    @Override
    public void prepareMeal() {
        System.out.println("Prepearing meal on the basis of potatoes...");
    }
}
