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
        }
    }
    
    public boolean isAlive() {
        return alive;
    }
    
    protected int getRandomAge() {
        return Randomizer.getRandom().nextInt(getMaxAge());
    }
    
    protected void setLocation(Location newLocation) {
        if (field != null && location != null) {
            field.clear(location);
        }
        location = new Location(newLocation.getRow(), newLocation.getCol());
        if (field != null) {
            field.place(this, location);
        }
    }

    public abstract void act(List<Animal> newAnimals);

    protected abstract int getBreedingAge();

    protected abstract int getMaxAge();
}
