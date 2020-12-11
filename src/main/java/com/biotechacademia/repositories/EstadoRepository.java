package com.biotechacademia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EstadoRepository extends JpaRepository<com.biotechacademia.domain.Estado, Integer> {

}
