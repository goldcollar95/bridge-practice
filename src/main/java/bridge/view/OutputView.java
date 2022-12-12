package bridge.view;

import java.util.ArrayList;
import java.util.List;

import static bridge.domain.BridgeMaker.getDownBridge;
import static bridge.domain.BridgeMaker.getUpBridge;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {
    private static final String Center = "|";
    private static final String Left = "[";
    private static final String Right = "]";
    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printMap() {
        List<String> str = new ArrayList<>();
        System.out.println(Left + centerBridge(getUpBridge()) + Right);
        System.out.println(Left + centerBridge(getDownBridge()) + Right);

    }

    private String centerBridge(List<String> updownbridge){
        return String.join(Center, updownbridge);
    }

    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printResult() {
    }


    public int tryCount(int bridgeSize){

    }
}
