package com.example.demo.models;
import jakarta.persistence.*;

@Entity
//@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String task;
    private boolean completed;
    public Task() {
        // 这是无参数构造函数，可以为空或者添加初始化代码
    }

    public Task(String task, boolean completed) {
        this.task = task;
        this.completed = completed;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

}
