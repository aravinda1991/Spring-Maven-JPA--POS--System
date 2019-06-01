package lk.ijse.pos.db;

import lk.ijse.pos.entity.Customer;
import lk.ijse.pos.entity.Item;
import lk.ijse.pos.entity.Order;
import lk.ijse.pos.entity.OrderDetail;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class HibernateUtil {


    public static EntityManager buildEntityManager() throws IOException {

        File file = new File("H:\\IJSE\\Projects\\Hibernate POS System\\Hibernate POS (JPA)\\resources\\application.properties");

        Properties properties = new Properties();

        FileReader fileReader = new FileReader(file);

        properties.load(fileReader);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit1", properties);

        EntityManager em = emf.createEntityManager();

        return em;

    }

}
