package personlised_meal_plan;

public class VeganMeal implements MealPlan{
    String name;
    public VeganMeal(String name){
        this.name=name;
    }

    @Override
    public void getName() {
        System.out.println("The vegan meal is: "+name);
    }
}
