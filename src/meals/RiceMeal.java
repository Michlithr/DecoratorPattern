package meals;

import meals.Meal;

public class RiceMeal extends Meal {
    @Override
    public void prepareMeal() {
        System.out.println("Prepearing meal on the basis of rice...");
    }
}
