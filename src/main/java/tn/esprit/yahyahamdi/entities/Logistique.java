package tn.esprit.yahyahamdi.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Logistique implements Serializable {
    @Id
    private int idLog;
    private String description;
    private boolean reserve;
    private float prixUnit;
    private int quantite;

}
