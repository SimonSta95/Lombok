import lombok.Builder;
import lombok.Data;
import lombok.With;

@Builder
public record Teacher(int id,
                      String name,
                      @With
                      String subject) {

}
