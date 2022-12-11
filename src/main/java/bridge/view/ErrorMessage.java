package bridge.view;

public enum ErrorMessage {
    ERROR_GAME_RANGE("[ERROR] 다리 길이는 3부터 20 사이의 숫자여야 합니다."),
    ERROR_MOVE_DIRECTION("[ERROR] U와 D이외에 들어올수 없습니다."),
    ERROR_RESTART_BUTTON("[ERROR] R와 Q이외에 들어올수 없습니다."),
    ERROR_ISNOT_EMPTY("[ERROR] 빈칸은 들어올 수 없습니다.");

    private final String errorMessage;

    ErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
        public String geterrorMessage(){
            return errorMessage;
    }
}
