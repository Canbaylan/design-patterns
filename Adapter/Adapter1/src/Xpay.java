public interface Xpay {
    public String getCreditCardNo();
    public String getCustomerName();
    public Double getAmount();

    public void setCreditCardNo(String creditCardNo);
    public void setCustomerName(String customerName);
    public void setAmount(Double amount);
}
