package wei.leetcode.learn.hashtable;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class EmployeeImportanceTest {

    @InjectMocks
    private EmployeeImportance employeeImportance;

    static Stream<Arguments> getSource() {

        // source 1
        List<Employee> source1 = new ArrayList<>();

        List<Integer> employOfSource1Data1 = new ArrayList<>();
        employOfSource1Data1.add(2);
        employOfSource1Data1.add(3);
        source1.add(new Employee(1, 5, employOfSource1Data1));

        List<Integer> employOfSource1Data2 = new ArrayList<>();
        source1.add(new Employee(2, 3, employOfSource1Data2));

        List<Integer> employOfSource1Data3 = new ArrayList<>();
        source1.add(new Employee(3, 3, employOfSource1Data3));

        // source 2
        List<Employee> source2 = new ArrayList<>();

        List<Integer> employOfSource2Data1 = new ArrayList<>();
        source2.add(new Employee(101, 3, employOfSource2Data1));

        List<Integer> employOfSource2Data2 = new ArrayList<>();
        employOfSource2Data2.add(101);
        source2.add(new Employee(2, 5, employOfSource2Data2));

        return Stream.of(
                Arguments.of(
                        source1, 1, 11
                ),
                Arguments.of(
                        source2, 2, 8
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void getImportance(List<Employee> employees, int id, int check) {
        int result = employeeImportance.getImportance(employees, id);

        assertThat(result).isEqualTo(check);
    }
}