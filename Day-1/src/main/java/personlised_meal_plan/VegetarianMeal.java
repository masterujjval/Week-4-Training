package personlised_meal_plan;

import java.sql.SQLOutput;

public class VegetarianMeal implements MealPlan {

String name;
public VegetarianMeal(String name){
    this.name=name;
}

    @Override
    public void getName() {
        System.out.println("The vegetarian meal is: "+name);
    }
}
