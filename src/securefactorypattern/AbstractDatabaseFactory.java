package securefactorypattern;

public abstract class AbstractDatabaseFactory {
    private static AbstractDatabaseFactory defaultInstance;

    public static AbstractDatabaseFactory getInstance(){
        if (defaultInstance == null){
            defaultInstance = new LessSensetiveDatabaseFactory();
        }
        return defaultInstance ;
    }

    public static void setInstance(AbstractDatabaseFactory newInstance){
        defaultInstance = newInstance;
    }

    public abstract DatabaseConnection getConnection(SecurityCredentials credentials);
}
