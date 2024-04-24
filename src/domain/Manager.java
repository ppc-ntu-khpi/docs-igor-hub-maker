package domain;

/**
 * Клас, що представляє менеджера.
 */
public class Manager extends Employee {

    /**
    * Конструктор класу.
    *
    * @param employees співробітники, яким керує менеджер
    * @param name      ім'я менеджера
    * @param jobTitle  посада менеджера
    * @param level     рівень менеджера
    * @param dept      відділ, до якого він належить
    */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Метод toString() для виведення інформації про менеджера.
     *
     * @return рядок, що коротко описує менеджера
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /**
    * Конструктор класу.
    *
    * @param employees співробітники, яким керує менеджер
    */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /**
    * Конструктор класу.
    */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;

    /**
     * гетер співробітників.
     *
     * @return співробітники, яким керує менеджер, поіменно
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * сетер співробітників.
     *
     * @param employees співробітники, яким керує менеджер
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * гетер співробітників.
     *
     * @return масив співробітників, яким керує менеджер
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
