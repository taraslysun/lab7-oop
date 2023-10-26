package ua.edu.ucu.apps.lab71.flowers;

//here we willImplement different payment strategies with an interface Payment and several implementations of it CreditCardPaymentStrategy, PayPalPaymentStrategy. Use Strategy pattern.
//Implement several Delivery strategies: PostDeliveryStrategy, DHLDeliveryStrategy.

public interface Payment {
    public void pay(int amount);
}

class CreditCardPaymentStrategy implements Payment {
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardPaymentStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit card");
    }
}

class PayPalPaymentStrategy implements Payment {
    private String emailId;
    private String password;

    public PayPalPaymentStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal ");
    }
}

class PostDeliveryStrategy implements Payment {
    private String address;

    public PostDeliveryStrategy(String address) {
        this.address = address;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Post Delivery");
    }
}

class DHLDeliveryStrategy implements Payment {
    private String address;

    public DHLDeliveryStrategy(String address) {
        this.address = address;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using DHL Delivery");
    }
}

