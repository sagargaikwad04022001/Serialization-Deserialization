import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToObject {
    public static void main(String[] args) throws JsonProcessingException {
        String jsonString="{\"id\":101,\"name\":\"sabir\",\"city\":\"Barshi\"}";
        ObjectMapper objectMapper=new ObjectMapper();
        Student student=objectMapper.readValue(jsonString,Student.class);
        System.out.println("ID:"+student.getId());
        System.out.println("Name:"+student.getName());
        System.out.println("City:"+student.getCity());
    }
}
