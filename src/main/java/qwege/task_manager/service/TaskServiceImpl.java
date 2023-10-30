package qwege.task_manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qwege.task_manager.entity.Task;
import qwege.task_manager.repository.TaskRepository;

import java.util.List;
import java.util.Objects;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    private TaskRepository taskRepository;
    @Override
    public Task saveTask(Task task) {
       return taskRepository.save(task);
    }

    @Override
    public List<Task> fetchTaskList() {
        return (List<Task>) taskRepository.findAll();
    }

    @Override
    public Task updateTask(Task task, Long tasktID) {
        Task taskDB= taskRepository.findById(tasktID).get();
        if (Objects.nonNull(task.getName()) && !"".equalsIgnoreCase(task.getName())) {
            taskDB.setName(task.getName());
        }

        if (Objects.nonNull(task.getDescription()) && !"".equalsIgnoreCase(task.getDescription())) {
            taskDB.setDescription(task.getDescription());
        }
        if (Objects.nonNull(task.getDate())) {
            taskDB.setDate(task.getDate());
        }
        return taskRepository.save(taskDB);
    }


    @Override
    public void deleteTaskById(Long taskID) {
        taskRepository.deleteById(taskID);
    }

    @Override
    public Task getTask(Long id) {
        return taskRepository.findById(id).get();
    }
}
