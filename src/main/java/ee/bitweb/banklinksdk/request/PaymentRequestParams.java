package ee.bitweb.banklinksdk.request;

/**
 * Created by tobre on 18/03/2017.
 */
public class PaymentRequestParams {

    protected Double amount;
    protected String message;
    protected String referenceNumber;
    protected String language;
    protected String currency;
    protected String encoding;
    protected String successUri;
    protected String cancelUri;

    public PaymentRequestParams(Double amount, String message, String referenceNumber) {
        this.amount = amount;
        this.message = message;
        this.referenceNumber = referenceNumber;
    }

    public PaymentRequestParams(Double amount, String message, String referenceNumber, String language, String currency) {
        this(amount, message, referenceNumber);
        this.language = language;
        this.currency = currency;
    }

    public PaymentRequestParams(Double amount, String message, String referenceNumber, String language, String currency, String successUri, String cancelUri) {
        this(amount, message, referenceNumber, language, currency);
        this.successUri = successUri;
        this.cancelUri = cancelUri;
    }

    public Double getAmount() {
        return amount;
    }

    public String getMessage() {
        return message;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public String getLanguage() {
        return language;
    }

    public String getCurrency() {
        return currency;
    }

    public String getEncoding() {
        return encoding;
    }

    public String getSuccessUri() {
        return successUri;
    }

    public String getCancelUri() {
        return cancelUri;
    }

    public void setIfNotDefinedLanguage(String language) {
        this.language = this.language == null ? language : this.language;
    }

    public void setIfNotDefinedEncoding(String encoding) {
        this.encoding = this.encoding == null ? encoding : this.encoding;
    }

    public void setIfNotDefinedCurrency(String currency) {
        this.currency = this.currency == null ? currency : this.currency;
    }
}
