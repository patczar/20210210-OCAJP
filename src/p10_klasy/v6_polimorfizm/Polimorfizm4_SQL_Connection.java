package p10_klasy.v6_polimorfizm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Polimorfizm4_SQL_Connection {

	public static void main(String[] args) throws SQLException {
		
		Connection c;

		c = DriverManager.getConnection("jdbc:mysql://mojserwer.org/mojabaza");

		{
			// teraz w zmiennej c mam obiekt klasy MySQLConncetion, który potrafi gadać z bazą MySQL
			// teraz operacje prepareStatement executeQuery zadziałają w taki sposób, jaki jest potrzebny dla MySQL-a
			PreparedStatement stmt = c.prepareStatement("SELECT * FROM products");
			stmt.executeQuery();
			// ....
		}
		
		c = DriverManager.getConnection("jdbc:postgresql://mojserwer.org/mojabaza");

		{
			// teraz w zmiennej c mam obiekt klasy PgConnection, który potrafi gadać z bazą PostgreSQL
			// teraz operacje prepareStatement executeQuery zadziałają w taki sposób, jaki jest potrzebny dla PostgreSQL-a
			PreparedStatement stmt = c.prepareStatement("SELECT * FROM products");
			stmt.executeQuery();
			// ....
		}
		
		c = DriverManager.getConnection("jdbc:sqlite://mojabaza.db");

		{
			// teraz w zmiennej c mam obiekt klasy SQLiteConnection :), który potrafi korzystac z plików z bazami SQLite-owymi
			PreparedStatement stmt = c.prepareStatement("SELECT * FROM products");
			stmt.executeQuery();
			// ....
		}

	}

}
