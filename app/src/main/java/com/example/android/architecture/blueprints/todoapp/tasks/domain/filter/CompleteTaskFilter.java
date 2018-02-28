package com.example.android.architecture.blueprints.todoapp.tasks.domain.filter;


import com.example.android.architecture.blueprints.todoapp.tasks.domain.model.Task;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sumit on 2/27/18.
 */

public class CompleteTaskFilter implements TaskFilter {
    @Override
    public List<Task> filter(List<Task> tasks) {
        List<Task> taskList = new ArrayList<>();
        for (Task task : tasks) {
            if (task.isCompleted()) {
                taskList.add(task);
            }
        }

        return taskList;
    }
}
