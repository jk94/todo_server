package de.code2code.Controller;

import de.code2code.Model.Todo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by Jan Koschke on 17.10.2016.
 */

@RestController
public class TodoController {

    @RequestMapping(method = GET, path = "/todo")
    public List<Todo> getTodos() {
        ArrayList<Todo> l = new ArrayList<>();
        l.add(new Todo(new Date(), "test", false));
        return l;
    }

    @RequestMapping(method = POST, path = "/todo")
    public void addTodo(@RequestBody TodoController todo) {
        System.out.println(todo);
    }

}
