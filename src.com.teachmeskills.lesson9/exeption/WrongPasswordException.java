package exeption;

public class WrongPasswordException extends Exception{
    private  String wrongPassword;
    public WrongPasswordException(){
        super();
    }
    public WrongPasswordException(String message, String wrongPassword){
        super(message);
        this.wrongPassword = wrongPassword;
    }

    @Override
    public String toString() {
        return "WrongPasswordException{" +
                "wrongPassword='" + wrongPassword + '\'' +
                '}';
    }
}
