package com.learning.jdbc;
import java.sql.*;
import java.util.Scanner;

public class JbdcPractice2
{
    public static void main(String[] args) throws SQLException {
        int choice=0;
        Student st = new Student();
        do {
            System.out.println("ENTER YOUR CHOICE FOLLOWING ");
            System.out.println("1.INSERT STUDENT DETAILS \n 2.CHANGE STUDENT PASSWORD \n 3.DELETE RECORD FROM LIST \n" +
                    "4.SEARCH FOR A RECORD \n 5.Exit ");
            Scanner choicein = new Scanner(System.in);
            choice = choicein.nextInt();
            switch (choice) {
                case 1:
                st.insertDetails();
                break;
                case 2:
                    st.changePassword();
                    break;
                case 3:
                    st.deleteRecord();
                    break;
                case 4:
                    st.searchRecord();
                    break;
            }
        }while(choice!=5);
        System.out.println("THANKS FOR USING OUR SOFT WARE");

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

        System.out.println("ENTER STUDENT NAME");
        name = input.nextLine();
        System.out.println("ENTER PASS WORD");
        password = input.nextLine();
        System.out.println("ENTER COLLEGE NAME");
        college = input.nextLine();
        System.out.println("ENTER MARKS ACHIEVE ");
        marks = input.nextInt();
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
    public void changePassword() throws SQLException
    {
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
    public void deleteRecord() throws SQLException
    {
     /*  Connection con = ConnectionFactory.produceConnection();
        PreparedStatement pst = null;
        System.out.println("ENTER WHICH RECORD YOU WANT TO DELETE (NAME OF THE STUDENT)");
        String name = input.nextLine();
        try {

            String query = "DELETE FROM  jdbc.student WHERE name=?;";
            pst = con.prepareStatement(query);
            pst.setString(1, name);
            int i= pst.executeUpdate();
            if(i>0){
                System.out.println("RECORD DELETE SUCCESS FULLY");
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
        }*/
    }
    public void searchRecord() throws SQLException
    {
        Connection con = ConnectionFactory.produceConnection();
        PreparedStatement pst = null;
        System.out.println("ENTER WHICH RECORD YOU WANT TO DELETE (NAME OF THE STUDENT)");
        String name = input.nextLine();
        try {

            String query = "SELECT name, passward, marks, college FROM jdbc.student where name=?;";
            pst = con.prepareStatement(query);
            pst.setString(1, name);
           ResultSet rs = pst.executeQuery();
           String userdata="";
           if(rs.next()==false){
                System.out.println("NO SUCH RECORD IN DATA BASE");
            }else {
                userdata = " "+rs.getString(1)+"  "+rs.getString(2)+"  "+
                                    rs.getInt(3)+"  "+rs.getString(4);
                System.out.println(userdata);
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
