import java.util.ArrayList;
import java.util.List;

/**
 * База данных
 */
public class DataBaseInfo {
    
    //#region Соискатели
    public static List<Workers> applicants() {

        List<Workers> workers = new ArrayList<>();

        Workers student1 = new Student("Анатолий", "Разнорабочий");
        Workers student2 = new Student("Вася", "Менеджер");
        Workers student3 = new Student("Андрей", "Тестировщик");
        Workers student4 = new Student("Руслан", "Агент");
        Workers student5 = new Student("Вася", "Продавец");
        Workers experience1 = new Experience("Петя", "Руководитель");
        Workers experience2 = new Experience("Егор", "Бухгалтер");
        Workers experience3 = new Experience("Ринат", "Водитель");
        Workers experience4 = new Experience("Евгений", "Агент");
        Workers experience5 = new Experience("Анатолий", "Продавец");
        Workers master1 = new Master("Михаил", "Супервайзер");
        Workers master2 = new Master("Сергей", "Бухгалтер");
        Workers master3 = new Master("Иван", "Менеджер");
        Workers master4 = new Master("Толкун", "Руководитель");
        Workers master5 = new Master("Венера", "Бухгалтер");
        Workers junior1 = new Junior("Алексей", "Тестировщик");
        Workers junior2 = new Junior("Ринат", "Проектировщик");
        Workers junior3 = new Junior("Анвар", "Разработчик");
        Workers junior4 = new Junior("Мария", "Аналитик");
        Workers junior5 = new Junior("Султан", "Тестировщик");
        Workers middle1 = new Middle("Виолетта", "Аналитик");
        Workers middle2 = new Middle("Маша", "Разработчик");
        Workers middle3 = new Middle("Сергей", "Аналитик");
        Workers middle4 = new Middle("Иван", "Преподаватель");
        Workers middle5 = new Middle("Лиза", "Тестировщик");
        Workers senior1 = new Senior("Франческо", "Проектировщик");
        Workers senior2 = new Senior("Элиза", "Преподаватель");
        Workers senior3 = new Senior("Станислав", "Преподаватель");
        Workers senior4 = new Senior("Паша", "Разработчик");
        Workers senior5 = new Senior("Лусио", "Аналитик");

        workers.add(student1);
        workers.add(student2);
        workers.add(student3);
        workers.add(student4);
        workers.add(student5);
        workers.add(experience1);
        workers.add(experience2);
        workers.add(experience3);
        workers.add(experience4);
        workers.add(experience5);
        workers.add(master1);
        workers.add(master2);
        workers.add(master3);
        workers.add(master4);
        workers.add(master5);
        workers.add(junior1);
        workers.add(junior2);
        workers.add(junior3);
        workers.add(junior4);
        workers.add(junior5);
        workers.add(middle1);
        workers.add(middle2);
        workers.add(middle3);
        workers.add(middle4);
        workers.add(middle5);
        workers.add(senior1);
        workers.add(senior2);
        workers.add(senior3);
        workers.add(senior4);
        workers.add(senior5);

        return workers;
    }
    //#endregion

    //#region Работодатели
    public static List<Company> employers() {

        Publisher publisher = new JobAgency(); 
        List<Company> employers = new ArrayList<>();
        

        Company google1 = new Company(publisher, "Google", "Проектировщик", 120000);
        Company google2 = new Company(publisher, "Google", "Тестировщик", 80000);
        Company google3 = new Company(publisher, "Google", "Разработчик", 100000);
        Company google4 = new Company(publisher, "Google", "Преподаватель", 90000);
        Company google5 = new Company(publisher, "Google", "Аналитик", 85000);
        Company yandex1 = new Company(publisher, "Yandex", "Инженер", 95000);
        Company yandex2 = new Company(publisher, "Yandex", "Проектировщик", 100000);
        Company yandex3 = new Company(publisher, "Yandex", "Тестировщик", 60000);
        Company yandex4 = new Company(publisher, "Yandex", "Разработчик", 120000);
        Company yandex5 = new Company(publisher, "Yandex", "Аналитик", 85000);
        Company geekBrains1 = new Company(publisher, "GeekBrains","Преподаватель",  98000);
        Company geekBrains2 = new Company(publisher, "GeekBrains","Руководитель",  150000);
        Company geekBrains3 = new Company(publisher, "GeekBrains","Бухгалтер",  70000);
        Company geekBrains4 = new Company(publisher, "GeekBrains","Проектировщик",  120000);
        Company geekBrains5 = new Company(publisher, "GeekBrains","Агент",  65000);
        Company KDC1 = new Company(publisher, "KDC", "Бухгалтер", 50000);
        Company KDC2 = new Company(publisher, "KDC", "Агент", 70000);
        Company KDC3 = new Company(publisher, "KDC", "Водитель", 35000);
        Company KDC4 = new Company(publisher, "KDC", "Супервайзер", 100000);
        Company KDC5 = new Company(publisher, "KDC", "Руководитель", 150000);
        Company SalesDoctor1 = new Company(publisher, "SalesDoctor", "Менеджер", 50000);
        Company SalesDoctor2 = new Company(publisher, "SalesDoctor", "Руководитель", 80000);
        Company SalesDoctor3 = new Company(publisher, "SalesDoctor", "Разработчик", 100000);
        Company SalesDoctor4 = new Company(publisher, "SalesDoctor", "Аналитик", 80000);
        Company SalesDoctor5 = new Company(publisher, "SalesDoctor", "Тестировщик", 70000);

        employers.add(google1);
        employers.add(google2);
        employers.add(google3);
        employers.add(google4);
        employers.add(google5);
        employers.add(yandex1);
        employers.add(yandex2);
        employers.add(yandex3);
        employers.add(yandex4);
        employers.add(yandex5);
        employers.add(geekBrains1);
        employers.add(geekBrains2);
        employers.add(geekBrains3);
        employers.add(geekBrains4);
        employers.add(geekBrains5);
        employers.add(KDC1);
        employers.add(KDC2);
        employers.add(KDC3);
        employers.add(KDC4);
        employers.add(KDC5);
        employers.add(SalesDoctor1);
        employers.add(SalesDoctor2);
        employers.add(SalesDoctor3);
        employers.add(SalesDoctor4);
        employers.add(SalesDoctor5);
        
        return employers;

    }
    //#endregion

}
