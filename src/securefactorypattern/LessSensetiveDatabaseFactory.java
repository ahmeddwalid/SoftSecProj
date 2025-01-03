package securefactorypattern;

public class LessSensetiveDatabaseFactory extends AbstractDatabaseFactory {
    @Override
    public DatabaseConnection getConnection(SecurityCredentials credentials) {
        return new LessSensitiveDatabaseConnection();
    }
}