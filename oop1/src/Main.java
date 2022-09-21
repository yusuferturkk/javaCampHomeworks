public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setId(1);
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setImageUrl("images/img1.jpg");
        product1.setUnitsInStock(3);

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(6500);
        product2.setDiscount(8);
        product2.setImageUrl("images/img2.jpg");
        product2.setUnitsInStock(2);

        Product product3 = new Product();
        product3.setId(3);
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(4500);
        product3.setDiscount(9);
        product3.setImageUrl("images/img3.jpg");
        product3.setUnitsInStock(4);

        Product[] products = {product1,product2,product3};

        System.out.println("<ul>");
        for (Product product: products){
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");


        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("1241215125");
        individualCustomer.setPhone("0222 222 22 22");
        individualCustomer.setFirstName("Yusuf");
        individualCustomer.setLastName("Ertürk");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(1);
        corporateCustomer.setCustomerNumber("2513226243634");
        corporateCustomer.setPhone("0232 232 23 23");
        corporateCustomer.setCompanyName("CompanyName");
        corporateCustomer.setTaxNumber("12412412455");

        Customer[] customers = {individualCustomer, corporateCustomer};
        for (Customer customer: customers){
            System.out.println(customer.getPhone());
        }
    }
}