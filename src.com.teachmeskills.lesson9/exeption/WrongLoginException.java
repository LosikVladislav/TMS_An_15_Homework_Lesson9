package exeption;

public class WrongLoginException extends Exception {
    String wrongLogin;
    public WrongLoginException(){
        super();
    }
    public WrongLoginException(String message, String wrongLogin){
        super(message);
        this.wrongLogin = wrongLogin;
    }

    @Override
    public String toString() {
        return "WrongLoginException{" +
                "wrongLogin='" + wrongLogin + '\'' +
                '}';
    }
}
