package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class ProductDao {

    private JdbcTemplate jdbcTemplate;

    private NamedParameterJdbcTemplate namedJdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void setNamedJdbcTemplate(
            NamedParameterJdbcTemplate namedJdbcTemplate) {

        this.namedJdbcTemplate = namedJdbcTemplate;
    }

    // ----------------------------------------------------
    // 1. Insert one product using JdbcTemplate
    // ----------------------------------------------------

    public void insert(Product product) {

        String sql = """
                INSERT INTO productdetails
                (id, name, price, mfgdt)
                VALUES (?, ?, ?, ?)
                """;

        int rows = jdbcTemplate.update(
                sql,
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getMfgDt()
        );

        System.out.println(rows + " product inserted.");
    }

    // ----------------------------------------------------
    // 2. Batch insert multiple products
    // ----------------------------------------------------

    public void batchInsert(List<Product> products) {

        String sql = """
                INSERT INTO productdetails
                (id, name, price, mfgdt)
                VALUES (?, ?, ?, ?)
                """;

        List<Object[]> batchArguments = new ArrayList<>();

        for (Product product : products) {

            Object[] row = {
                    product.getId(),
                    product.getName(),
                    product.getPrice(),
                    product.getMfgDt()
            };

            batchArguments.add(row);
        }

        int[] result =
                jdbcTemplate.batchUpdate(sql, batchArguments);

        System.out.println(
                result.length
                + " products inserted using batch insert."
        );
    }

    // ----------------------------------------------------
    // 3. Insert using NamedParameterJdbcTemplate
    // ----------------------------------------------------

    public void insertNamedParameter(Product product) {

        String sql = """
                INSERT INTO productdetails
                (id, name, price, mfgdt)
                VALUES (:id, :name, :price, :mfgdt)
                """;

        MapSqlParameterSource parameters =
                new MapSqlParameterSource();

        parameters.addValue("id", product.getId());
        parameters.addValue("name", product.getName());
        parameters.addValue("price", product.getPrice());
        parameters.addValue("mfgdt", product.getMfgDt());

        int rows =
                namedJdbcTemplate.update(sql, parameters);

        System.out.println(
                rows
                + " product inserted using named parameters."
        );
    }

    // ----------------------------------------------------
    // 4. Update complete product
    // ----------------------------------------------------

    public void update(Product product) {

        String sql = """
                UPDATE productdetails
                SET name = ?,
                    price = ?,
                    mfgdt = ?
                WHERE id = ?
                """;

        int rows = jdbcTemplate.update(
                sql,
                product.getName(),
                product.getPrice(),
                product.getMfgDt(),
                product.getId()
        );

        System.out.println(rows + " product updated.");
    }

    // ----------------------------------------------------
    // 5. Update only price
    // ----------------------------------------------------

    public void updatePrice(double price, int id) {

        String sql = """
                UPDATE productdetails
                SET price = ?
                WHERE id = ?
                """;

        int rows =
                jdbcTemplate.update(sql, price, id);

        System.out.println(
                rows
                + " product price updated for ID "
                + id
        );
    }

    // ----------------------------------------------------
    // 6. Delete product
    // ----------------------------------------------------

    public void delete(int id) {

        String sql = """
                DELETE FROM productdetails
                WHERE id = ?
                """;

        int rows =
                jdbcTemplate.update(sql, id);

        System.out.println(rows + " product deleted.");
    }

    // ----------------------------------------------------
    // 7. Get one product using lambda RowMapper
    // ----------------------------------------------------

    public Product getProductById(int id) {

        String sql = """
                SELECT id, name, price, mfgdt
                FROM productdetails
                WHERE id = ?
                """;

        return jdbcTemplate.queryForObject(
                sql,
                (rs, rowNum) -> new Product(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("price"),
                        rs.getDate("mfgdt").toLocalDate()
                ),
                id
        );
    }

    // ----------------------------------------------------
    // 8. Get one product using BeanPropertyRowMapper
    // ----------------------------------------------------

    public Product getProductUsingBeanMapper(int id) {

        String sql = """
                SELECT id, name, price, mfgdt
                FROM productdetails
                WHERE id = ?
                """;

        return jdbcTemplate.queryForObject(
                sql,
                new BeanPropertyRowMapper<>(Product.class),
                id
        );
    }

    // ----------------------------------------------------
    // 9. Get all products
    // ----------------------------------------------------

    public List<Product> getAllProducts() {

        String sql = """
                SELECT id, name, price, mfgdt
                FROM productdetails
                ORDER BY id
                """;

        return jdbcTemplate.query(
                sql,
                (rs, rowNum) -> new Product(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("price"),
                        rs.getDate("mfgdt").toLocalDate()
                )
        );
    }

    // ----------------------------------------------------
    // 10. Get products above a price
    // ----------------------------------------------------

    public List<Product> getProductsAbovePrice(double price) {

        String sql = """
                SELECT id, name, price, mfgdt
                FROM productdetails
                WHERE price > ?
                ORDER BY price
                """;

        return jdbcTemplate.query(
                sql,
                (rs, rowNum) -> new Product(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("price"),
                        rs.getDate("mfgdt").toLocalDate()
                ),
                price
        );
    }

    // ----------------------------------------------------
    // 11. Count products
    // ----------------------------------------------------

    public int getTotalProducts() {

        String sql =
                "SELECT COUNT(*) FROM productdetails";

        Integer total =
                jdbcTemplate.queryForObject(
                        sql,
                        Integer.class
                );

        return total == null ? 0 : total;
    }

    // ----------------------------------------------------
    // 12. Maximum price
    // ----------------------------------------------------

    public double getMaximumPrice() {

        String sql =
                "SELECT MAX(price) FROM productdetails";

        Double price =
                jdbcTemplate.queryForObject(
                        sql,
                        Double.class
                );

        return price == null ? 0 : price;
    }

    // ----------------------------------------------------
    // 13. Minimum price
    // ----------------------------------------------------

    public double getMinimumPrice() {

        String sql =
                "SELECT MIN(price) FROM productdetails";

        Double price =
                jdbcTemplate.queryForObject(
                        sql,
                        Double.class
                );

        return price == null ? 0 : price;
    }

    // ----------------------------------------------------
    // 14. Average price
    // ----------------------------------------------------

    public double getAveragePrice() {

        String sql =
                "SELECT AVG(price) FROM productdetails";

        Double price =
                jdbcTemplate.queryForObject(
                        sql,
                        Double.class
                );

        return price == null ? 0 : price;
    }

    // ----------------------------------------------------
    // 15. Search product by name
    // ----------------------------------------------------

    public List<Product> searchByName(String name) {

        String sql = """
                SELECT id, name, price, mfgdt
                FROM productdetails
                WHERE name LIKE ?
                ORDER BY name
                """;

        return jdbcTemplate.query(
                sql,
                (rs, rowNum) -> new Product(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("price"),
                        rs.getDate("mfgdt").toLocalDate()
                ),
                "%" + name + "%"
        );
    }
}