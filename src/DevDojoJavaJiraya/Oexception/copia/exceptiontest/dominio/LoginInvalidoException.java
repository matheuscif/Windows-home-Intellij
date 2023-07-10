package DevDojoJavaJiraya.Oexception.copia.exceptiontest.dominio;
import java.util.Scanner;
public class LoginInvalidoException extends Exception{
    public LoginInvalidoException() {
        super("Login inválido");
    }
    public LoginInvalidoException(String message){
        super(message);
    }
}
