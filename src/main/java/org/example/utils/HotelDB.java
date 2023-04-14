package org.example.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HotelDB {
    private String url = "jdbc:postgresql://salt.db.elephantsql.com/uhjbhiio";
    private String user = "uhjbhiio";
    private String password = "s_AyWIJ2h_ci4I30SvNzs5sg0ck6Oz4Z";


    //TODO: crear Hotel? storeHotel, persistHotel....
    public void crearHotel(Hotel hotel) {
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = conn.prepareStatement("SELECT crearHotel(?, ?, ?, ?, ?, ?)")) {
            statement.setString(1, hotel.getNombre());
            statement.setString(2, hotel.getCalificacion());
            statement.setString(3, hotel.getCodigoPostal());
            statement.setString(4, hotel.getCalle());
            statement.setString(5, hotel.getNoExterior());
            statement.setString(6, hotel.getNoInterior());
            if (statement.execute()) {
                System.out.println("Se añadió el hotel exitosamente.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}