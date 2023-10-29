package qwege.task_manager;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import qwege.task_manager.entity.Task;
import qwege.task_manager.repository.TaskRepository;
import qwege.task_manager.service.TaskService;

import java.util.List;

@SpringBootTest
class TaskManagerApplicationTests {
   static   TaskService taskService;
    @BeforeAll
   static void load(){
        ConfigurableApplicationContext context = SpringApplication.run(TaskManagerApplication.class);
        taskService= context.getBean(TaskService.class);
    }
    @Test
    void test(){
        save();
        update();
        remove();
    }
    void save() {
        taskService.saveTask(new Task("a","ab"));
        List<Task> taskList= taskService.fetchTaskList();
        assert  (taskList.size() == 1);
    }

    void update() {
        List<Task> taskList=taskService.fetchTaskList();
        long id=taskList.get(0).getId();
        taskService.updateTask(new Task("ad","as"),id);
        assert taskService.fetchTaskList().get(0).getName().equals("ad");
    }
    void remove() {
        List<Task> taskList= taskService.fetchTaskList();
        taskService.deleteTaskById(taskList.get(0).getId());
        taskList=taskService.fetchTaskList();
        assert  (taskList.size() == 0);
    }



}
