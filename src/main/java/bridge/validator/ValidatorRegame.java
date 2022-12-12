package bridge.validator;

import bridge.view.ErrorMessage;

public class ValidatorRegame {

    public static void checkInput(String Input){
        if(!Input.equals("R") && !Input.equals("Q")){
            throw new IllegalArgumentException(ErrorMessage.ERROR_RESTART_BUTTON.geterrorMessage());
        }
    }
}
