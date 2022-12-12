package bridge.domain;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {

    private static final String Upper = "U";
    private static final String Correct = "O";
    private static final String Lower = "D";
    private static final String NotCorrect = "X";
    private static int getCount = 1;

    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void move(String direction) {
        if(direction.equals(Upper)){
            direction = Correct;
        }
        if(direction.equals(Lower)){
            direction = NotCorrect;
        }
    }



    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public boolean retry(String direction) {
        if(direction.contains("R")){
            getCount++;
            return true;
        }
        return false;
    }

    public int getCount(){
        return gameCount;
    }
}
