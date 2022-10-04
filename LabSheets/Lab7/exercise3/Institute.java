package Lab7.exercise3;

import java.util.Arrays;

public class Institute {
    private String name;
    private Department[] departments;

    public Institute(String name, Department[] departments){
        setName(name);
        setDepartments(departments);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public int getTotalStudents(){
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (Department department: getDepartments()) {
            if (department != null) {
                output.append(department).append("\n\n");
            }
        }
        return "Name of Institute: " + getName() +
                "\n\nDepartments: \n\n" + output;
    }
}
