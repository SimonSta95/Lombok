import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Student {
    private final int id;
    private final String name;
    private String address;
    private double grade;

}
