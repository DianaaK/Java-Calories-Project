package java_contact_app;

import java.util.ArrayList;

public class FoodCategory {
    
    private String name;
    private ArrayList<Food> foodList;

    public FoodCategory(String name) {
        this.name = name;
        this.foodList = null;
    }

    public void insertFood(Food food)
    {
        foodList.add(food);
    }

}
