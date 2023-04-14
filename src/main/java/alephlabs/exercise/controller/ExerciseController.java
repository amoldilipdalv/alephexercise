package alephlabs.exercise.controller;

import alephlabs.exercise.domain.Test;
import alephlabs.exercise.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/aleph-exercise")
public class ExerciseController {

    @Autowired
    private ExerciseService exerciseService;

    @GetMapping("/testRecords")
    public List<Test> getAllTestRecords()
    {
        return exerciseService.getAllTestRecords();
    }


}
