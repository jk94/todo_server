package de.code2code;

import de.code2code.Interface.IDataSave;
import de.code2code.Model.Todo;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by Jan Koschke on 18.10.2016.
 *
 * @author Jan Koschke
 */
public class StaticDataSave implements IDataSave {

    private static final ArrayList<Todo> todos = new ArrayList<>();

    @Override
    public ArrayList<Todo> getTodos() {
        return todos;
    }

    @Override
    public void addTodo(Todo todo) {
        todos.add(todo);
    }

    @Override
    public void updateTodo(Todo todo) {
        for (Todo todoitem : todos) {
            if (todoitem.getId() == todo.getId()) {
                todoitem.setStatus(todo.isStatus());
                todoitem.setText(Objects.equals(todo.getText(), "") ? todoitem.getText() : todo.getText());
                return;
            }
        }
        this.addTodo(todo);
    }

    @Override
    public void deleteTodo(int id) {
        Todo foundTodo = null;
        for (Todo todoitem : todos) {
            if (todoitem.getId() == id) {
                foundTodo = todoitem;
                break;
            }
        }
        if (foundTodo != null) todos.remove(foundTodo);
    }
}
