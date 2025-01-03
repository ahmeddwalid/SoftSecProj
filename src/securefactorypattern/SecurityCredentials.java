package securefactorypattern;

public class SecurityCredentials {
    private final String role;

    public SecurityCredentials(String role){
        this.role =role;
    }

    public String getRole(){
        return role;
    }
}
