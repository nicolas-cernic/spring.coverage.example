package spring.coverage.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.coverage.example.model.Example;
import spring.coverage.example.repository.ExampleRepository;
import spring.coverage.example.service.ExampleService;

@Service
public class ExampleServiceImpl implements ExampleService {

	
	
	ExampleRepository exampleRepository;

	@Autowired
	public ExampleServiceImpl(ExampleRepository exampleRepository) {
		this.exampleRepository = exampleRepository;
	}

	@Override
	public Example getById(int id) {
		return exampleRepository.findById(id).get();
	}

	@Override
	public List<Example> getAllExamples() {
		
		List<Example> result = exampleRepository.findAll();
	
		if(result.isEmpty())
		{
			// return null;
		}
		return result;
	}

	@Override
	public void createExample(Example example) {
		if(example.getId()<=0)
			throw new UnsupportedOperationException();
		
		exampleRepository.save(example);
	}

}
