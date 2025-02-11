package personlised_meal_plan;

import java.util.ArrayList;
import java.util.List;

public class MealUtility <T extends MealPlan>{

    List<T>list=new ArrayList<>();

    // to add meals to the list
    public void setMeal(T meal){
        list.add(meal);
    }
    public List<T> getMeal(){
        return list;
    }

}
