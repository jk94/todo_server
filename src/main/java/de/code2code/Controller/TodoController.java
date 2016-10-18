package de.code2code.Controller;

import de.code2code.Interface.IDataSave;
import de.code2code.Model.Todo;
import de.code2code.StaticDataSave;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * Created by Jan Koschke on 17.10.2016.
 */

@RestController
public class TodoController {

    @RequestMapping(method = GET, path = "/todo")
    public List<Todo> getTodos() {
        IDataSave dataSave = new StaticDataSave();
        return dataSave.getTodos();
    }

    @RequestMapping(method = POST, path = "/todo")
    public void addTodo(@RequestBody Todo todo) {
        IDataSave dataSave = new StaticDataSave();
        if (todo.getCreated_at() == null)
            todo.setCreated_at(new Date());

        dataSave.addTodo(todo);
    }

    @RequestMapping(method = PUT, path = "/todo")
    public void changeTodo(@RequestBody Todo todo) {
        IDataSave dataSave = new StaticDataSave();
        dataSave.updateTodo(todo);
    }

    @RequestMapping(method = DELETE, path = "/todo/{id}")
    public void deleteTodo(@PathVariable("id") int id) {
        if (id > 0) {
            IDataSave dataSave = new StaticDataSave();
            dataSave.deleteTodo(id);
        }
    }
}
