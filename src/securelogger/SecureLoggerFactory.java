package securelogger;

public abstract class SecureLoggerFactory {

    public static SecureLogger getLogger() {
        return new EncryptLogger();
    }
    private static SecureLoggerFactory instance ;

    public static SecureLoggerFactory getInstance(){
        return instance;
    }
    public static void setInstance(SecureLoggerFactory newFactory){
        instance = newFactory ;
    }
}
