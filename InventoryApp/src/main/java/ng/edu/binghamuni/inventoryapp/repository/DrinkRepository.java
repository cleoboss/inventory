package ng.edu.binghamuni.inventoryapp.repository;

import ng.edu.binghamuni.inventoryapp.Domain.Drink;
import org.springframework.data.jpa.repository.JpaRepository;

//CRUD FUNCTIONALITY HANDLED
public interface DrinkRepository extends JpaRepository<Drink,Long> {
//    @Query("")
//    List<Drink> findDrinkByPriceGreaterThan(int price);
}