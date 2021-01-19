package niit.example.todo.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String detail;
}
