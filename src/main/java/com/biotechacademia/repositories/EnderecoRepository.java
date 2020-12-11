package com.biotechacademia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EnderecoRepository extends JpaRepository<com.biotechacademia.domain.Endereco, Integer> {

}
