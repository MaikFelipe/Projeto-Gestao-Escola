import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/gestao_escolar";
        String usuario = "root";
        String senha = "maik123";

        try {
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conectado ao MariaDB!");
            conexao.close();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
    }
}
