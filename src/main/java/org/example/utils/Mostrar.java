package org.example.utils;
import java.sql.*;
import java.util.Scanner;

public class Mostrar {
    static String url = "jdbc:postgresql://salt.db.elephantsql.com/uhjbhiio";
    static String user = "uhjbhiio";
    static String password = "s_AyWIJ2h_ci4I30SvNzs5sg0ck6Oz4Z";
    public static void hoteles() throws Exception{
        String query = "SELECT * FROM hoteles";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String calificacion = rs.getString("calificacion");
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Calificacion: " + calificacion);
            }
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    //TODO: Esta funcion debe regresar una lista de clientes List<Cliente>
    public static void clientes() throws Exception{
        String query = "SELECT * FROM clientes";
        try (Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query)){
            while (rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String no_documento = rs.getString("no_documento");
                String telefono = rs.getString("telefono");
                String edad = rs.getString("edad");
                System.out.println("ID: " + id + " Nombre: " + nombre + " Numero de Documento: " + no_documento + " Telefono: " + telefono + " Edad: " + edad);
            }
        } catch (SQLException e){
            throw new SQLException(e);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Si desea imprimir los hoteles presiona: 1\nSi desea imprimer los clientes presiona: 2");
        String x = scanner.nextLine();
        switch(x){
            case "1":
                hoteles();
                break;
            case "2":
                clientes();
                break;
            default:
                System.out.println("Opcion incorrecta.");
        }
    }
}