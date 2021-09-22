package com.example.bigbowlxp.services;

import com.example.bigbowlxp.models.Menu;
import com.example.bigbowlxp.repositories.MenuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    private MenuRepo menuRepo;

    public List<Menu> fetchMenu(){
        return menuRepo.fetchMenu();
    }

    @Autowired
    public void setMenuRepo(MenuRepo menuRepo) {
        this.menuRepo = menuRepo;
    }

}
