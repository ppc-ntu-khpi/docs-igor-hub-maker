package domain;

/**
 * Клас, що представляє художника, який є робітником.
 */
public class Artist extends Employee {

    /**
    * Конструктор класу.
    *
    * @param skills   навички художника
    * @param name     ім'я художника
    * @param jobTitle посада художника
    * @param level    рівень художника
    * @param dept     відділ, до якого він належить
    */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
    * Конструктор класу.
    *
    * @param skills   навички художника
    */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    
    /**
    * Конструктор класу.
    */
    public Artist() {
        super();
        this.skiils = new String[10];
    }
    
    /**
     * Метод toString() для виведення інформації про художника.
     *
     * @return рядок, що коротко описує художника
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;

    /**
     * гетер навичок художника.
     *
     * @return рядок, що представляє навички художника
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * сетер навичок художника.
     *
     * @param skills масив строк, що представляє навички художника
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }

    public String[] getSkillsLSist() {
        return skiils;
    }
}
