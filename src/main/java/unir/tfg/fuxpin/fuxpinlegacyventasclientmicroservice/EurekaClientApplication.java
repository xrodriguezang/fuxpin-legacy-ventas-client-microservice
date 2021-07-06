package unir.tfg.fuxpin.fuxpinlegacyventasclientmicroservice;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import unir.tfg.fuxpin.fuxpinlegacyventasclientmicroservice.model.database.Client;
import unir.tfg.fuxpin.fuxpinlegacyventasclientmicroservice.model.rest.Alive;
import unir.tfg.fuxpin.fuxpinlegacyventasclientmicroservice.services.IClientService;
import unir.tfg.fuxpin.fuxpinlegacyventasclientmicroservice.services.ITestService;

import java.util.ArrayList;
import java.util.List;

/**
 * Spring boot application
 *
 * @author Xavier Rodríguez
 */
@SpringBootApplication
public class EurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}

}

/**
 * Rest Controller provides the legacy clients and infomation of the service registered
 */
@RestController
@Log4j2
class ServiceInstanceRestController implements ClientsController {

	@Autowired
	IClientService clientService;

	@Autowired
	ITestService testService;



	/**
	 * Return is the components of the service are alive
	 *
	 * @return
	 */
	@Override
	public ResponseEntity<?> imAlive() {

		try {

			Alive alive = new Alive(testService.findAll() > 0 ? "OK" : "Problems with database", "OK");

			return ResponseEntity.ok(alive);

		} catch (Exception e) {
			log.error ("Problems with microservice health!", e);
		}

		return ResponseEntity.ok(new Alive("NOK", "NOK"));

	}

	/**
	 * Provides the clients of the legacy application
	 *
	 * @return legacy clients
	 */
	@Override
	public ResponseEntity<?> getClients() {

		List<Client> clients = new ArrayList<>();

		try {

			clients = clientService.findAll();

			log.info("Legacy total clients returned Returner: {}", clients.size());


		} catch (Exception e) {
			log.error("Problems with getClients!",  e);
		}

		return ResponseEntity.ok(clients);

	}

}