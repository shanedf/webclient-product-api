import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@EqualsAndHashCode
public class Product {

    private String id;

    private String name;

    private Double price;

}
