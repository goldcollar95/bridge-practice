package bridge.view;

public enum GameMessage {

    GAME_START_MESSAGE("다리 건너기 게임을 시작합니다"),
    GAME_INPUT_LENGHT("다리의 길이를 입력해주세요"),
    GAME_MOVE_DIRECTION("이동할 칸을 선택해주세요. (위: U, 아래: D"),
    GAME_RESTART_AGAIN("게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q"),
    GAME_JUDGEMENT("게임 성공 여부: "),
    GAME_TOTAL_TRY("총 시도한 횟수: ");

    private final String gameMessage;

    GameMessage(String gameMessage){
        this.gameMessage = gameMessage;
    }

    public String getGameMessage(){
        return gameMessage;
    }

}
