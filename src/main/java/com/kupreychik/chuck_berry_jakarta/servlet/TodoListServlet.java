package com.kupreychik.chuck_berry_jakarta.servlet;

import com.kupreychik.chuck_berry_jakarta.model.todos.Todo;
import com.kupreychik.chuck_berry_jakarta.service.TodoService;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

import static com.kupreychik.chuck_berry_jakarta.consts.WebConsts.SLASH;
import static com.kupreychik.chuck_berry_jakarta.consts.WebConsts.TITLE;
import static com.kupreychik.chuck_berry_jakarta.consts.WebConsts.TODOS;
import static com.kupreychik.chuck_berry_jakarta.consts.WebConsts.TODO_LIST_JSP;
import static com.kupreychik.chuck_berry_jakarta.consts.WebConsts.TODO_SERVICE;

@WebServlet(SLASH + TODOS)
public class TodoListServlet extends HttpServlet {
    private TodoService todoService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        ServletContext servletContext = config.getServletContext();
        this.todoService = (TodoService) servletContext.getAttribute(TODO_SERVICE);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter(TITLE);
        List<Todo> todos = todoService.getTodos();
        if (title != null) {
            todos = todoService.getTodosByTitle(todos, title);
        }
        req.setAttribute(TODOS, todos);
        req.setAttribute(TITLE, title);
        req.getRequestDispatcher(TODO_LIST_JSP).forward(req, resp);
    }
}
