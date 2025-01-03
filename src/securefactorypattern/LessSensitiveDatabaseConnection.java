package securefactorypattern;

public class LessSensitiveDatabaseConnection implements DatabaseConnection{

    @Override
    public void executeQuery(String query) {
        System.out.println("Less Sensitive DB connection"+query);
    }
}
