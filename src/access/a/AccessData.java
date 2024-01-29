package access.a;

public class AccessData {

    public int publicField;
    int defaultFiled;
    private int privateFiled;

    public void publicMethod() {
        System.out.println("publicMethod 호출 = " + publicField);
    }

    void defaultMethod() {
        System.out.println("default Method 호출 = " + defaultFiled);
    }

    private void privateMethod() {
        System.out.println("private Method 호출 = " + privateFiled);
    }

    public void innerAccess() {
        System.out.println("내부 호출");
        publicField = 100;
        defaultFiled = 200;
        privateFiled = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
