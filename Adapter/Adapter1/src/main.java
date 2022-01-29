public class main {
    public static void main(String[] args) {
        // Xpay object
        Xpay customerX = new XpayImp();
        customerX.setCustomerName("Can Baylan");
        customerX.setAmount(2424.24);
        customerX.setCreditCardNo("2424152502363224");

        // Ypay object
        Ypay customerY = new XpayToYpayAdapter(customerX);
        testYpay(customerY);

    }

    private static void testYpay(Ypay custY){
        System.out.println(custY.getCardOwnerName());
        System.out.println(custY.getCustCardNo());
        System.out.println(custY.getTotalAmount());
    }
}
