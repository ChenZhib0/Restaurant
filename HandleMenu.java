import java.util.ArrayList;
import java.util.Scanner;

public class HandleMenu {
    private ArrayList<Menu> menus=new ArrayList<>();

    Scanner input=new Scanner(System.in);








    public void addMenu(){
        Menu menu=new Menu();
            System.out.println("choose group(meat/fish/vegetable/snack/drinks)");
            String group = input.next();
            menu.setGroup(group);

            System.out.println("input name");
            String name = input.next();
            menu.setCuisine(name);

            System.out.println("input money");
            double money = input.nextDouble();
            menu.setMoney(money);

            //System.out.println("input money1");
            double money1 = money*0.8;
            menu.setMoney1(money1);

            menus.add(menu);


            System.out.println("success");


    }


    public void deleteMenu(){


        System.out.println("input name");
        String name = input.next();
        int i;
        for (i = 0; i < menus.size(); i++) {
            Menu menu = menus.get(i);
            if (menu.getCuisine().equals(name)) {
                break;
            }
        }
        Menu menu = menus.get(i);
        if(menu.getCuisine().equals(name)) {
            menus.remove(menu);
            System.out.println("success");
        }
        else{
            System.out.println("This cuisine does not exist");
        }




    }

    public void showMenu(String group){
        for (int i = 0; i <menus.size(); i++) {
            Menu menu=menus.get(i);
            if(menu.getGroup().contains(group)){
              System.out.println(menu.getCuisine());
              System.out.println(menu.getMoney());
              System.out.println("-----------");}
        }
    }

    public void showMenu1(String group){
        for (int i = 0; i <menus.size(); i++) {
            Menu menu=menus.get(i);
            if(menu.getGroup().contains(group)){
              System.out.println(menu.getCuisine());
              System.out.println(menu.getMoney1());
              System.out.println("-----------");}
        }
    }

    public int getCuisineByName(String name){
        int money=0;

        for (int i = 0; i < menus.size(); i++) {
            Menu menu = menus.get(i);
            if (menu.getCuisine().equals(name)) {
                money+=menu.getMoney();
                return money;
            }
        }
        return 0;

    }

    public int getCuisineByName1(String name){
        int money=0;

        for (int i = 0; i < menus.size(); i++) {
            Menu menu = menus.get(i);
            if (menu.getCuisine().equals(name)) {
                money+=menu.getMoney1();
                return money;
            }
        }
        return 0;

    }

}
