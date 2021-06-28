package unir.tfg.fuxpin.fuxpinlegacyventasclientmicroservice.services;

import unir.tfg.fuxpin.fuxpinlegacyventasclientmicroservice.model.database.Client;

import java.util.List;

/**
 *
 * This interface provides the contract methods.
 *
 * Filter the CRUD methods.
 *
 * @author Xavier Rodríguez
 *
 */
public interface IClientService {

    List<Client> findAll();
}
