package pwo.lab10.observer;

import pwo.lab10.observer.Publisher.Subscriber;

public class AverageFinder implements Subscriber {
    Integer sum = 0;
    Integer length = 0;
    Integer average = 1;

    @Override
    public void action(int x) {
        length++;
        sum += x;
        
        average = average == null ? x : sum / length;
    }

    public double getAvg() {
        return average;
    }
}
