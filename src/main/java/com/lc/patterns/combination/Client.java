package com.lc.patterns.combination;

/**
 * @author: L.C
 * @date: 2023/11/4 19:59
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        //创建菜单树
        MenuComponent menu1 = new Menu("菜单管理",2);
        menu1.add(new MenuItem("页面访问", 3));
        menu1.add(new MenuItem("展开菜单", 3));
        menu1.add(new MenuItem("编辑菜单", 3));
        menu1.add(new MenuItem("删除菜单", 3));
        menu1.add(new MenuItem("新增菜单", 3));
        MenuComponent menu2 = new Menu("权限配置",2);
        menu2.add(new MenuItem("页面访问", 3));
        menu2.add(new MenuItem("提交保存", 3));
        MenuComponent menu3 = new Menu("角色管理",2);
        menu3.add(new MenuItem("页面访问", 3));
        menu3.add(new MenuItem("新增角色", 3));
        menu3.add(new MenuItem("修改角色", 3));

        //将二级菜单添加到一级菜单中
        MenuComponent component = new Menu("系统管理", 1);
        component.add(menu1);
        component.add(menu2);
        component.add(menu3);

        //打印菜单名称（递归打印）
        component.print();
    }
}
