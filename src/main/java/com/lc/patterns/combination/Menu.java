package com.lc.patterns.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: L.C
 * @date: 2023/11/4 19:48
 * @description:
 */
public class Menu extends MenuComponent{

    private List<MenuComponent> menuComponentList = new ArrayList<>();

    public Menu(String name, int level){
        this.name = name;
        this.level = level;
    }
    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponentList.get(index);
    }

    @Override
    public void print() {
        //打印菜单名称
        for (int i = 0; i < level; i++) {
            System.out.print("  ");
        }
        System.out.println(name);

        //打印子菜单或子菜单项名称
        for (MenuComponent component : menuComponentList) {
            component.print();
        }

    }
}
