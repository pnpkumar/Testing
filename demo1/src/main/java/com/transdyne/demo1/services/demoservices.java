package com.transdyne.demo1.services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.transdyne.demo1.model.Todo;



@Service
public class demoservices {
    private static List<Todo> demos = new ArrayList<>();
    

    static {
        demos.add(new Todo(201,"pavankumar","pavan123","machilipatnam","mtm","pavan@19gmail.com"));
        demos.add(new Todo(203,"srikanth","srikanth154","vijayawada","benzcircle","srikanth@456gmail.com"));
        demos.add(new Todo(204,"siva sai","siva154","kadapa","kadapa","sivasai123@gmail.com"));
    }

    public static List<Todo> retrieveTodos() {
        List<Todo> filteredTodos = new ArrayList<Todo>();
        for (Todo todo : demos) {
            
                filteredTodos.add(todo);
            
        }
        return filteredTodos;
    }
}

