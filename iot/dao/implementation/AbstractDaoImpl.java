package iot.dao.implementation;

import iot.hibernate.Hiber;
import iot.dao.AbstractDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.LinkedList;
import java.util.List;


public abstract class AbstractDaoImpl<E> implements AbstractDao<E> {
    protected final SessionFactory sessionFactory = Hiber.getSessionFactory();
    private final Class<E> eClass;

    public AbstractDaoImpl(Class<E> eClass) {
        this.eClass = eClass;
    }

    @Override
    public List<E> getAll() {
        List<E> entityList = new LinkedList<>();
        try (Session session = sessionFactory.getCurrentSession()) {
            session.beginTransaction();
            entityList = session.createQuery("from " + eClass.getSimpleName()).getResultList();
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return entityList;
    }

    @Override
    public E get(Integer id) {
        E entity = null;

        try (Session session = sessionFactory.getCurrentSession()) {
            session.beginTransaction();
            entity = session.get(eClass, id);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return entity;
    }

    @Override
    public void create(E entity) {
        try (Session session = sessionFactory.getCurrentSession()) {
            session.beginTransaction();
            session.save(entity);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Integer id, E entity) {
        try (Session session = sessionFactory.getCurrentSession()) {
            session.beginTransaction();
            session.update(entity);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Integer id) {
        try (Session session = sessionFactory.getCurrentSession()) {
            session.beginTransaction();
            E entity = session.get(eClass, id);
            if (entity != null) {
                session.delete(entity);
            }
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}