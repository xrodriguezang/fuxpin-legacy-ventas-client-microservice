package unir.tfg.fuxpin.fuxpinlegacyventasclientmicroservice.repository;

import org.springframework.data.repository.CrudRepository;
import unir.tfg.fuxpin.fuxpinlegacyventasclientmicroservice.model.database.Client;

/**
 * Extending Spring CrudRepository
 *
 * @author Xavier Rodríguez
 */
public interface ClientRepository extends CrudRepository <Client, Long> { }
