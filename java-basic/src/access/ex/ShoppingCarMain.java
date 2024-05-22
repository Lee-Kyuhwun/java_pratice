package access.ex;

public class ShoppingCarMain {
    public static void main(String[] args) {
        ShoppingCart shoppingCar = new ShoppingCart();
        Item item1 = new Item("마늘", 2000, 2);
        Item item2 = new Item("상추", 3000, 4);
        shoppingCar.addItem(item1);
        shoppingCar.addItem(item2);
        shoppingCar.displayItems();
    }
}
