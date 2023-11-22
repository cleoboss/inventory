package ng.edu.binghamuni.inventoryapp.Service;

import ng.edu.binghamuni.inventoryapp.Domain.Drink;

import java.util.List;

public interface DrinkService {
    Drink saveDrink(Drink drink);
    Drink getDrinkById(long id);
    List<Drink> getAllDrinks();
    Drink updateDrink(Drink drink);
    void deleteDrink(long id);
}