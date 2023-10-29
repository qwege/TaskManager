package qwege.task_manager;

import org.hibernate.id.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import qwege.task_manager.entity.Task;
import qwege.task_manager.repository.TaskRepository;

@SpringBootApplication
public class TaskManagerApplication {

    public static void main(String[] args) {

        SpringApplication.run(TaskManagerApplication.class, args);


    }

}
