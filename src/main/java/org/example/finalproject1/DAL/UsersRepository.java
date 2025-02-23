package org.example.finalproject1.DAL;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.util.List;

public class UsersRepository
{
    @PersistenceContext
    private EntityManager entityManager;
    public User FindUser(int id) {
        return entityManager.find(User.class, id);
    }
    public List<User> FindUsers() {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<User> query = builder.createQuery(User.class);
        Root<User> root = query.from(User.class);
        return entityManager.createQuery(query).getResultList();
    }
    public void UpsertMenuItem(MenuItem menuItem) {
        entityManager.persist(menuItem);
    }
}