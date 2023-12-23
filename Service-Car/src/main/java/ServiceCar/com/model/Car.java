package ServiceCar.com.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Car {
    @Id
    @GeneratedValue
    private Long id;
    private String marque;
    private String matricule;
    private String model;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;
}