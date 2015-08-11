package tr.org.lkd.lyk2015.sampleservlet;

import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Acts as a db. We use it as a fake-db
 * @author destan
 *
 */
public class Storage {

	private static Map<Long, Todo> todos = new HashMap<>();
	private static Long idCounter = 100L;
	
	public static void add(Todo todo){
		todo.setId(idCounter++);
		todos.put(todo.getId(), todo);
	}
	
	public static Todo getById(Long id){
		return todos.get(id);
	}
	
	public static Collection<Todo> getAll(){
		return todos.values();
	}
	
	public static void markAsDone(Long id){
		Todo todo = todos.get(id);
		todo.setDone(true);
	}
	
	public static void updateTodo(Long id, String name, String desc, Calendar dueDate, Boolean done){
        Todo todo = todos.get(id);
        todo.setName(name);
        todo.setDesc(desc);
        todo.setDueDate(dueDate);
        todo.setDone(done);
    }
	
}
