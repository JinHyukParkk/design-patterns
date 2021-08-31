package ioc;

public class Main {

    public static void main(String[] args) {
        String url = "www.naver.com/books/it?page=106&size=20&name=spring-boot";

        // Base64 encoding
        IEncoder encoder = new Encoder(new Base64Encoder());
        String result = encoder.encode(url);
        System.out.println(result);

        // URL encoding
        IEncoder urlEncoder = new Encoder(new UrlEncoder());
        String urlResult = urlEncoder.encode(url);
        System.out.println(urlResult);
    }
}
