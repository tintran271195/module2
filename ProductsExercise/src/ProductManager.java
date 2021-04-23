import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Properties;

public class ProductManager {


    public static void main(String[] args) {
        Product p1 = new Product(1, "iPhone", 50);
        Product p2 = new Product(2, "SamSung", 30);
        Product p3 = new Product(3, "Xiaomi", 20);
        Product p4 = new Product(4, "QMobile", 10);

        ArrayList lists = new ArrayList();
        lists.add(p1);
        lists.add(p2);
        lists.add(p3);
        lists.add(p4);
        PriceComparator priceComparator = new PriceComparator();
        Collections.sort(lists, priceComparator);
        for (Object test : lists
        ) {
            System.out.println(test.toString());
        }
    }
}
