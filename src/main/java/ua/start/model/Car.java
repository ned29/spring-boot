package ua.start.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String car;
    @OneToMany(targetEntity = Description.class,cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
    private List<Description> descriptions;

    public Car(String car, List<Description> descriptions) {
        this.car = car;
        this.descriptions = descriptions;
    }
}
