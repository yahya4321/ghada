package tn.esprit.yahyahamdi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter



public class Participant implements Serializable {
    @Id
    private int idPart;
    private String nom;
    private boolean prenom;
    @Enumerated
    private Tache tache;
    @ManyToMany(cascade = CascadeType.ALL ,mappedBy = "participants")
    public List<Evenement> evenements;


}
