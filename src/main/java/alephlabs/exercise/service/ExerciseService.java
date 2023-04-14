package alephlabs.exercise.service;

import alephlabs.exercise.domain.Test;
import alephlabs.exercise.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ExerciseService {

    @Autowired
    private ExerciseRepository ExerciseRepository;

    public List<Test> getAllTestRecords()
    {
        return ExerciseRepository.findAll();
    }

    public Test saveTestRecord(String name)
    {
        return ExerciseRepository.save(new Test(name));
    }

}
