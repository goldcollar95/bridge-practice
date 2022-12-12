package bridge.validator;

import bridge.view.ErrorMessage;

public class ValidatorReadMoving {

    public static void checkList(String inputMove){
        checkDirection(inputMove);
    }

    public static void checkDirection(String inputMove){
        if(!inputMove.equals("U") && !inputMove.equals("D")){
            throw new IllegalArgumentException(ErrorMessage.ERROR_MOVE_DIRECTION.geterrorMessage());
        }
    }
}
