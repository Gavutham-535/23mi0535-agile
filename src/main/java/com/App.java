import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class App{
    public String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }
}