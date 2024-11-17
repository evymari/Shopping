package baseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "";

        try {
            // Establecer conexión
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Se ha conectado");

            // Crear el Statement
            Statement statement = connection.createStatement();

            // Ejecutar una consulta de inserción (comentada para evitar ejecución accidental)
            // statement.executeUpdate("INSERT INTO users(email, name) VALUES ('paula@gmail.com', 'paula')");

            // Ejecutar una consulta de selección
            ResultSet res = statement.executeQuery("SELECT * FROM users");
            //System.out.println();
            // Procesar el resultado
            //if (res.next()) {System.out.println(res.getString("name"));}

  while (res.next()){
      System.out.println(res.getString("email"));
      System.out.println(res.getString("name"));
  }


        } catch (SQLException ex) {
            System.out.println("Error de conexión: " + ex.getMessage());
        }
    }
}
