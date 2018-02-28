package com.example.android.architecture.blueprints.todoapp.tasks.domain.filter;


import com.example.android.architecture.blueprints.todoapp.tasks.domain.model.Task;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sumit on 2/27/18.
 */

public class FilterAllTaskFilter implements TaskFilter {
    @Override
    public List<Task> filter(List<Task> tasks) {
        return new ArrayList<>(tasks);
    }
}
