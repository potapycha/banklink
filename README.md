# Banklink Java SDK

Java library for Banklinks. Supported is payment requests and authentications.

## Usage

```java
class Demo {
    public static void main(String[] args){
      Protocol protocol = new iPizzaProtocol(
          pem_formatted_public_key,
          pem_formatted_private_key,
          new Vendor(
              "uid42",
              "Test Test"
          )
      );
      
      protocol.setTestMode(true);
      Banklink seb = new Seb(protocol);
      PaymentRequest paymentRequest = seb.prepareRequest(new PaymentRequestParams("2", 0.01, "BitWeb test", "123", "http://requestb.in/18d2oau1", "http://requestb.in/18d2oau1"));
    }
}
    
```
... and response handling

```java
PaymentResponse response = (PaymentResponse) seb.handleResponse(post_request_params);
```