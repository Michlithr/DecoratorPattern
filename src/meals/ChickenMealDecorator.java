package meals;

public class ChickenMealDecorator extends MealDecorator{
    public ChickenMealDecorator(Meal meal) {
        super(meal);
    }

    private void addChicken(){
        System.out.println("Chicken added");
    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addChicken();
    }
}
