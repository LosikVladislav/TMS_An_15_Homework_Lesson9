package authorization;

import exeption.WrongLoginException;
import exeption.WrongPasswordException;

public class Authorization {
    public static boolean inputValidation(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException{
                if(checkLength(login) || checkSpace(login)){
                    throw new WrongLoginException("","Login error. Enter login correctly");
                }
                if(checkLength(password) || checkSpace(password) || !checkDigits(password)){
                    throw  new WrongPasswordException("", "Password error. Enter password correctly");
                }
                if(!password.equals(confirmPassword)){
                    throw new WrongPasswordException("", "Password error. Passwords are not valid");
                }
                return true;
    }
    private static boolean checkLength(String str){
        return str.length() >= 20;
    }
    private static  boolean checkSpace(String str){
        return str.contains(" ");
    }
    private  static boolean checkDigits(String str){
        return str.matches("^[0-9]+$");
    }
}
