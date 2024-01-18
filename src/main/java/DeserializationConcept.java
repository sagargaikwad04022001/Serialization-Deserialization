import java.io.*;

public class DeserializationConcept {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file=new File("C:\\Users\\User\\Desktop\\text.txt");
        FileInputStream fileInputStream=new FileInputStream(file);
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Student student=(Student) objectInputStream.readObject();
        System.out.println(student);
        fileInputStream.close();
        objectInputStream.close();
    }
}
