package unir.tfg.fuxpin.fuxpinlegacyventasclientmicroservice.model.database;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TEST")
@Getter @Setter
public class Test {

    @Id
    String test;
}
