//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
      Customer customer = new Customer();
      customer.setCustomerName("Sokcheat");
      customer.setCustomerType("Premium");
      Sale sale = new Sale(customer, "2020-01-01");
      sale.setServiceExpense(100.0);
      sale.setProductExpense(100.0);
      sale.displayInfo();

    }
}