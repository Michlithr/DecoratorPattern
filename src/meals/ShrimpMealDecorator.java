package meals;

public class ShrimpMealDecorator extends MealDecorator {
    public ShrimpMealDecorator(Meal meal) {
        super(meal);
    }

    private void addShrimp(){
        System.out.println("Shrimp added");
    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addShrimp();
    }
}
