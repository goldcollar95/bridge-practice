package bridge.validator;

import bridge.view.ErrorMessage;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.LowerCase;

import java.util.Locale;

public class ValidatorCommon {


    public static void checkLength(String input){
        if(input.length() == 0){
            throw new IllegalArgumentException(ErrorMessage.ERROR_ISNOT_EMPTY.geterrorMessage());
        }
    }

    public static void checkOneMore(String input){
        if(input.length() < 1){
            throw new IllegalArgumentException(ErrorMessage.ERROR_ONE_EXCESS.geterrorMessage());
        }
    }

    public static void checkUpper(String input){
        String str = input.toUpperCase();
        if(!input.equals(str)){
            throw new IllegalArgumentException(ErrorMessage.ERROR_UPPERCASE.geterrorMessage());
        }
    }
}
