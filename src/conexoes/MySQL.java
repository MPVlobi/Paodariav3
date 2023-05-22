package conexoes;

import java.awt.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class MySQL {

    private Connection conn;
    private Statement statement;
    private ResultSet resultSet;

    private String servidor = "localhost:3306";
    private String nomeDoBanco = "Paodaria";
    private String usuario = "root";
    private String senha = "142536";

    public MySQL() {
    }

    public MySQL(String servidor, String nomeDoBanco, String usuario, String senha) {
        this.servidor = servidor;
        this.nomeDoBanco = nomeDoBanco;
        this.usuario = usuario;
        this.senha = senha;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    public void conectaBanco() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://" + servidor + "/" + nomeDoBanco + "?useSSL=false", usuario, senha);

            if (conn != null) {
                System.out.println("Conexão efetuada com sucesso! ID: " + conn);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Conexão não realizada - ERRO: " + e.getMessage());
        }
    }

    public boolean fechaBanco() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (conn != null) {
                conn.close();
            }
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao fechar conexão: " + e.getMessage());
            return false;
        }
    }

    public int insertSQL(String sql) {
        int status = 0;
        try {
            statement = conn.createStatement();
            status = statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return status;
    }

    public void executarSQL(String sql) {
        try {
            statement = conn.createStatement();
            resultSet = statement.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean updateSQL(String sql) {
        try {
            statement = conn.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public ResultSet consultarCPFs() {
        ResultSet resultSet = null;
        try {
            String sql = "SELECT cpf FROM Cliente"; // Substitua "tabela_clientes" pelo nome da tabela onde os CPFs são armazenados
            this.statement = conn.createStatement();
            resultSet = this.statement.executeQuery(sql);
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }
        return resultSet;
    }
     public ResultSet executarConsulta(String query) throws SQLException {
        statement = conn.createStatement();
        return statement.executeQuery(query);
    }
    
}