/**
 * Соискатель - уровня Student
 */
public class Student extends Workers implements Observer {

    //#region Поля
    private String name;
    private String vacancy;
    private int salary;
    //#endregion
    
    //#region Конструктор
    public Student(String name, String vacancy) {
        this.name = name;
        this.vacancy = vacancy;
        salary = 5000;
    }
    //#endregion

    //#region Методы
    @Override
    public void receiveOffer(String nameCompany, String vacancy, int salary) {
        if (this.salary <= salary & this.vacancy.equals(vacancy)) {
            System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; вакансия: %s; заработная плата: %d)\n",
            name, nameCompany, vacancy, salary);
            this.salary = salary;
        } else {
            System.out.printf("Студент %s: Я найду работу по лучше! (компания: %s; вакансия: %s; заработная плата: %d)\n",
            name, nameCompany, vacancy, salary);
        }
    }
    //#endregion

    //#region Getters
    public String getName() {
        return name;
    }

    @Override
    public String getVacancy() {
        return vacancy;
    }

    @Override
    public int getSalary() {
        return salary;
    }
    //#endregion

    @Override
    public String toString() {
        return String.format("Уровень квалификации:Студент; ФИО:%s; Специальность:%s; Зарплата:%d руб.", name, vacancy, salary);
    }

}
