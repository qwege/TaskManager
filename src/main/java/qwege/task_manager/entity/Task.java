package qwege.task_manager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Task {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String description;
    private boolean checked;
    private Date date;

    public Task(){}

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
        this.checked=false;
        this.date = new Date(System.currentTimeMillis());
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isChecked() {
        return checked;
    }

    public Date getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
