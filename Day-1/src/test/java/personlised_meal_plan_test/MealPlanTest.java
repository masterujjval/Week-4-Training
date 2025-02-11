package personlised_meal_plan_test;

import org.junit.Test;
import personlised_meal_plan.MealPlan;
import personlised_meal_plan.MealUtility;
import personlised_meal_plan.VeganMeal;
import personlised_meal_plan.VegetarianMeal;
import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class MealPlanTest {

    @Test
    public void testDisplayMeal() {
        // List to store all meals
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

        // Capture the expected meal names
        List<String> expectedMeals = new ArrayList<>();
        expectedMeals.add("tofu");
        expectedMeals.add("pan cakes");
        expectedMeals.add("Paneer Kulche");
        expectedMeals.add("White sauce pasta");

        // Extract actual meal names from the MealUtility list
        List<String> actualMeals = new ArrayList<>();
        for (MealPlan meal : list.getMeal()) {
            actualMeals.add(meal.toString());  // Ensure MealPlan has getName() method
        }

        // Assert that the expected meals match the actual meals
        assertEquals(expectedMeals, actualMeals);
    }
}
