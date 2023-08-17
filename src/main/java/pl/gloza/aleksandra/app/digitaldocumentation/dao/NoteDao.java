package pl.gloza.aleksandra.app.digitaldocumentation.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import pl.gloza.aleksandra.app.digitaldocumentation.dao.entity.NoteEntity;

import java.time.LocalDate;

// TODO: 10.08.2023  dla klasy NoteDAO i NoteEntity stworzyć oddzielny branch i zrobić pull request

public class NoteDao {
    private SessionFactory sessionFactory;

    public NoteDao() {
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

   public void create() {
        NoteEntity noteEntity = new NoteEntity();
        noteEntity.setName("Important");
        noteEntity.setDescription("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
        noteEntity.setCreated(LocalDate.of(2023, 8, 07));


        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.save(noteEntity);
        session.getTransaction().commit();

    }
}


