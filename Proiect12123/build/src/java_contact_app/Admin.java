package java_contact_app;


import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Admin extends Person {

    private static Admin admin;

    private Admin() {
        super();
        this.isAdmin=true;
    }

    public static Admin getAdmin()
    {
        if(admin==null)
            admin=new Admin();
        return admin;
    }

    public void createFood(String name, String description, int calories, BufferedImage img)
    {
        Food newfood = new Food();
        try {
            newfood.setmName(name);
            newfood.setmDescription(description);
            newfood.setmCalories(calories);
            newfood.setImg(img);

            Connection con = myConnection.getConnection();
            PreparedStatement ps;

            try {
                ps = con.prepareStatement(DatabaseQuery.insertFood);
                ps.setString(1, Integer.toString(newfood.getId()));
                ps.setString(2, newfood.getmName());
                ps.setString(3, newfood.getmDescription());
                ps.setString(5, Integer.toString(newfood.getmCalories()));
                ps.setString(8, String.valueOf(newfood.getImg()));

            } catch (SQLException e) {
                System.out.println("SQL error");
            }
        } catch (NumberFormatException ex) {
            System.out.println("All fields are required");
        }
    }

    public void createCategory(String name)
    {
        FoodCategory newcategory = new FoodCategory(name);
    }

    public void addToCategory(Food food, FoodCategory category)
    {
        category.insertFood(food);
    }

}
