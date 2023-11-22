package ng.edu.binghamuni.inventoryapp.Controller.api;

import ng.edu.binghamuni.inventoryapp.Domain.Drink;
import ng.edu.binghamuni.inventoryapp.repository.DrinkRepository;
import ng.edu.binghamuni.inventoryapp.Service.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DrinkAPIController {
    @Autowired
    DrinkRepository drinkRepository;

    @Autowired
    DrinkService DrinkService;

    @RequestMapping("/drinks")
    @GetMapping("/drinks")
    public ResponseEntity<List<Drink>> getAllDrink(){
        return ResponseEntity.ok().body(DrinkService.getAllDrinks());
    }
}