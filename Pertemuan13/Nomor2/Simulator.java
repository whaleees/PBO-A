import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Simulator {
    private static final int DEFAULT_DEPTH = 20;
    private static final int DEFAULT_WIDTH = 20;
    private static final double FOX_CREATION_PROBABILITY = 0.05;
    private static final double RABBIT_CREATION_PROBABILITY = 0.15;

    private List<Rabbit> rabbits;
    private List<Fox> foxes;
    private Field field;
    private int step;

    public Simulator(int depth, int width) {
        if (width <= 0 || depth <= 0) {
            System.out.println("The dimensions must be greater than zero.");
            System.out.println("Using default values.");
            depth = DEFAULT_DEPTH;
            width = DEFAULT_WIDTH;
        }

        rabbits = new ArrayList<>();
        foxes = new ArrayList<>();
        field = new Field(depth, width);

        reset();
    }

    public void simulate(int numSteps) {
        for (int step = 1; step <= numSteps; step++) {
            simulateOneStep();
            printField();
        }
    }

    public void simulateOneStep() {
        step++;
    
        List<Animal> newAnimals = new ArrayList<>();
    
        for (Iterator<Rabbit> it = rabbits.iterator(); it.hasNext(); ) {
            Rabbit rabbit = it.next();
            rabbit.act(newAnimals); 
            if (!rabbit.isAlive()) {
                it.remove();
            }
        }
    
        for (Iterator<Fox> it = foxes.iterator(); it.hasNext(); ) {
            Fox fox = it.next();
            fox.act(newAnimals); 
            if (!fox.isAlive()) {
                it.remove();
            }
        }
    
        for (Animal animal : newAnimals) {
            if (animal instanceof Rabbit) {
                rabbits.add((Rabbit) animal);
            } else if (animal instanceof Fox) {
                foxes.add((Fox) animal);
            }
        }
    }
    
    public void reset() {
        step = 0;
        rabbits.clear();
        foxes.clear();
        field.clear(); 
        populate();
        printField();
    }
    
    private void populate() {
        Random rand = new Random();
        field.clear(); // Membersihkan grid sebelum populasi
        for (int row = 0; row < field.getHeight(); row++) {
            for (int col = 0; col < field.getWidth(); col++) {
                if (rand.nextDouble() <= FOX_CREATION_PROBABILITY) {
                    Location location = new Location(row, col);
                    Fox fox = new Fox(true, field, location);
                    foxes.add(fox);
                    field.place(fox, location);
                } else if (rand.nextDouble() <= RABBIT_CREATION_PROBABILITY) {
                    Location location = new Location(row, col);
                    Rabbit rabbit = new Rabbit(true, field, location);
                    rabbits.add(rabbit);
                    field.place(rabbit, location);
                }
            }
        }
    }
    

    private void printField() {
        System.out.println("Step: " + step);
        for (int row = 0; row < field.getHeight(); row++) {
            for (int col = 0; col < field.getWidth(); col++) {
                Object animal = field.getObjectAt(new Location(row, col));
                if (animal instanceof Fox) {
                    System.out.print("F "); 
                } else if (animal instanceof Rabbit) {
                    System.out.print("R ");
                } else {
                    System.out.print(". "); 
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}