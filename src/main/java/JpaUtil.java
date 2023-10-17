import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {

        private static final EntityManagerFactory entityManagerFactory;

        static {
            try {
                entityManagerFactory = Persistence.createEntityManagerFactory("simplejpa");
            } catch (Throwable ex) {
                System.err.println("Initial EntityManagerFactory creation failed."+ ex);
                throw new ExceptionInInitializerError(ex);
            }
        }

        public static EntityManagerFactory getEntityManagerFactory() {
            return entityManagerFactory;
        }
    }


