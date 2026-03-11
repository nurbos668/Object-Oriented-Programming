package lab01;

public class Data {
    private int cnt;
    private double sum;
    private double max;

    public Data() {
        cnt = 0;
        sum = 0;
        max = -100000;
    }

    public void add(double n) {
        cnt++;
        sum += n;
        if (n > max) {
            max = n;
        }
    }

    public double getAverage() {
        if (cnt == 0) return 0;
        return(sum / cnt);
    }

    public double getMax() {
        if(cnt == 0) return 0;
        return(max);
    }
}
