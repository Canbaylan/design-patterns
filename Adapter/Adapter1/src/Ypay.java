public interface Ypay {
    public String getCustCardNo();
    public String getCardOwnerName();
    public Double getTotalAmount();

    public void setCustCardNo(String custCardNo);
    public void setCardOwnerName(String cardOwnerName);
    public void setTotalAmount(Double totalAmount);
}
