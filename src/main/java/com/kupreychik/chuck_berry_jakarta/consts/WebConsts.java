package com.kupreychik.chuck_berry_jakarta.consts;

import lombok.experimental.UtilityClass;

@UtilityClass
public class WebConsts {
    //beans
    public static final String USER_SERVICE = "userService";
    public static final String TODO_SERVICE = "todoService";

    //basic
    public static final String SLASH = "/";

    //root
    public static final String USERS = "users";
    public static final String TODOS = "todos";

    //actions
    public static final String DELETE = "delete";
    public static final String EDIT = "edit";
    public static final String CREATE = "create";

    //params
    public static final String NAME = "name";
    public static final String USER = "user";
    public static final String OLD_EMAIL = "oldEmail";
    public static final String OLD_NAME = "oldName";
    public static final String EMAIL = "email";
    public static final String ROLE = "role";
    public static final String ERROR = "error";
    public static final String ROLES = "roles";
    public static final String TITLE = "title";

    //jsp
    public static final String USERS_LIST_JSP = "/usersList.jsp";
    public static final String CREATE_USER_JSP = "/createUser.jsp";
    public static final String EDIT_USER_JSP = "/editUser.jsp";
    public static final String TODO_LIST_JSP = "/todoList.jsp";


    //errors
    public static final String ERROR_EMAIL_EXISTS = "error.email.exists";
    public static final String ERROR_NAME_EXISTS = "error.name.exists";
}
