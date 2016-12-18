package com.mycompany.app.dao;

import com.mycompany.app.domain.Task;
import org.springframework.data.geo.Box;
import org.springframework.data.geo.Circle;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wrokita on 16/12/2016.
 */
@Component
public interface TaskRepository extends MongoRepository<Task, String> {

    List<Task> findByTitle(String title);
    List<Task> findByPositionWithin(Circle c);
    List<Task> findByPositionWithin(Box b);
    List<Task> findByPositionNear(Point p, Distance d);

}
