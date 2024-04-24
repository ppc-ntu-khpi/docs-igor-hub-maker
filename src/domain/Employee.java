package domain;

/**
 * Клас, що представляє робітника.
 */
public class Employee {

    /**
     * Перевизначений метод toString() для виведення інформації про робітника.
     *
     * @return рядок, що описує робітника
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

   // private static int employeesCount = 0;

    /**
    * Конструктор класу.
    *
    * @param name     ім'я робітника
    * @param jobTitle посада робітника
    * @param level    рівень робітника
    * @param dept     відділ, до якого він належить
    */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
    * Конструктор класу.
    */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }

    /**
     * сетер посади робітника.
     *
     * @param job посада робітника
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * гетер посади робітника.
     *
     * @return посада робітника
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * гетер імені робітника.
     *
     * @return імʼя робітника
     */
    public String getName() {
        return name;
    }

    /**
    * сетер рівня робітника.
    *
    * @param level рівень робітника, может бути від 1 до 3
    */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * гетер рівня робітника.
     *
     * @return рівень робітника, від 1 до 3
     */
    public int getLevel() {
        return level;
    }

    /**
     * гетер відділу робітника.
     *
     * @return відділ робітника
     */
    public String getDept() {
        return dept;
    }

    /**
     * сетер відділу робітника.
     *
     * @param dept відділ робітника
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * сетер імені робітника.
     *
     * @param name імʼя робітника
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
