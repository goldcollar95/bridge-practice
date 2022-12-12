package bridge.validator;

import bridge.view.ErrorMessage;

public class ValidatorSize {


    public static void checkList(String sizeInput){
        checkSize(sizeInput);
        checkNumber(sizeInput);
    }

    public static void checkSize(String sizeInput){
        int size = Integer.parseInt(sizeInput);
            if(size < 3 || size > 20){
                throw new IllegalArgumentException(ErrorMessage.ERROR_GAME_RANGE.geterrorMessage());
            }
        }

    public static void checkNumber(String sizeInput){
        String regex = "^[0-9]*$";
        if(!sizeInput.matches(regex)){
            throw new IllegalArgumentException(ErrorMessage.ERROR_ONLY_NUMBER.geterrorMessage());
        }
    }
}
