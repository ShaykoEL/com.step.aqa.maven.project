package com.step.aqa.maven.project.service;

import com.step.aqa.maven.project.dao.models.Diseases;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;


import java.awt.*;

public class DiseaseService {
    public List<Diseases> getAllDiseases() {
        Transaction transaction = null;
        List<Diseases> resultSet = null;
        try (Session session = HibernateConfiguration.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Diseases> cq = cb.createQuery(Diseases.class);
            Root<Diseases> rootEntry = cq.from(Diseases.class);
            CriteriaQuery<Diseases> all = cq.select(rootEntry);

            TypedQuery<Diseases> allQuery = session.createQuery(all);

            resultSet = allQuery.getResultList();
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return resultSet;
    }

    public void saveDisease(Diseases diseases) {
        Transaction transaction = null;
        try (Session session = HibernateConfiguration.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(diseases);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}



