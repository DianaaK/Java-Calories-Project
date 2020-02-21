package java_contact_app;

import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Locale;

public class Food {

    private static int idCounter = 0;
    private String mName, mDescription;
    private int mCalories, id;
    private BufferedImage img;

    public Food(String mName, String mDescription, int mCalories, BufferedImage img) {
        this.mName = mName;
        this.mDescription = mDescription;
        this.mCalories = mCalories;
        this.id = idCounter++;
        this.img = img;
    }

    public Food() {
        this.mName="";
        this.mDescription="";
        this.mCalories=0;
        this.img=null;
        this.id=idCounter++;
    }

    public String getmName() {
        return mName;
    }

    public String getmDescription() {
        return mDescription;
    }

    public int getmCalories() {
        return mCalories;
    }

    public int getId() {
        return id;
    }

    public BufferedImage getImg() {
        return img;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public void setmCalories(int mCalories) {

        Connection con = myConnection.getConnection();
        PreparedStatement ps;

        try {
            ps = con.prepareStatement(DatabaseQuery.updateFood);
            ps.setString(1, Integer.toString(this.mCalories));
            ps.setString(2, Integer.toString(this.id));
        } catch(SQLException e) {
            System.out.println("Eroare SQL");
        }
    }

    public void setImg(BufferedImage img) {
        this.img = img;
    }

}
