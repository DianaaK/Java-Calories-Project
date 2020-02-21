package java_contact_app;

import java.util.HashMap;


public class Menu {

    private static int idCounter = 0;
    private int menuId;
    private HashMap<Food, Integer> foodList;

    public Menu() {
        this.menuId = idCounter++;
        this.foodList=null;
    }

    public int getMenuId() {
        return menuId;
    }

    public HashMap<Food, Integer> getFoodList() {
        return foodList;
    }

}
