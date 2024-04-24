package domain;

/**
 * Клас, що представляє редактора.
 */
public class Editor extends Artist {

    /**
     * Конструктор класу.
     *
     * @param electronicEditing можливість електронного редагування
     * @param skills            навички редактора
     * @param name              ім'я редактора
     * @param jobTitle          посада редактора
     * @param level             рівень редактора
     * @param dept              відділ, до якого він належить
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор класу.
     *
     * @param electronicEditing можливість електронного редагування
     * @param skills            навички редактора
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор класу.
     *
     * @param electronicEditing можливість електронного редагування
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Конструктор класу.
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Метод toString() для виведення інформації про редактора.
     *
     * @return рядок, що коротко описує редактора
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;

    /**
     * гетер переваг редактора щодо редагування.
     *
     * @return true, якщо редактор вподобає електронне редагування, в іншому випадку - false
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * сетер переваг редактора щодо редагування.
     *
     * @param electronic булеве значення, що вказує на вподобану форму редагування
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
