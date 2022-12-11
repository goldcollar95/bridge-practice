package bridge.domain;

import bridge.BridgeNumberGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 다리의 길이를 입력 받아서 다리를 생성해주는 역할을 한다.
 */
public class BridgeMaker {
    private final static List<String> upbridge = new ArrayList<>();
    private final static List<String> downbridge = new ArrayList<>();
    private final static String up = "U";
    private final static String down = "D";
    private final static String nothing = " ";
    private final BridgeNumberGenerator bridgeNumberGenerator;

    public BridgeMaker(BridgeNumberGenerator bridgeNumberGenerator) {
        this.bridgeNumberGenerator = bridgeNumberGenerator;
    }

    /**
     * @param size 다리의 길이
     * @return 입력받은 길이에 해당하는 다리 모양. 위 칸이면 "U", 아래 칸이면 "D"로 표현해야 한다.
     */
    public List<String> makeBridge(int size) {
        for(int index = 0; index < size; index++){
            int number = bridgeNumberGenerator.generate();
            System.out.println(number);
            System.out.println(bridgeNumberGenerator);
            if(number == 1){
                return Collections.singletonList("U");
            }
        }
        return Collections.singletonList("D");
    }

    public void bridgeToMove(String directionIndex, String direction){
        upBridge(directionIndex, direction);
        downBridge(directionIndex, direction);
    }


    public void upBridge(String directionIndex, String direction){
        if(directionIndex.equals(up)){
            upbridge.add(direction);
            downbridge.add(nothing);
        }
    }

    public void downBridge(String directionIndex, String direction){
        if(directionIndex.equals(down)){
            upbridge.add(nothing);
            downbridge.add(direction);
        }
    }

    public List<String> getUpBridge(){
        return upbridge;
    }

    public List<String> getDownBridge(){
        return downbridge;
    }

}
