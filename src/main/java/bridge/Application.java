package bridge;

import bridge.controller.GameProcess;
import bridge.domain.BridgeMaker;

public class Application {

    public static void main(String[] args) {
        // TODO: 프로그램 구현

        GameProcess gameProcess = new GameProcess();
        gameProcess.start();

    }
}
