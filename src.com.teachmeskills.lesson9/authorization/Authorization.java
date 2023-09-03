package authorization;

import exeption.WrongLoginException;
import exeption.WrongPasswordException;

public class Authorization {
    public static boolean inputValidation(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException{
                if(checkLength(login) || checkSpace(login)){
                    throw new WrongLoginException("","Login error. Enter login correctly");
                }
                if(checkLength(password) || checkSpace2(password) || !checkDigits2(password)){
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
    private  static boolean checkDigits2(String str){
        boolean check = false;
        for(int i = 0; i < str.length(); i++){
            if(str.toCharArray()[i] >= 48 && str.toCharArray()[i] <= 57)
                check = true;
        }
        return check;
    }
    private static boolean checkSpace2(String str){
        boolean check = false;
        for(int i = 0; i < str.length(); i++){
            if(str.toCharArray()[i] == ' ')
                check =true;
        }
        return check;
    }
}
