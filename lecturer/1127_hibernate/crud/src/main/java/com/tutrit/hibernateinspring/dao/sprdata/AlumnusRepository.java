package com.tutrit.hibernateinspring.dao.sprdata;

import com.tutrit.hibernateinspring.bean.Alumnus;
import com.tutrit.hibernateinspring.bean.AlumnusHiredDto;
import com.tutrit.hibernateinspring.bean.AlumnusHiredProjection;
import com.tutrit.hibernateinspring.bean.Mentor;
import org.aspectj.runtime.internal.AroundClosure;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.tutrit.hibernateinspring.dao.sprdata.AlumnusSpecifications;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface AlumnusRepository extends JpaRepository<Alumnus, Long>, JpaSpecificationExecutor<Alumnus> {

    List<Alumnus> findAllByHiredIsFalseAndMentor(Mentor mentor);

    @Query(value = "select name, hired from alumnus where hired = true;", nativeQuery = true)
    List<AlumnusHiredProjection> findOnlyHired();

    @Override
    List<Alumnus> findAll(Specification specification);

    //In some cases conversion to DTO projection can fail with
    //org.springframework.core.convert.ConverterNotFoundException: No converter found capable of converting from type [org.springframework.data.jpa.repository.query.AbstractJpaQuery$TupleConverter$TupleBackedMap] to type [com.tutrit.hibernateinspring.bean.AlumnusHiredDto]
    //In such situation query should be extended with constructor expression
//    @Query(value = "select a.name, a.hired from Alumnus a where a.hired = true") //switch between queries to see the difference
    @Query(value = "select new com.tutrit.hibernateinspring.bean.AlumnusHiredDto(a.name, a.hired) from Alumnus a where a.hired = true")
    List<AlumnusHiredDto> findOnlyHiredInfo();

    @Query("from Alumnus a where a.name = :name")
    List<Alumnus> findOnlyHiredByName(@Param("name") String name);
}