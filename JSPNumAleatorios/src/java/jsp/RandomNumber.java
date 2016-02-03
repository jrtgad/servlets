package jsp;

public class RandomNumber {

    private int number;

    public RandomNumber(int number) {
        this.number = (int) (Math.random() * 100 +1);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
