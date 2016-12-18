package com.mycompany.app.service;

import com.mycompany.app.dao.TaskRepository;
import com.mycompany.app.domain.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by wrokita on 16/12/2016.
 */
@Component
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private MongoTemplate mongoTemplate;


    public Task addTask(Task task) {
        return taskRepository.insert(task);
    }

    public List<Task> findByTitle(String title) {
        return taskRepository.findByTitle(title);
    }

    public void deleteTask(String taskId) {
        taskRepository.delete(taskId);
    }

    public List<Task> getAll() {
        return taskRepository.findAll();
    }

    public List<Task> getFiltered(String filter) {
        Query query = new Query(Criteria.where("description").regex(filter));
        return mongoTemplate.find(query,Task.class);
    }
   // public findByDescription(String desc){
   //     mongoTemplate.
   // }
}
