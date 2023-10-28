package qwege.task_manager.service;

import qwege.task_manager.entity.Task;

import java.util.List;

public interface TaskService {
    // save operation
    Task saveDepartment(Task department);

    // read operation
    List<Task> fetchDepartmentList();

    // update operation
    Task updateDepartment(Task department, Long departmentId);

    // delete operation
    void deleteDepartmentById(Long departmentId);
}
