package strategy.encoder;

public abstract class Tool {

    private String name;
    private EncodingStrategy encodingStrategy;

    public Tool(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public EncodingStrategy getEncodingStrategy() {
        return encodingStrategy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEncodingStrategy(EncodingStrategy encodingStrategy) {
        this.encodingStrategy = encodingStrategy;
    }

}
