public class Person {
    public String name;
    static String secret;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        Person.secret = secret;
    }


}
