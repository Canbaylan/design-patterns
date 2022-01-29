public class XpayToYpayAdapter implements Ypay{
    private String custCardNo;
    private String cardOwnerName;
    private Double totalAmount;
    private Xpay xpay;
    public XpayToYpayAdapter(Xpay xpay){
        this.xpay = xpay;
        setProp();
    }


    private void setProp(){
        setCustCardNo(this.xpay.getCreditCardNo());
        setCardOwnerName(this.xpay.getCustomerName());
        setTotalAmount(this.xpay.getAmount());
    }
    //Getters and Setters
    @Override
    public String getCustCardNo() {
        return custCardNo;
    }

    @Override
    public String getCardOwnerName() {
        return cardOwnerName;
    }

    @Override
    public Double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public void setCustCardNo(String custCardNo) {
        this.custCardNo = custCardNo;
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        this.cardOwnerName = cardOwnerName;
    }

    @Override
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
