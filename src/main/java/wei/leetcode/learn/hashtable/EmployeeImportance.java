package wei.leetcode.learn.hashtable;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 690 Employee Importance.
 * <p>
 * You are given a data structure of employee information,
 * which includes the employee's unique id,
 * his importance value and his direct subordinates' id.
 * <p>
 * For example, employee 1 is the leader of employee 2,
 * and employee 2 is the leader of employee 3.
 * They have importance value 15, 10 and 5, respectively.
 * Then employee 1 has a data structure like [1, 15, [2]],
 * and employee 2 has [2, 10, [3]], and employee 3 has [3, 5, []].
 * Note that although employee 3 is also a subordinate of employee 1,
 * the relationship is not direct.
 * <p>
 * Now given the employee information of a company,
 * and an employee id,
 * you need to return the total importance value of
 * this employee and all his subordinates.
 * <p>
 * 2020/02/2020/2/14
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class EmployeeImportance {

    Map<Integer, Employee> relationship = new HashMap<>();

    public int getImportance(List<Employee> employees, int id) {

        for (Employee employee : employees) {
            relationship.put(employee.id, employee);
        }

        return getImportance(id);
    }

    private int getImportance(int id) {
        Employee employee = relationship.get(id);

        int result = employee.importance;
        for (int subordinatesId : employee.subordinates) {
            result += getImportance(subordinatesId);
        }
        return result;
    }
}

@AllArgsConstructor
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
}