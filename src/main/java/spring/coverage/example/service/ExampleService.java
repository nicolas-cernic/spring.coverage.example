package spring.coverage.example.service;

import java.util.List;

import spring.coverage.example.model.Example;

public interface ExampleService {

	Example getById(int id);

	List<Example> getAllExamples();

	void createExample(Example example);

}
