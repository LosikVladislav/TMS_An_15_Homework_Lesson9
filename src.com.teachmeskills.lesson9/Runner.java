import authorization.Authorization;
import exeption.WrongLoginException;
import exeption.WrongPasswordException;

public class Runner {
    public static void main(String[] args) {
        String login = "vladislav";
        String password = "vladqwert99";
        String confirmPassword = "vladqwert99";

        boolean registry = false;

        try {
            registry = Authorization.inputValidation(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println(e.toString());
        } catch (WrongPasswordException e) {
            System.out.println(e.toString());
        }

    }
}
