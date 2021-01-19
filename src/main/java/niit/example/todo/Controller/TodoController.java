package niit.example.todo.Controller;

import niit.example.todo.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/listTodo")
    public String listTodo(Model model) {
        model.addAttribute("todoList", todoService.findAll());
        return "listTodo";
    }

}
