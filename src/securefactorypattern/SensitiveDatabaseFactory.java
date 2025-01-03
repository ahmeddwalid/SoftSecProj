package securefactorypattern;

public class SensitiveDatabaseFactory extends AbstractDatabaseFactory {

    @Override
    public DatabaseConnection getConnection(SecurityCredentials credentials) {
        if (credentials.getRole().equals("admin")){
            return new SensitiveDatabaseConnection();
        }else {
            return new LessSensitiveDatabaseConnection();
        }
    }
}
