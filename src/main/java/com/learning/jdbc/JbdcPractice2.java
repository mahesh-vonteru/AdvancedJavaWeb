package com.learning.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JbdcPractice2 {
    public static void main(String[] args) throws SQLException {
        int choice=0;
        Student st = new Student();
        do {
            System.out.println("Enter you are choice following options");
            System.out.println("1.insert student details\n2.Change Student password \n 5.Exit ");
            Scanner choicein = new Scanner(System.in);
            choice = choicein.nextInt();
            switch (choice) {
                case 1:
                st.insertDetails();
                break;
                case 2:
                    st.changePassword();
                    break;
            }
        }while(choice!=5);
        System.out.println("Thanks for using our Software");

    }
}
@SuppressWarnings("ALL")
class Student
{
    private String name;
    private String password;
    private int marks;
    private String college;
    Scanner input = new Scanner(System.in);
    public void insertDetails() throws SQLException
    {
        Connection con = ConnectionFactory.produceConnection();
        PreparedStatement pst = null;

        System.out.println("Enter Student name");
        name = input.nextLine();
        System.out.println("Enter password");
        password = input.nextLine();
        System.out.println("Enter Student marks");
        marks = input.nextInt();
        System.out.println("Enter Student College  name");
        college = input.next();
        System.out.println("Thank you for the details.  Saving..");
        try{

            String query =  "INSERT INTO jdbc.student VALUES (?, ?, ?, ?);";
            pst = con.prepareStatement(query);
            pst.setString(1,name);
            pst.setString(2,password);
            pst.setInt(3,marks);
            pst.setString(4,college);
            int x = pst.executeUpdate();
            System.out.println(x+"row updated");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally
        {
            if(con != null)
                con.close();

            if(pst != null)
                pst.close();
        }

    }
    public void changePassword() throws SQLException {
        Connection con = ConnectionFactory.produceConnection();
        PreparedStatement pst = null;
        System.out.println("Enter Student name");
        name = input.nextLine();
        System.out.println("Enter password");
        password = input.nextLine();
        try {
            String query = "UPDATE jdbc.student UPDATE SET passward=? WHERE name=?";
            pst = con.prepareStatement(query);
            pst.setString(1, password);
            pst.setString(2, name);
            int i= pst.executeUpdate();
            if(i>0){
                System.out.println("RECORD UPDATE SUCCESS FULLY");
            }else {
                System.out.println("NO SUCH RECORD IN DATA BASE");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if(con != null)
                con.close();

            if(pst != null)
                pst.close();
        }
    }
    }
