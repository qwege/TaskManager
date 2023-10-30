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

    @GetMapping("/task")
    public List<Task> fetchTaskList() {
        return taskService.fetchTaskList();
    }
    @GetMapping("/task/{id}")
    public Task getTask(@PathVariable("id") Long id ) {
        return taskService.getTask(id);
    }

    @PutMapping("/task/{id}")
    public Task updateTask(@RequestBody Task task, @PathVariable("id") Long taskId) {
        return taskService.updateTask(task, taskId);
    }

    @DeleteMapping("/task/{id}")
    public String deleteTaskById(@PathVariable("id") Long taskId) {
        taskService.deleteTaskById(taskId);
        return "Deleted Successfully";
    }

}
