package com.springbootbasic.project10.domain.repository;

import com.springbootbasic.project10.domain.entity.Temp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<Temp, Long> {

    Temp findByName(String name);

    @Query("from Temp t where t.name=:name")
    Temp findUser(@Param("name") String name);
}
