/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author TUAN
 */
public class ConnectionDB {

    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=QLNhanSu";
    private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String USER = "sa";
    private static final String PASS = "10031998";
    int a = 0;
    int n = 0;

    //tao doi tuong ket noi
    public static Connection openConnection() {
        Connection con = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public void haha() {
        int b = 10 - a;
    }

    //tao doi tuong dong ket noi
    public static void closeConnection(Connection con, CallableStatement callst) {
        if (con != null) {
            try {
                con.close();
            } catch (Exception e) {
            }
        }

        if (callst != null) {
            try {
                callst.close();
            } catch (Exception e) {
            }
        }
    }
}
