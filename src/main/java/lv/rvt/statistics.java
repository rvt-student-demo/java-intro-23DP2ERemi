package lv.rvt;

public class statistics {
    private int count;
    private int sum;
    private double avg;

    public statistics(){
        this.count = 0;
        this.sum = 0;
        this.avg = 0;
    }

    public void addNumber(int number) {
        this.sum += number;
        this.count++;
        this.avg = this.sum / this.count;
    }

    public int getCount() {
        return this.count;
    }

    public int Sum() {
        return this.sum;
    }

    public double getAvg(){
        return this.avg;
    }

}

