import java.util.List;

public class Rabbit extends Animal {
    private static final int BREEDING_AGE = 5;
    private static final int MAX_AGE = 40;
    private static final double BREEDING_PROBABILITY = 0.12;
    private static final int MAX_LITTER_SIZE = 4;

    public Rabbit(boolean randomAge, Field field, Location location) {
        super(randomAge, field, location);
    }

    @Override
    public void act(List<Animal> newAnimals) {
        incrementAge();
        if (isAlive()) {
            giveBirth(newAnimals);
            Location newLocation = field.freeAdjacentLocation(location);
            if (newLocation != null) {
                setLocation(newLocation);
            } else {
                setDead();
            }
        }
    }

    private void giveBirth(List<Animal> newAnimals) {
        if (canBreed()) {
            List<Location> freeLocations = field.getFreeAdjacentLocations(location);
            int births = Randomizer.getRandom().nextInt(MAX_LITTER_SIZE + 1);
            for (int b = 0; b < births && !freeLocations.isEmpty(); b++) {
                Location loc = freeLocations.remove(0);
                newAnimals.add(new Rabbit(false, field, loc));
            }
        }
    }

    @Override
    protected int getBreedingAge() {
        return BREEDING_AGE;
    }

    @Override
    protected int getMaxAge() {
        return MAX_AGE;
    }
}
