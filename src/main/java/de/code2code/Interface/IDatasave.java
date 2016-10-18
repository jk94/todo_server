package de.code2code.Interface;

import de.code2code.Model.Todo;

import java.util.ArrayList;

/**
 * Created by Jan Koschke on 18.10.2016.
 *
 * @author Jan Koschke
 */
public interface IDataSave {

    ArrayList<Todo> getTodos();

    void addTodo(Todo todo);

    void updateTodo(Todo todo);

    void deleteTodo(int id);

}
