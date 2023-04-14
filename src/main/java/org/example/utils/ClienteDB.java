package org.example.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class ClienteDB {
    private String url = "jdbc:postgresql://salt.db.elephantsql.com/uhjbhiio";
    private String user = "uhjbhiio";
    private String password = "s_AyWIJ2h_ci4I30SvNzs5sg0ck6Oz4Z";

    public void crearCliente(Cliente cliente) {
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = conn.prepareStatement("SELECT crearCliente(?, ?, ?, ?, ?, ?, ?, ?)")) {
            statement.setString(1, cliente.getNombre());
            statement.setString(2, cliente.getNo_documento());
            statement.setString(3, cliente.getTelefono());
            statement.setString(4, cliente.getEdad());
            statement.setString(5, cliente.getCodigoPostal());
            statement.setString(6, cliente.getCalle());
            statement.setString(7, cliente.getNoExterior());
            statement.setString(8, cliente.getNoInterior());
            if (statement.execute()) {
                System.out.println("Se añadio el cliente exitosamente.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
