package com.example.todolist.repository

import com.example.todolist.fragments.TodoItem

class TodoItemsRepository() {

    private val listTodo: MutableList<TodoItem> = mutableListOf(
        TodoItem("1", "Написать приложение", "срочная", "03012000", true, "01012000", "02012000"),
        TodoItem("2", "Прочитать книгу", "срочная", "03012000", true, "01012000", "02012000"),
        TodoItem("3", "Прочитать книгу", "срочная", "03012000", true, "01012000", "02012000"),
        TodoItem("4", "Прочитать книгу", "срочная", "03012000", true, "01012000", "02012000"),
        TodoItem("5", "Прочитать книгу", "срочная", "03012000", true, "01012000", "02012000"),
        TodoItem("6", "Доделать коллекцию", "срочная", "03012000", true, "01012000", "02012000"),
        TodoItem(
            "7",
            "Много текста много текста много текста много текста много текста много текста много текста много текста много текста много текста много текста много текста много текста много текста много текста много текста много текста много текста много текста много текста много текста много текста много текста",
            "срочная",
            "03012000",
            true,
            "01012000",
            "02012000"
        ),
        TodoItem("8", "Продать коляску", "срочная", "03012000", true, "01012000", "02012000"),
        TodoItem("9", "Продать светильники", "срочная", "03012000", true, "01012000", "02012000"),
        TodoItem("10", "Продать трансформатор", "срочная", "03012000", true, "01012000", "02012000"),
        TodoItem(
            "11",
            "Устроиться разработчиком",
            "срочная",
            "03012000",
            true,
            "01012000",
            "02012000"
        ),
        TodoItem("12", "Купить колбасу", "срочная", "03012000", true, "01012000", "02012000")
    )

    fun getTodoItems() : MutableList<TodoItem>{
        return listTodo
    }

//    fun getTodoItems() = listOf(
//        TodoItem("1", "Написать приложение", "срочная", "03012000", true, "01012000", "02012000"),
//        TodoItem("2", "Прочитать книгу", "срочная", "03012000", true, "01012000", "02012000"),
//        TodoItem("3", "Прочитать книгу", "срочная", "03012000", true, "01012000", "02012000"),
//        TodoItem("4", "Прочитать книгу", "срочная", "03012000", true, "01012000", "02012000"),
//        TodoItem("5", "Прочитать книгу", "срочная", "03012000", true, "01012000", "02012000"),
//        TodoItem("6", "Доделать коллекцию", "срочная", "03012000", true, "01012000", "02012000"),
//        TodoItem(
//            "7",
//            "Много текста много текста много текста много текста много текста много текста много текста много текста много текста много текста много текста много текста много текста много текста много текста много текста много текста много текста много текста много текста много текста много текста много текста",
//            "срочная",
//            "03012000",
//            true,
//            "01012000",
//            "02012000"
//        ),
//        TodoItem("8", "Продать коляску", "срочная", "03012000", true, "01012000", "02012000"),
//        TodoItem("9", "Продать светильники", "срочная", "03012000", true, "01012000", "02012000"),
//        TodoItem("10", "Продать трансформатор", "срочная", "03012000", true, "01012000", "02012000"),
//        TodoItem(
//            "11",
//            "Устроиться разработчиком",
//            "срочная",
//            "03012000",
//            true,
//            "01012000",
//            "02012000"
//        ),
//        TodoItem("12", "Купить колбасу", "срочная", "03012000", true, "01012000", "02012000")
//    )

    fun addTodo(todo: TodoItem) {
        listTodo.add(todo)
    }
}