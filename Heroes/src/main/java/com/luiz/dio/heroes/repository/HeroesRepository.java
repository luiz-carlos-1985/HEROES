package com.luiz.dio.heroes.repository;

import com.luiz.dio.heroes.document.Heroes;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface HeroesRepository extends CrudRepository<Heroes, String>{
}
