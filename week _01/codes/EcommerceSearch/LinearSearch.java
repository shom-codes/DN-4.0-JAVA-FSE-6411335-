package EcommerceSearch;

public class LinearSearch {
    public static Product linSearch(Product[] pdts, int id){
        for (Product pdt : pdts) {
            if (pdt.productId == id) {
                return pdt;
            }
        }
        return null;
    }
}
