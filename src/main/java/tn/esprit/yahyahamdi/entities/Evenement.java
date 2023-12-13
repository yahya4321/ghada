package tn.esprit.yahyahamdi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Evenement implements Serializable {
    @Id

    private int id;
    private String description;
    @DateTimeFormat
    private Date dateDebut;
    @DateTimeFormat
    private Date dateFin;
    @OneToMany(cascade = CascadeType.ALL)
    List<Logistique> logistiques;
    @ManyToMany(cascade = CascadeType.ALL)
    public List<Participant> participants;



}
