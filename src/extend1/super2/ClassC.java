package extend1.super2;

public class ClassC extends ClassB {
    public ClassC() {
        // 자바는 생성자가 한개도없으면 기본 생성자를 만들어줌,
        // 하지만 클래스 b에는 생성자가 있어서 자바가 기본생성자를 안만들기때문에 super를 생략 할 수 없기때문에
        // super를 직접 호출해야만 한다.
        super(10,20);

        System.out.println("ClassC 생성자");
    }
}
