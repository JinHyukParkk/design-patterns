package strategy;

public class Main {

    public static void main(String[] args) {
        String message = "hello java";

        Tool gomTool = new GomTool("GOM");

        gomTool.setEncodingStrategy(new Base64Strategy());
        String base64Result = gomTool.getEncodingStrategy().encode(message);
        System.out.println(base64Result);

        gomTool.setEncodingStrategy(new NormalStrategy());
        String normalResult = gomTool.getEncodingStrategy().encode(message);
        System.out.println(normalResult);

        gomTool.setEncodingStrategy(new AppendStrategy());
        String appendResult = gomTool.getEncodingStrategy().encode(message);
        System.out.println(appendResult);
    }
}
