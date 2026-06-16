package com.example.hero;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/heroes")
public class HeroController {
    private List<Hero> heroes=new ArrayList<>();
    @GetMapping
    public List<Hero> getHeroes(){
        return heroes;
    }
    @PostMapping
    public Hero addHero(@RequestBody Hero hero){
        heroes.add(hero);
        return hero;
    }
}
