package pl.gloza.aleksandra.app.digitaldocumentation.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import pl.gloza.aleksandra.app.digitaldocumentation.dao.entity.AddressEntity;

// TODO: 03.08.2023 stworzyć nowe DAO dla Note analogicznie do AddressDao, dodać i zaimplementować metodę create()
//stworzyć nową encję dla Note analogicznie do AddressEntity
//zaprezentować działanie metody create() w teście jednostkowym

// TODO: 10.08.2023  dla klasy AddressDAO i AddressEntity stworzyć oddzielny branch i zrobić pull request

public class AddressDao {
    private SessionFactory sessionFactory;

    public AddressDao() {
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")
                .build();

        try {
            sessionFactory = new MetadataSources(serviceRegistry)
                    .buildMetadata()
                    .buildSessionFactory();
        } catch (Exception e) {
            e.printStackTrace();
            StandardServiceRegistryBuilder.destroy(serviceRegistry);
        }
    }

    public void create(){
        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setStreet("Polna");
        addressEntity.setHouseNumber("10");

        //komunikacja z Hibernate - analogicznie jak 4 kroki dla JDBC
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.save(addressEntity);
        session.getTransaction().commit();
    }
}
