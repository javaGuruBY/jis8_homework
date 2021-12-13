package com.tutrit.hibernateinspring.dao.sprdata;

import com.tutrit.hibernateinspring.bean.Alumnus;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class AlumnusSpecifications {
    public static Specification<Alumnus> isHired() {
        return (alumnus, cq, cb) -> cb.equal(alumnus.get(Alumnus.Fields.hired), true);
    }

    public static Specification<Alumnus> nameIs(final String name) {
        return (alumnus, cq, cb) ->  cb.equal(alumnus.get(Alumnus.Fields.name), name);
    }

    public static Specification<Alumnus> isHiredExpandedExample() {
        return new Specification<Alumnus>() {
            @Override
            public Predicate toPredicate(Root<Alumnus> alumnus, CriteriaQuery<?> cq, CriteriaBuilder cb) {
                return cb.equal(alumnus.get(Alumnus.Fields.hired), true);
            }
        };
    }
}
