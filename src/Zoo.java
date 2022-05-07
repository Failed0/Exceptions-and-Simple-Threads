
public class Zoo {

    public static void main(String[] args) {
        Counter counter = new Counter();


        Gate gate1 = new Gate(counter,5);
        Gate gate2 = new Gate(counter, 7);
        Gate gate3 = new Gate(counter, 9);

        gate1.run();
        gate2.run();
        gate3.run();

        System.out.println(gate1.numberOfGuests + gate2.numberOfGuests + gate3.numberOfGuests);


    }
}
