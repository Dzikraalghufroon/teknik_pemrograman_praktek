public class RestaurantMain {
public static void main(String[] args) {
    Restaurant menu = new Restaurant();
    menu.tambahMenuMakanan("Pizza", 250000, 20);
    Restaurant.nextId();
    menu.tambahMenuMakanan("Spaghetti", 80000, 20);
    Restaurant.nextId();
    menu.tambahMenuMakanan("Tenderloin Steak", 60000, 30);
    Restaurant.nextId();
    menu.tambahMenuMakanan("Chicken Steak", 45000, 30);
    menu.tampilMenuMakanan();

    menu.pesanMenuMakanan("Pizza", 10);
    menu.pesanMenuMakanan("gulai", 20);
    menu.pesanMenuMakanan("Pizza", 15);
    menu.pesanMenuMakanan("Spaghetti", -1);
    menu.pesanMenuMakanan("Spaghetti", 0);
    menu.tampilMenuMakanan();
}
}