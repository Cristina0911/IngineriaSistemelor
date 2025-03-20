package laborator3;

public class Main {
    public static void main(String[] args) {
        PasswordMaker pm = PasswordMaker.getInstance("Cristina");
        System.out.println("Generated Password: " + pm.getPassword());
        PasswordMaker pm2 = PasswordMaker.getInstance("Hategan");
        System.out.println("Generated Password: " + pm2.getPassword());

        System.out.println("getInstance() was accessed " + PasswordMaker.getInstanceAccessCount() + " times.");


    }
}