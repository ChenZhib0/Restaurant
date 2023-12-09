import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    private ArrayList<Account> accounts =new ArrayList<>();
    private ArrayList<Menu> menus=new ArrayList<>();

    HandleMenu handleMenu =new HandleMenu();
    private Scanner input=new Scanner(System.in);
    //欢迎界面
    public void start(){
        System.out.println("====Welcome to Hello world!====");
        System.out.println("You are...");
        System.out.println("1.customer");
        System.out.println("2.manager");
        System.out.println("3.break");
        int command=input.nextInt();
        switch (command){
            case 1:
                while (true) {
                    System.out.println("1.sign in(VIP)");
                    System.out.println("2.sign up(VIP)");
                    System.out.println("3.order");
                    System.out.println("Please choose one");
                    int command1 = input.nextInt();
                    switch (command1) {
                        case 1:
                            login();//登录
                            break;
                        case 2:
                            createAccount();//注册
                            break;
                        case 3:
                            buy();//点餐
                            break;
                        default:
                            System.out.println("Please choose one");
                    }
                }
            case 2:
                while (true) {
                    System.out.println("1.add menu");
                    System.out.println("2.delete menu");
                    System.out.println("Please choose one");
                    int command1 = input.nextInt();
                    switch (command1) {
                        case 1:
                            handleMenu.addMenu();
                            start();
                            break;
                        case 2:
                            handleMenu.deleteMenu();
                            start();
                            break;

                        default:
                            System.out.println("Please choose one");
                    }
                }
            case 3:
                break;


        }
    }

    //登录
    private void login(){
        System.out.println("====sign in====");
        if(accounts.size()==0){
            return;
        }
        while (true) {
            System.out.println("input your username");
            String name = input.next();
            Account acc = getAccountByUserName(name);
            if (acc == null) {
                System.out.println("The username is not exist");
            }
            else {

                while (true){
                    System.out.println("input your password");
                    String passWord= input.next();
                    if(acc.getPassWord().equals(passWord)){
                        System.out.println("welcome"+acc.getUserName());//welcome
                        buy1();
                    }
                    else {
                    System.out.println("The password is wrong");
                    }
                }
            }
        }
    }
    //注册
    private void createAccount(){
        //objective
        Account acc=new Account();

        //input the information
        System.out.println("====sign up====");
        while(true){
            System.out.println("input your username");
            String name=input.next();
            Account acc1 = getAccountByUserName(name);
            if (acc1 == null) {
                acc.setUserName(name);
                break;
            }
            else {
                System.out.println("The username has existed");
            }
        }


        while(true) {
            System.out.println("input your password");
            String passWord = input.next();
            System.out.println("input your password again");
            String passWord1 = input.next();
            if (passWord1.equals(passWord)) {
                acc.setPassWord(passWord1);
                break;
            }
            else {
                System.out.println("input your password again");
            }
        }
        //放入账户集合
        accounts.add(acc);
        System.out.println("Congratulations! "+acc.getUserName()+", You have become our VIP "+"NO."+accounts.size());
    }
    private Account getAccountByUserName(String userName) {
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if (acc.getUserName().equals(userName)) {
                return acc;
            }
        }
        return null;//can not find the custom
    }





    private void buy() {
        double total=0;
        System.out.println("order what you like");

        while(true){
            System.out.println("Which group do you want to choose?(meat/fish/vegetable/snack/drinks/low fat/sweet/spicy/sour/salty)");
            String group=input.next();
            handleMenu.showMenu(group);
            String name1 = input.next();
            double money= handleMenu.getCuisineByName(name1);
            if(money!=0){
                total+=money;
                System.out.println("order successfully! Total money=" + total);
            }
            else{
                System.out.println("This cuisine does not exist");
            }
            System.out.println("do you want to continue?(Y/N)");
            String ans=input.next();
            if(ans.equals("N")){
                System.out.println("The dishes will be served soon.Please wait a moment,thank you!");
                break;
            }
        }


    }
    private void buy1() {
        double total = 0;
        System.out.println("order what you like");

        while (true) {
            System.out.println("Which group do you want to choose?(meat/fish/vegetable/snack/drinks/low fat/sweet/spicy/sour/salty)");
            String group=input.next();
            handleMenu.showMenu1(group);
            String name1 = input.next();
            double money = handleMenu.getCuisineByName1(name1);
            if (money != 0) {
                total += money;
                System.out.println("order successfully! Total money=" + total);
            } else {
                System.out.println("This cuisine does not exist");
            }
            System.out.println("do you want to continue?(Y/N)");
            String ans = input.next();
            if (ans.equals("N")) {
                System.out.println("The dishes will be served soon.Please wait a moment,thank you!");
                start();
            }
        }
    }



}




}
