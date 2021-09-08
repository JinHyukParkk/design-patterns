package facade;

public class Main {

    public static void main(String[] args) {
        Ftp ftpClient = new Ftp("www.foo.co.kr", 22, "/home/etc");
        ftpClient.connect();
        ftpClient.moveDirectory();

        Writer writer = new Writer("text.tmp");
        writer.fileConnect();
        writer.write();

        Reader reader = new Reader("text.tmp");
        reader.fileConnect();
        reader.fileRead();

        reader.fileDisconnect();
        writer.fileDisconnect();
        ftpClient.disConnect();

        // 너무 복잡해진다. 파사드 객체로 변경
        SftpClient sftpClient = new SftpClient("www.foo.co.kr", 22, "/home/etc","text.tmp");
        sftpClient.connect();

        sftpClient.writer();

        sftpClient.read();

        sftpClient.disConnect();

    }
}
