package ee.bitweb.banklink.sdk;

public class ConfigurationParameters {
    private String baseTestUrl = "https://pangalink.bitweb.ee/banklink/";
    private String encoding;
    private String language;
    private String currency;

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getBaseTestUrl() {
        return baseTestUrl;
    }

    public void setBaseTestUrl(String baseTestUrl) {
        this.baseTestUrl = baseTestUrl;
    }
}
