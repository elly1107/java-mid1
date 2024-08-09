package nested.inner.ex1;

public class Car {
    private String model;
    private int chargedLevel;
    private Engine engine;

    public Car(String model, int chargedLevel, Engine engine) {
        this.model = model;
        this.chargedLevel = chargedLevel;
        this.engine = new Engine(this);
    }

    public String getModel() {
        return model;
    }

    public int getChargedLevel() {
        return chargedLevel;
    }

    public void start(){
        engine.start();
        System.out.println(model + " 시작 완료");
    }
}
