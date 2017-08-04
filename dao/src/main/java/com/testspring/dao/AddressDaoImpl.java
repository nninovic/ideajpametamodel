package com.testspring.dao;

import com.testspring.domain.Address;
import org.springframework.stereotype.Component;
import com.testspring.domain.Address_;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 * Created by ninovic on 8/3/2017.
 */
@Component
public class AddressDaoImpl implements AddressDao{

    @SuppressWarnings("SpringJavaAutowiredMembersInspection")
    @PersistenceContext
    EntityManager em;

    public void test(String name){
        Address address = new Address();
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Address> criteria = builder.createQuery(Address.class);
        TypedQuery<Address> query = em.createQuery(criteria);
        Root<Address> root = criteria.from(Address.class);
        criteria.where(builder.equal(root.get(Address_.name), name));
        query.getResultList();
    }

}
