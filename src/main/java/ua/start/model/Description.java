package ua.start.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Description {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int price;

    private String color;

    private String model;

    public Description(int price, String color, String model) {
        this.price = price;
        this.color = color;
        this.model = model;
    }
}