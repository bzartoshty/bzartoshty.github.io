public class Tank {
    private int level;
    private int capacity;
    public Tank(int capacity) {
        this.level = 0;
        this.capacity = capacity;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void fill(){
        this.level = this.capacity;
    }
    public void empty(){
        this.level = 0;
    }

    public void pourFrom(Tank tank){
        // Left as exercise
    }
}
