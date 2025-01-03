package securefactorypattern;

public class SensitiveDatabaseConnection implements DatabaseConnection{

    @Override
    public void executeQuery(String query) {
        System.out.println("sensitive db connection"+query);
    }
}
