package bridge.validator;

import bridge.view.ErrorMessage;

public class ValidatorSize {


    public static void checkList(String input){
        checkSize(input);
        checkNumber(input);
    }

    public static void checkSize(String input){
        int size = Integer.parseInt(input);
            if(size < 3 || size > 20){
                throw new IllegalArgumentException(ErrorMessage.ERROR_GAME_RANGE.geterrorMessage());
            }
        }

    public static void checkNumber(String input){
        String regex = "^[0-9]*$";
        if(!input.matches(regex)){
            throw new IllegalArgumentException(ErrorMessage.ERROR_ONLY_NUMBER.geterrorMessage());
        }
    }
}
