@Entity
@Table(name="task")
public class Task {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private String id;
    private String description ;
    private Employee employee;
    public Task(String description, Employee employee) {
        this.description = description;
        this.employee = employee;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Employee getIdEmployee() {
        return employee;
    }
    public void setIdEmployee(Employee employee) {
        this.employee = employee;
    }
}
