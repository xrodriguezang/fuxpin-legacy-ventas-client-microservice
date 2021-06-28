package unir.tfg.fuxpin.fuxpinlegacyventasclientmicroservice.repository;

import org.springframework.data.repository.CrudRepository;
import unir.tfg.fuxpin.fuxpinlegacyventasclientmicroservice.model.database.Test;

public interface TestRepository extends CrudRepository<Test, Long> {
}
