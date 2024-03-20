import java.util.ArrayList;
import java.util.Collection;

/**
 * Агентство, которое ищет соискаталей
 */
public class JobAgency implements Publisher {

    //#region Поля
    private Collection<Observer> observers = new ArrayList<>();
    //#endregion

    //#region Методы
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendOffer(String companyName, String vacancy, int salary) {
        for (Observer observer : observers) {
            observer.receiveOffer(companyName, vacancy, salary);
        }
    }
    //#endregion

}
