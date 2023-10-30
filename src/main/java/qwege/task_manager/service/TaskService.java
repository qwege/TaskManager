package qwege.task_manager.service;

import qwege.task_manager.entity.Task;

import java.util.List;

public interface TaskService {

    Task saveTask(Task department);

    List<Task> fetchTaskList();

    Task updateTask(Task department, Long departmentId);

    void deleteTaskById(Long departmentId);

    Task getTask(Long id);
}
