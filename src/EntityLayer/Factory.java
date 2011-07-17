package EntityLayer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Factory {

    private static String PU = "StorePU";
    public static EntityManager em;

    private Factory() {
    }

    public static EntityManager getInstance() {
        if (em == null) {
            em = Persistence.createEntityManagerFactory(PU).createEntityManager();
        }
        return em;
    }
}
