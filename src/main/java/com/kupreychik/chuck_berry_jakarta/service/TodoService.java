package com.kupreychik.chuck_berry_jakarta.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kupreychik.chuck_berry_jakarta.model.todos.Todo;
import lombok.SneakyThrows;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class TodoService {
    @SneakyThrows
    private String getTodoString() {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/todos"))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }

    @SneakyThrows
    public List<Todo> getTodos() {
        String todoString = getTodoString();
        ObjectMapper om = new ObjectMapper();
        return List.of(om.readValue(todoString, Todo[].class));
    }

    public List<Todo> getTodosByTitle(List<Todo> todos, String title) {
        return todos.stream().filter(todo -> todo.getTitle().contains(title)).toList();
    }
}
