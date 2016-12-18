package com.mycompany.app.web;

import com.mycompany.app.domain.Task;
import com.mycompany.app.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by wrokita on 08/11/2016.
 */
@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @RequestMapping(value="/task/add", method = RequestMethod.POST, consumes="application/json" )
    ResponseEntity<?> add(@RequestBody Task input) {
        Task newEvent = taskService.addTask(input);
        return new ResponseEntity<Task>(newEvent, HttpStatus.OK);
    }

    @RequestMapping(value = "/task/get", method = RequestMethod.GET)
    ResponseEntity<?> get() {
        return new ResponseEntity<Task>(new Task("titleOfTask", "description of task"), HttpStatus.OK);
    }

    @RequestMapping(value = "/task/getall", method = RequestMethod.GET)
    ResponseEntity<?> getAll() {
        return new ResponseEntity<List<Task>>(taskService.getAll(), HttpStatus.OK);
    }
    @RequestMapping(value = "/task", method = RequestMethod.GET)
    ResponseEntity<?> getFiltered(@RequestParam String description) {
        return new ResponseEntity<List<Task>>(taskService.getFiltered(description), HttpStatus.OK);
    }
}

