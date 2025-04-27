package net.cherkaoui.hospitalapp.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@NoArgsConstructor @AllArgsConstructor @Data @Getter @Setter
@Builder
@Table(name = "patients")
@ToString
@Entity
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
    private String name;
    private Date DateNaissance;
    private int score;
    private boolean malade;
}
