package alephlabs.exercise.controller;

import alephlabs.exercise.domain.Test;
import alephlabs.exercise.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
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
    @PostMapping(path = "/testRecord", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public Test saveTestRecords(@RequestBody MultiValueMap<String, String> requestParamMap ) {
        return exerciseService.saveTestRecord(requestParamMap.getFirst("name"));
    }

}
