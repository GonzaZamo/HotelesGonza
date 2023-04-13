package org.example.utils;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Si desea crear un hotel presiona: 1\nSi desea ingresar un cliente presiona: 2");
        String x = scanner.nextLine();
        switch(x){
            case "1":
                crearUnHotel();
                break;
            case "2":
                crearUnCliente();
                break;
            default:
                System.out.println("Opcion incorrecta.");
        }
    }
    public static void crearUnHotel(){
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

        Hotel hotel = new Hotel(nombre, calificacion, codigoPostal, calle, noExterior, noInterior);

        HotelDB hotelDB = new HotelDB();
        hotelDB.crearHotel(hotel);
    }
    public static void crearUnCliente(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el numero de documentos del cliente: ");
        String no_documento = scanner.nextLine();
        System.out.println("Ingrese el numero de telefono del cliente: ");
        String telefono = scanner.nextLine();
        System.out.println("Ingrese la edad del cliente: ");
        String edad = scanner.nextLine();
        System.out.println("Ingrese el código postal: ");
        String codigoPostal = scanner.nextLine();
        System.out.println("Ingrese la calle: ");
        String calle = scanner.nextLine();
        System.out.println("Ingrese el número exterior: ");
        String noExterior = scanner.nextLine();
        System.out.println("Ingrese el número interior: ");
        String noInterior = scanner.nextLine();

        Cliente cliente = new Cliente(nombre, no_documento, telefono, edad, codigoPostal, calle, noExterior, noInterior);

        ClienteDB clienteDB = new ClienteDB();
        clienteDB.crearCliente(cliente);
    }
}