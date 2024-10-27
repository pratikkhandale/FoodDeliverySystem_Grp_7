package com.bits.service;

import com.bits.entity.MenuItem;
import com.bits.repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuItemService {

    @Autowired
    private MenuItemRepository menuItemRepository;

    public List<MenuItem> getAllMenuItems() {
        return menuItemRepository.findAll();
    }

    public MenuItem getMenuItemById(Long id) {
        return menuItemRepository.findById(id).orElse(null);
    }

    public MenuItem saveMenuItem(MenuItem menuItem) {
        return menuItemRepository.save(menuItem);
    }

    public void deleteMenuItem(Long id) {
        menuItemRepository.deleteById(id);
    }

    public MenuItem updateMenuItem(Long id, MenuItem menuItem) {
        MenuItem menuItem1 = getMenuItemById(id);
        if (null != menuItem1) {
            saveMenuItem(menuItem);
        }
        return menuItem;
    }
}
