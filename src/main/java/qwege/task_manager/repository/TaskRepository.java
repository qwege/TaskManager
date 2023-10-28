package qwege.task_manager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import qwege.task_manager.entity.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task,Long> {

}
