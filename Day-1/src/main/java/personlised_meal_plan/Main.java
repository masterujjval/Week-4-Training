package personlised_meal_plan;

import java.util.List;

public class Main {
    public static void displayAll(List<? extends MealPlan> l){
        for(MealPlan list:l){
            list.getName();
        }
    }

    public static void main(String[] args) {


        MealUtility<MealPlan> list = new MealUtility<>();

        // Vegan meals
        MealPlan meal1 = new VeganMeal("tofu");
        MealPlan meal2 = new VeganMeal("pan cakes");
        list.setMeal(meal1);
        list.setMeal(meal2);

        // Vegetarian meals
        MealPlan meal3 = new VegetarianMeal("Paneer Kulche");
        MealPlan meal4 = new VegetarianMeal("White sauce pasta");
        list.setMeal(meal3);
        list.setMeal(meal4);

        displayAll(list.getMeal());

    }
}
