package java_contact_app;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class User extends Person {

    private int mCaloriesLimit;
    private int mConsumedCalories;
    

    public User(String mSurname, String mName, String mSex, String mEmail, String mPassword, int mAge, int mWeight, int mHeight) {
        super(mSurname, mName, mSex, mEmail, mPassword, mAge, mWeight, mHeight);
        this.isAdmin=false;
        mConsumedCalories=0;
    }

    public void setCaloriesLimit(int CaloriesLimit) {
        this.mCaloriesLimit = CaloriesLimit;

        Connection con = myConnection.getConnection();
        PreparedStatement ps;

            try {
                ps = con.prepareStatement(DatabaseQuery.setCalories);
                ps.setString(1, Integer.toString(this.mCaloriesLimit));
                ps.setString(2, Integer.toString(this.id));
            } catch(SQLException e) {
                System.out.println("Eroare SQL");
            }
    }

    public void searchFood(String keyword)
    {
        Connection con = myConnection.getConnection();
        PreparedStatement ps;

        try {
            ps = con.prepareStatement(DatabaseQuery.searchFood);
            ps.setString(1, keyword);
            ps.setString(2, keyword);
        } catch(SQLException e) {
            System.out.println("Eroare SQL");
        }
    }

    public void SearchCaloriesLess(int maximum)
    {
        Connection con = myConnection.getConnection();
        PreparedStatement ps;

        try {
            ps = con.prepareStatement(DatabaseQuery.searchFoodCaloriesLess);
            ps.setString(1, Integer.toString(maximum));
        } catch(SQLException e) {
            System.out.println("Eroare SQL");
        }
    }

    public void SearchCaloriesMore(int minimum)
    {
        Connection con = myConnection.getConnection();
        PreparedStatement ps;

        try {
            ps = con.prepareStatement(DatabaseQuery.searchFoodCaloriesMore);
            ps.setString(1, Integer.toString(minimum));
        } catch(SQLException e) {
            System.out.println("Eroare SQL");
        }
    }

    public void checkCalories()
    {
        if(mConsumedCalories>mCaloriesLimit)
            JOptionPane.showMessageDialog(null, "You eat too much");
    }
    
    public void createMenu()
    {
        Menu newmenu = new Menu();
        Connection con = myConnection.getConnection();
        PreparedStatement ps;

        try {
            ps = con.prepareStatement(DatabaseQuery.insertMenu);
            ps.setString(1, Integer.toString(newmenu.getMenuId()));
            ps.setString(2,Integer.toString(this.id));
        } catch(SQLException e) {
            System.out.println("Eroare SQL");
        }
    }

    public void addToMenu(Menu newmenu, Food chestie, int quantity)
    {
        newmenu.getFoodList().put(chestie,quantity);
        this.mConsumedCalories=this.mConsumedCalories+quantity/100*chestie.getmCalories();
        this.checkCalories();
    }

}
