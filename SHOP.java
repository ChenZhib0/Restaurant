public class SHOP {
        public static void main(String[] args) {
            Shop shop = new Shop();
            shop.displayShop();
        }
        public void displayShop() {
            System.out.println("欢迎来到我们的商店！");
            System.out.println("我们有以下商品：");
            System.out.println("1. 苹果");
            System.out.println("2. 香蕉");
            System.out.println("3. 橙子");
            System.out.println("4. 牛奶");
            System.out.println("5. 面包");
            System.out.println("请告诉我您想购买的商品编号：");
        }
        public void buyProduct(int productId) {
            switch (productId) {
                case 1:
                    System.out.println("您购买了苹果，感谢您的光临！");
                    break;
                case 2:
                    System.out.println("您购买了香蕉，感谢您的光临！");
                    break;
                case 3:
                    System.out.println("您购买了橙子，感谢您的光临！");
                    break;
                case 4:
                    System.out.println("您购买了牛奶，感谢您的光临！");
                    break;
                case 5:
                    System.out.println("您购买了面包，感谢您的光临！");
                    break;
                default:
                    System.out.println("抱歉，未找到对应的商品。");
                    break;

}
