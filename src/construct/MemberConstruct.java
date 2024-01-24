package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;


    MemberConstruct(String name, int age) { // 생성자 오버로딩
        this(name,age,50); // this를 쓰면 생성자 내부에서 다른 생성자를 호출할수있다. 주의 : 생성자 코드의 첫줄에만 작성할수있다.
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + " age = " + age + " grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
