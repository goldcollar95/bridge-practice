package bridge.view;

import bridge.validator.ValidatorCommon;
import bridge.validator.ValidatorReadMoving;
import bridge.validator.ValidatorRegame;
import bridge.validator.ValidatorSize;

import static camp.nextstep.edu.missionutils.Console.readLine;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    public static int readBridgeSize() {
        System.out.println(GameMessage.GAME_INPUT_LENGHT.getGameMessage());
        String str = readLine();
        try{
            ValidatorSize.checkList(str);
        }catch(IllegalArgumentException error){
            System.out.println(error.getMessage());
            return readBridgeSize();
        }
        int toMakeStr = Integer.parseInt(str);
        return toMakeStr;
    }


    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        System.out.println(GameMessage.GAME_MOVE_DIRECTION.getGameMessage());
        String str = readLine();
        try{
            ValidatorReadMoving.checkList(str);
            ValidatorCommon.checkUpper(str);
        }catch(IllegalArgumentException error){
            System.out.println(error.getMessage());
            return readMoving();
        }
        return str;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand(){
        System.out.println(GameMessage.GAME_RESTART_AGAIN.getGameMessage());
        String str = readLine();
        try{
            ValidatorRegame.checkInput(str);
            ValidatorCommon.checkUpper(str);
        }catch(IllegalArgumentException error){
            System.out.println(error.getMessage());
            return readGameCommand();
        }
        return str;
    }
}
