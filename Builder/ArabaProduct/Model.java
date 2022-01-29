public class Model {
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Model(String model) {
        setModel(model);
    }

    @Override
    public String toString() {
        return "Model {" +
                "model='" + model + '\'' +
                '}';
    }
}
