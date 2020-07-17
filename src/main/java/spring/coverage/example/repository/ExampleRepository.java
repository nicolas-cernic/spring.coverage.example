package spring.coverage.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.coverage.example.model.Example;

@Repository
public interface ExampleRepository  extends JpaRepository<Example, Integer>{

}
