package meals;

public class SauceMealDecorator extends MealDecorator {
    public SauceMealDecorator(Meal meal) {
        super(meal);
    }

    private void addSauce(){
        System.out.println("Sauce added");
    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addSauce();
    }
}
