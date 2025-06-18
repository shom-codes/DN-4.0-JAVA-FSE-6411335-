package EcommerceSearch;

public class BinarySearch {
    public static Product binSearch(Product[] pdts, int id) {
        int s=0;
        int e = pdts.length - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (pdts[mid].productId == id) {
                return pdts[mid];
            } else if (pdts[mid].productId < id) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return null;
    }
}
