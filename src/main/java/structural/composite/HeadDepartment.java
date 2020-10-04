package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department {

    private List<Department> departments;

    public HeadDepartment() {
        this.departments = new ArrayList<>();
    }

    public HeadDepartment(List<Department> departments) {
        this.departments = departments;
    }

    public void printDepartmentName() {
        departments.forEach(Department::printDepartmentName);
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
    }

}
