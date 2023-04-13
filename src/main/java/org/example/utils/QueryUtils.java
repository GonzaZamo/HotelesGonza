package org.example.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class QueryUtils {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://salt.db.elephantsql.com/uhjbhiio";
        String user = "uhjbhiio";
        String password = "s_AyWIJ2h_ci4I30SvNzs5sg0ck6Oz4Z";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del hotel: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la calificación del hotel: ");
        String calificacion = scanner.nextLine();
        System.out.println("Ingrese el código postal: ");
        String codigoPostal = scanner.nextLine();
        System.out.println("Ingrese la calle: ");
        String calle = scanner.nextLine();
        System.out.println("Ingrese el número exterior: ");
        String noExterior = scanner.nextLine();
        System.out.println("Ingrese el número interior: ");
        String noInterior = scanner.nextLine();

        try (
                Connection conn = DriverManager.getConnection(url, user, password);
                PreparedStatement statement = conn.prepareStatement("SELECT crearHotel(?, ?, ?, ?, ?, ?)");
                ){
            statement.setString(1, nombre);
            statement.setString(2, calificacion);
            statement.setString(3, codigoPostal);
            statement.setString(4, calle);
            statement.setString(5, noExterior);
            statement.setString(6, noInterior);
            if(statement.execute()){
                System.out.println("Se añadio el hotel exitosamente.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}