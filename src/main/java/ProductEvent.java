import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class ProductEvent {

    private Long eventId;

    private String eventType;

}
