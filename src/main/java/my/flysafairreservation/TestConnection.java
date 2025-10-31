/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.flysafairreservation;
import java.sql.Connection;

public class TestConnection {
    public static void main(String[] args) {
        Connection conn = DatabaseConnector.connect();
        if (conn != null) {
            System.out.println("✅ Connected to MySQL!");
        } else {
            System.out.println("❌ Connection failed.");
        }
    }
}
