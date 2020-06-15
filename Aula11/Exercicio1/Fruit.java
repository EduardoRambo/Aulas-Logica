public abstract class Fruit {

    protected String color;
    
    public Fruit() {
    }
    
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract String eat();
    public abstract String peelFruit();
}

