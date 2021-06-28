package unir.tfg.fuxpin.fuxpinlegacyventasclientmicroservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Microservice Interface
 *
 * It's a contract interface with de clients. It's the pipeline with the productor - consumers
 *
 * @author Xavier Rodríguez
 *
 * Model Richardson compliance
 */
public interface ClientsController {

    /**
     * Method that send information about the microservice
     *
     * @return
     */
    @GetMapping("/imAlive")
    ResponseEntity<?> imAlive();

    /**
     * Return the legacy roles
     *
     *
     * @return
     */
    @GetMapping("/getClients")
    ResponseEntity<?> getClients();

}