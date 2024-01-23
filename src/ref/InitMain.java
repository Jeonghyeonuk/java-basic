package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("초기화 하지 않은 변수 : " + data.value1);
        System.out.println("10으로 초기화 한 변수 : " + data.value2);
    }
}
