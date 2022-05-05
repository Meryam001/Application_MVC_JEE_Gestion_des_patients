package ma.enset.patientsmvc.sec.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class AppRole {
     @Id @GeneratedValue
     private String roleId;
     @Column(unique = true)
     private String roleName;
     private String description;

}
