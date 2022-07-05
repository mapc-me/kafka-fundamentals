import lombok.extern.slf4j.Slf4j;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Slf4j
public class DbRowsGeneratorTest {

    Faker faker = new Faker();

    private static final int PRODUCTS = 100;
    private static final int TRANSACTIONS = 1000;

    @Test
    public void generateProductTable() {

        List<String> rows = new ArrayList<>();

        for (int i = 0; i < PRODUCTS; i++) {
            String template = "('%s', '%s'),";
            rows.add(String.format(template, faker.stock().nsdqSymbol(), faker.finance().iban()));
            System.out.println(rows.get(i));
        }
    }

    @Test
    public void generateTransaction() {
        Random random = new Random();
        List<String> rows = new ArrayList<>();

        for (int i = 0; i < TRANSACTIONS; i++) {
            int productId = random.nextInt(PRODUCTS) + 1;
            String template = "(%s, '%s', %s),";
            rows.add(String.format(
                template,
                faker.number().numberBetween(100, 5000), faker.rockBand().name().replace('\'', ' '),
                productId
            ));
            System.out.println(rows.get(i));
        }
    }
}
