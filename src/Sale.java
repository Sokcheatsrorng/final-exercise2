public class Sale {
    Customer customer = new Customer();
    String date;
    Double serviceExpense;
    Double productExpense;
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
        Double totalExpense = serviceExpense + productExpense;
        return totalExpense;
    }
    public void displayInfo(){
        System.out.println(customer.getCustomerName());
        System.out.println(customer.getCustomerType());
        System.out.println(date);
        System.out.println(serviceExpense);
        System.out.println(productExpense);
        System.out.println(getTotalExpense());
    }

}
