import java.util.List;

public abstract class Animal {
    protected int age; 
    protected boolean alive; 
    protected Location location; 
    protected Field field; 

    public Animal(boolean randomAge, Field field, Location location) {
        this.field = field;
        this.location = location;
        this.age = randomAge ? getRandomAge() : 0;
        this.alive = true;
    }

    public abstract void act(List<Animal> newAnimals);

    protected void incrementAge() {
        age++;
        if (age > getMaxAge()) {
            setDead();
        }
    }

    public boolean canBreed() {
        return age >= getBreedingAge();
    }

    protected void setDead() {
        alive = false;
        if (field != null && location != null) {
            field.clear(location);
            location = null;
            field = null;
        }
    }

    public boolean isAlive() {
        return alive;
    }

    protected int getRandomAge() {
        return Randomizer.getRandom().nextInt(getMaxAge());
    }

    protected void setLocation(Location newLocation) {
        this.location = newLocation;
    }

    protected abstract int getBreedingAge();

    protected abstract int getMaxAge();
}
