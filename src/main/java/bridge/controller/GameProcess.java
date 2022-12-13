package bridge.controller;

import bridge.BridgeNumberGenerator;
import bridge.BridgeRandomNumberGenerator;
import bridge.domain.BridgeGame;
import bridge.domain.BridgeMaker;
import bridge.view.InputView;
import bridge.view.OutputView;

import java.util.List;

public class GameProcess {

    private static List<String> bridges;
    private static int location = 0;
    private static String FAIL = "X";
    private static boolean status = true;
    private final InputView inputView = new InputView();
    private final BridgeNumberGenerator bridgeNumberGenerator = new BridgeRandomNumberGenerator();
    private final BridgeMaker bridgeMaker = new BridgeMaker(bridgeNumberGenerator);
    private final BridgeGame bridgeGame = new BridgeGame();
    private final OutputView outputView = new OutputView();

    public void GameProcess(){
        location = 0;
        status = true;
        bridgeMaker.gameInit();

    }

    public void start(){

        int bridgesize = inputView.readBridgeSize();
        bridges = bridgeMaker.makeBridge(bridgesize);
        outputView.printResult();
        System.out.println();
        display();
    }


    public void display(){
        while(status && location < bridges.size()){
            String direction = inputView.readMoving();
            String moveResult = bridgeGame.moveSecond(bridges, direction, location);
            bridgeMaker.bridgeToMove(direction, moveResult);
            outputView.printMap();
            restartGame(moveResult);
            location++;
        }
    }

    public void restartGame(String moveResult){
        if(moveResult.equals(FAIL)){
            String reStart = inputView.readGameCommand();
            if(bridgeGame.retry(reStart)){
                new GameProcess();
                display();
            }
            status = false;
        }
    }

}
