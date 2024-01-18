import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectToJson {
    public static void main(String[] args) throws JsonProcessingException {
        Student student=new Student(102,"sarth","mumbai");
        ObjectMapper objectMapper=new ObjectMapper();
        String jsonString=objectMapper.writeValueAsString(student);
        System.out.println("Json Representation:"+student);
    }
}
