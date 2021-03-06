package unir.tfg.fuxpin.fuxpinlegacyventasclientmicroservice.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unir.tfg.fuxpin.fuxpinlegacyventasclientmicroservice.model.database.Test;
import unir.tfg.fuxpin.fuxpinlegacyventasclientmicroservice.repository.TestRepository;

import java.util.List;

/**
 *
 * Test Service Interface
 *
 * Used to monitor the application state
 *
 * @author Xavier Rodríguez
 */
@Service
public class TestService implements ITestService {

    Logger logger = LoggerFactory.getLogger(TestService.class);

    @Autowired
    TestRepository testRepository;

    /**
     * Get connection and return if it is alive
     * @return
     */
    @Override
    public int findAll() {
        try {
            List<Test> userList = (List<Test>) testRepository.findAll();

            return userList.size();
        } catch (Exception e) {
            logger.error("Problems with database!", e);
        }
        return 0;
    }

}
