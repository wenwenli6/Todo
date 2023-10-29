package com.example.demo.controllers;

import com.example.demo.models.Task;
import com.example.demo.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
public class TaskController {
    @Autowired
    private TaskService taskService;
    @GetMapping("/")
    public ResponseEntity<List<Task>> getAllTasks(){
        return  ResponseEntity.ok(taskService.getAllTask());
    }
    @GetMapping("/completed")
    public ResponseEntity<List<Task>> getAllCompletedTasks(){
        return ResponseEntity.ok(taskService.findAllCompletedTask());
    }
    @GetMapping("/incomplete")
    public ResponseEntity<List<Task>> getAllIncompletedTasks(){
        return ResponseEntity.ok(taskService.findAllInCompletedTask());
    }
    @PostMapping("/")
    public ResponseEntity<Task> createTask(@RequestBody Task task){
        return ResponseEntity.ok(taskService.createNewTask(task));
    }
    @PutMapping("/edit/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task task){
        task.setId(id);
        return ResponseEntity.ok(taskService.updateTask(task));
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> getAllTasks(@PathVariable Long id){
        taskService.deleteTask(id);
        return ResponseEntity.ok(true);
    }
}
