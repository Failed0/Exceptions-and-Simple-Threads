

public class Gate implements  Runnable{

    int numberOfGuests;

    public Gate(Counter counter, int numberOfGuests){
        this.numberOfGuests = numberOfGuests;
    }

    @Override
    public void run() {
        Counter counter1 = new Counter();

        for(int i = 0; i < numberOfGuests; i++) {
            counter1.addOne();
        }
    }
}
