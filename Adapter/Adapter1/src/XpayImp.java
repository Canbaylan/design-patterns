public class XpayImp implements Xpay{

    private String creditCardNo;
    private String customerName;
    private Double amount;

    //Getters and Setters
    @Override
    public String getCreditCardNo() {
        return creditCardNo;
    }

    @Override
    public String getCustomerName() {
        return customerName;
    }

    @Override
    public Double getAmount() {
        return amount;
    }

    @Override
    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    @Override
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void setAmount(Double amount) {
        this.amount= amount;
    }
}
