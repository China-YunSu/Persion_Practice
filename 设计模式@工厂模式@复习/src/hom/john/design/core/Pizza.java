package hom.john.design.core;

public abstract class Pizza {
    protected String name;
    protected Clam clam;
    protected Dough dough;
    protected Sauce sauce;

    public Pizza (String pizzaName) {
        this.name =  pizzaName;
    }

    protected abstract void prepare();

    protected void bake() {
        System.out.println(name + " is baking");
    }

    protected void cut() {
        System.out.println(name + " is cutting");
    }

    protected void box() {
        System.out.println(name + " is boxing");
    }
}
