public class Sale {
    public Customer customer = new Customer();
    public String date;
    public Double serviceExpense;
    public Double productExpense;
    Sale(Customer customer, String date){
        this.customer = customer;
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(Double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public Double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(Double productExpense) {
        this.productExpense = productExpense;
    }
    public double getTotalExpense(){
        double totalServiceExpense = serviceExpense - (serviceExpense * customer.getServiceMemberDiscount());
        double totalProductExpense = productExpense - (productExpense * customer.getProductMemberDiscount());
        return totalServiceExpense + totalProductExpense;
    }
    public void displayInfo(){
        System.out.println("-------------------------------------");
        System.out.println("|           SALE INFORMATION        |");
        System.out.println("-------------------------------------");
        System.out.println("Customer Name: " + customer.getCustomerName());
        System.out.println("Customer Type: " + customer.getCustomerType());
        System.out.println("Date: " + date);
        System.out.println("-------------------------------------");
        System.out.println("|           EXPENSE DETAILS         |");
        System.out.println("-------------------------------------");
        System.out.printf("Service Expense: $%.2f\n", serviceExpense, serviceExpense - (serviceExpense * customer.getServiceMemberDiscount()));
        System.out.printf("Product Expense: $%.2f\n", productExpense, productExpense - (productExpense * customer.getProductMemberDiscount()));
        System.out.println("-------------------------------------");
        System.out.println("|           TOTAL EXPENSE           |");
        System.out.println("-------------------------------------");
        System.out.printf("Total Service Expense: $%.2f\n", serviceExpense - (serviceExpense * customer.getServiceMemberDiscount()));
        System.out.printf("Total Product Expense: $%.2f\n", productExpense - (productExpense * customer.getProductMemberDiscount()));
        System.out.println("Total Expense: $" + getTotalExpense());



    }

}
