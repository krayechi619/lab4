package labb4;

/**
 * 
 */

/**
 * @author douglatr
 *
 */import java.nio.file.Paths;
import java.util.Scanner;
import java.io.IOException;
import java.util.*;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.IOException;
import java.util.*;

public class OrderApplication {

	private ProductCatalogue Catalogue;

	public OrderApplication() {
		
	}
	
	public boolean createOrder(Order oRef) {
		
		boolean success = this.importCatalogue();
		
		
		if (success) {
			Iterator<Product> iterator = Catalogue.iterator();
			while (iterator.hasNext()) {
				Product product = iterator.next();
				oRef.addOrderItem(product, product.getQuantity());
			}
		}

		return success;
	}

	private boolean importCatalogue() {
		boolean success = true;
		Catalogue = new ProductCatalogue();
		Scanner in = null;

		try {
			in = new Scanner(Paths.get("C:\\Users\\macaliea\\Downloads\\Cars.csv"));

			in.nextLine();

			while (in.hasNextLine()) {
				String[] ProductData = in.nextLine().split(",");
				Catalogue.addProduct(ProductData[0], Double.parseDouble(ProductData[1]),
						Integer.parseInt(ProductData[2]), Integer.parseInt(ProductData[3]));
			}

			in.close();

		} catch (Exception IOException) {

			if (in != null)
				in.close();

			success = false;
		}

		return success;
	}
}
