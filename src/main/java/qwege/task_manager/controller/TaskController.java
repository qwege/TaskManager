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
    public Task saveDepartment(@RequestBody Task task) {
        return taskService.saveDepartment(task);
    }

    // Read operation
    @GetMapping("/task")
    public List<Task> fetchDepartmentList() {
        return taskService.fetchDepartmentList();
    }

    // Update operation
    @PutMapping("/task/{id}")
    public Task updateDepartment(@RequestBody Task task, @PathVariable("id") Long departmentId) {
        return taskService.updateDepartment(task, departmentId);
    }

    // Delete operation
    @DeleteMapping("/task/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
        taskService.deleteDepartmentById(departmentId);
        return "Deleted Successfully";
    }
}
