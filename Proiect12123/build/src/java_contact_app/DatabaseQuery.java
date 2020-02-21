package java_contact_app;



public class DatabaseQuery {

    public static final String insertUser = "INSERT INTO users (id, name, lastname, age, sex, height, weight, email, password) VALUES (?,?,?,?,?,?,?,?,?)";
    public static final String setCalories = "UPDATE users SET calorieslimit=? WHERE email=?";
    public static final String checkPass= "SELECT password FROM users WHERE email =?";
    public static final String checkEmail="SELECT * FROM users WHERE email = ?";
    public static final String insertFood = "INSERT INTO food (id, name, description, calories, picture)  VALUES (?, ?, ?, ?, ?)";
    public static final String showFood = "SELECT * FROM food";
    public static final String searchFood = "SELECT * FROM food WHERE name = ? OR description LIKE ?";
    public static final String searchFoodCaloriesLess = "SELECT * FROM food WHERE calories < ?";
    public static final String searchFoodCaloriesMore= "SELECT * FROM food WHERE calories > ?";
    public static final String updateFood = "UPDATE food SET calories =  ? WHERE id = ?" ;
    public static final String insertMenu = "INSERT INTO menu (menuid, userid) VALUES(?, ?)";
    public static final String showMenu= "SELECT * FROM menu WHERE userid = ?";
    
}
