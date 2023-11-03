import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎来到菜单示例！");
        while (true) {
            System.out.println("请选择一个操作：");
            System.out.println("1. 显示商品列表");
            System.out.println("2. 添加商品");
            System.out.println("3. 删除商品");
            System.out.println("4. 退出菜单");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    displayProducts();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    System.out.println("感谢您使用菜单示例！再见！");
                    System.exit(0);
                    break;
                default:
                    System.out.println("无效的选择，请重新输入。");
            }
        }
    }
    // 显示商品列表
    public static void displayProducts() {
        System.out.println("商品列表：");
        // 在此处添加展示商品的代码
    }
    // 添加商品
    public static void addProduct() {
        System.out.println("添加商品：");
        // 在此处添加添加商品的代码
    }
    // 删除商品
    public static void deleteProduct() {
        System.out.println("删除商品：");
        // 在此处添加删除商品的代码
    }
}

