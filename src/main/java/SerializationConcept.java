import java.io.*;

public class SerializationConcept {

    public static void main(String[] args) throws IOException {
        Student student=new Student(1,"sagar","Bengaluru");
        File file=new File("C:\\Users\\User\\Desktop\\text.txt");
        if(!file.exists())
            {
                System.out.println("Not exist creating it");
                file.createNewFile();
                System.out.println("file created");
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);
            System.out.println("data written to file");
            fileOutputStream.close();
            objectOutputStream.close();

    }
}
