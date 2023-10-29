package qwege.task_manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qwege.task_manager.entity.Task;
import qwege.task_manager.service.TaskService;

import java.util.List;


@RestController
public class TaskController {
    @Autowired
    private TaskService taskService;
    @PostMapping("/task")
    public Task saveTask(@RequestBody Task task) {
        return taskService.saveTask(task);
    }

    // Read operation
    @GetMapping("/task")
    public List<Task> fetchTaskList() {
        return taskService.fetchTaskList();
    }

    // Update operation
    @PutMapping("/task/{id}")
    public Task updateTask(@RequestBody Task task, @PathVariable("id") Long departmentId) {
        return taskService.updateTask(task, departmentId);
    }

    // Delete operation
    @DeleteMapping("/task/{id}")
    public String deleteTaskById(@PathVariable("id") Long departmentId) {
        taskService.deleteTaskById(departmentId);
        return "Deleted Successfully";
    }
}
