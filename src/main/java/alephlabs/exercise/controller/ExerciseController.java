package alephlabs.exercise.controller;

import alephlabs.exercise.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/public-api")
public class ExerciseController {

    @Autowired
    private ExerciseService exerciseService;


}
