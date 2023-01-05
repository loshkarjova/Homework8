import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("meat", 4, 200.0);
        Product product2 = new Product("vegetables", 4, 100.0);
        Product product3 = new Product("drinks", 3, 500.0);
        product1.setExpensive(isExpensiveCheck(product1));
        product2.setExpensive(isExpensiveCheck(product2));
        product3.setExpensive(isExpensiveCheck(product3));

        List<Product> newYearTableList = new ArrayList<>();
        newYearTableList.add(product1);
        newYearTableList.add(product2);
        newYearTableList.add(product3);


        System.out.println(findFirst(newYearTableList));
        System.out.println(newYearTableList);

    }

    public static Product findFirst(List<Product> list) {
        try {
            checkIsEmpty(list);
            Product product = list.get(0);
            System.out.println("Your New Year's table is not empty :)");
            return product;
        } catch (Exception e) {
            throw new RuntimeException("You will eat nothing!");
        }
    }

    public static void checkIsEmpty(List<Product> list) {
        Iterator<Product> itr = list.iterator();
        if (!itr.hasNext()){
            throw new RuntimeException();
        };
    }

    public static boolean isExpensiveCheck(Product product){
        if(product.getCommonPrice(product.getQuantity(), product.getPrice())>500){
            product.setExpensive(true);
        }
        return product.isExpensive();
    }
}
