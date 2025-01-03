package securefactorypattern;

public class Main {
    public static void main(String[] args) {
        SecurityCredentials credentials = new SecurityCredentials("admin");
        AbstractDatabaseFactory factory = AbstractDatabaseFactory.getInstance();
        DatabaseConnection connection = factory.getConnection(credentials);
        connection.executeQuery("SELECT * FROM sensitive_data");
    }
}