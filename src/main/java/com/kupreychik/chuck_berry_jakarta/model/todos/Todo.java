package com.kupreychik.chuck_berry_jakarta.model.todos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
    private int userId;
    private int id;
    private String title;
    private boolean completed;
}
