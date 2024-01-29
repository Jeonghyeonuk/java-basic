package access.ex;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (count >= max){
            System.out.println("더이상 증가 할 수 없습니다.");
            return;
        } else {
            count++;
        }
    }
    public int getCount() {
        return count;
    }
}
