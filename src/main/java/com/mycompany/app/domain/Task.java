package com.mycompany.app.domain;

import org.springframework.data.annotation.Id;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

/**
 * Created by wrokita on 16/12/2016.
 */
public class Task {


    @Id
    private long createdTimestamp;

    private String title;
    private String description;
    private long validToTimestamp;
    private double [] position = new double[2];
    private String autor;
    private String priority;

    public Task() {
        this.createdTimestamp = Instant.now().toEpochMilli();
    }

    public Task(String title, String description, long createdTimestamp, long validToTimestamp, double[] position, String autor, String priority) {
        this.title = title;
        this.description = description;
        this.createdTimestamp = createdTimestamp;
        this.validToTimestamp = validToTimestamp;
        this.position = position;
        this.autor = autor;
        this.priority = priority;
    }

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public long getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getValidToTimestamp() {
        return validToTimestamp;
    }

    public void setValidToTimestamp(long validToTimestamp) {
        this.validToTimestamp = validToTimestamp;
    }

    public double[] getPosition() {
        return position;
    }

    public void setPosition(double[] position) {
        this.position = position;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
