package com.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "spring.xml"
                );

        ProductDao dao =
                context.getBean(
                        "dao",
                        ProductDao.class
                );

        ProductService service =
                context.getBean(
                        "service",
                        ProductService.class
                );

        System.out.println("Spring container started.");

        // ------------------------------------------------
        // 1. Insert one product
        // ------------------------------------------------

        /*
        Product product = new Product(
                101,
                "Laptop",
                55000,
                LocalDate.of(2026, 1, 10)
        );

        dao.insert(product);
        */

        // ------------------------------------------------
        // 2. Batch insert
        // ------------------------------------------------

        /*
        List<Product> products = new ArrayList<>();

        products.add(
                new Product(
                        108,
                        "Graphics Card",
                        25000,
                        LocalDate.of(2007, 11, 9)
                )
        );

        products.add(
                new Product(
                        109,
                        "SSD 1TB",
                        6500,
                        LocalDate.of(2021, 5, 18)
                )
        );

        products.add(
                new Product(
                        110,
                        "Gaming Monitor",
                        18500,
                        LocalDate.of(2022, 8, 12)
                )
        );

        products.add(
                new Product(
                        111,
                        "Webcam",
                        3200,
                        LocalDate.of(2023, 2, 25)
                )
        );

        products.add(
                new Product(
                        112,
                        "UPS",
                        5400,
                        LocalDate.of(2020, 10, 30)
                )
        );

        dao.batchInsert(products);
        */

        // ------------------------------------------------
        // 3. Named parameter insert
        // ------------------------------------------------

        /*
        Product product = new Product(
                113,
                "Mechanical Keyboard",
                4500,
                LocalDate.of(2026, 7, 30)
        );

        dao.insertNamedParameter(product);
        */

        // ------------------------------------------------
        // 4. Update complete product
        // ------------------------------------------------

        /*
        Product product = new Product(
                108,
                "RTX Graphics Card",
                30000,
                LocalDate.of(2025, 8, 10)
        );

        dao.update(product);
        */

        // ------------------------------------------------
        // 5. Update price
        // ------------------------------------------------

        /*
        dao.updatePrice(7000, 109);
        */

        // ------------------------------------------------
        // 6. Delete product
        // ------------------------------------------------

        /*
        dao.delete(112);
        */

        // ------------------------------------------------
        // 7. Get one product
        // ------------------------------------------------

        /*
        Product product =
                dao.getProductById(202);

        System.out.println(product);
        */

        // ------------------------------------------------
        // 8. BeanPropertyRowMapper
        // ------------------------------------------------

        /*
        Product product =
                dao.getProductUsingBeanMapper(202);

        System.out.println(product);
        */

        // ------------------------------------------------
        // 9. Display all products
        // ------------------------------------------------

        /*
        List<Product> products =
                dao.getAllProducts();

        products.forEach(System.out::println);
        */

        // ------------------------------------------------
        // 10. Display products above price
        // ------------------------------------------------

        /*
        List<Product> products =
                dao.getProductsAbovePrice(5000);

        products.forEach(System.out::println);
        */

        // ------------------------------------------------
        // 11. Total products
        // ------------------------------------------------

        /*
        System.out.println(
                "Total products: "
                + dao.getTotalProducts()
        );
        */

        // ------------------------------------------------
        // 12. Maximum price
        // ------------------------------------------------

        /*
        System.out.println(
                "Maximum price: "
                + dao.getMaximumPrice()
        );
        */

        // ------------------------------------------------
        // 13. Minimum price
        // ------------------------------------------------

        /*
        System.out.println(
                "Minimum price: "
                + dao.getMinimumPrice()
        );
        */

        // ------------------------------------------------
        // 14. Average price
        // ------------------------------------------------

        /*
        System.out.println(
                "Average price: "
                + dao.getAveragePrice()
        );
        */

        // ------------------------------------------------
        // 15. Search product
        // ------------------------------------------------

        /*
        List<Product> products =
                dao.searchByName("card");

        products.forEach(System.out::println);
        */

        // ------------------------------------------------
        // 16. Successful transaction
        // ------------------------------------------------

        service.updateTwoProducts();

        // ------------------------------------------------
        // 17. Rollback test
        // ------------------------------------------------

        /*
        try {
            service.testRollback();
        } catch (ArithmeticException exception) {
            System.out.println(
                    "Error occurred: "
                    + exception.getMessage()
            );

            System.out.println(
                    "Transaction rolled back."
            );
        }
        */

        System.out.println("Program completed.");

        context.close();
    }
}