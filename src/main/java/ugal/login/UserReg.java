package ugal.login;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserReg {
    private static final String url_db = "jdbc:mysql://localhost:3306/agentie_teatru_db?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String USER = "root"; // Replace with your username
    private static final String PASSWORD = "root"; // Replace with your password

    public UserReg(String username, String email, String password, String nume, String pren, String data_nastere, String gen, String tipul_user) {
      
}
}
