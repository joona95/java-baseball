package baseball.views;

public class OutputView {
    private OutputView() {}

    public static void printBaseballResult(Integer ballCount, Integer strikeCount) {
        if(ballCount > 0)
            System.out.print(ballCount + "볼 ");
        if(strikeCount > 0)
            System.out.print(strikeCount + "스트라이크");
        if(ballCount == 0 && strikeCount == 0)
            System.out.print("낫싱");
        System.out.println();
        if(strikeCount == 3)
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
