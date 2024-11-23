import java.util.List;

public class Fox extends Animal {
    private static final int BREEDING_AGE = 5;
    private static final int MAX_AGE = 15;
    private static final double BREEDING_PROBABILITY = 0.1;
    private static final int MAX_LITTER_SIZE = 4;
    private static final int RABBIT_FOOD_VALUE = 9;

    private int foodLevel; // Tracks hunger

    public Fox(boolean randomAge, Field field, Location location) {
        super(randomAge, field, location);
        foodLevel = Randomizer.getRandom().nextInt(RABBIT_FOOD_VALUE);
    }

    @Override
    public void act(List<Animal> newAnimals) {
        incrementAge();
        incrementHunger();
        if (isAlive()) {
            giveBirth(newAnimals);
            Location newLocation = findFood();
            if (newLocation == null) {
                newLocation = field.freeAdjacentLocation(location);
            }
            if (newLocation != null) {
                setLocation(newLocation);
            } else {
                setDead();
            }
        }
    }

    private void incrementHunger() {
        foodLevel--;
        if (foodLevel <= 0) {
            setDead();
        }
    }

    private Location findFood() {
        List<Location> adjacent = field.getAdjacentLocations(location);
        for (Location loc : adjacent) {
            Object animal = field.getObjectAt(loc);
            if (animal instanceof Rabbit) {
                Rabbit rabbit = (Rabbit) animal;
                if (rabbit.isAlive()) {
                    rabbit.setDead();
                    foodLevel = RABBIT_FOOD_VALUE;
                    return loc;
                }
            }
        }
        return null;
    }

    private void giveBirth(List<Animal> newAnimals) {
        if (canBreed()) {
            List<Location> freeLocations = field.getFreeAdjacentLocations(location);
            int births = Randomizer.getRandom().nextInt(MAX_LITTER_SIZE + 1);
            for (int b = 0; b < births && !freeLocations.isEmpty(); b++) {
                Location loc = freeLocations.remove(0);
                newAnimals.add(new Fox(false, field, loc));
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
