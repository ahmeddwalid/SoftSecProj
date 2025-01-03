package securelogger;

public class Main {
    public static void main(String[] args) {
        SecureLogger logger = SecureLoggerFactory.getLogger();
        String creditCardInfo = "30303030303030";
        String address = "alex";
        String orderDetails = "2products";

        logger.log(creditCardInfo);
        logger.log(address);
        logger.log(orderDetails);
    }
}