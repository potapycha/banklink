package ee.bitweb.banklink.sdk.banks.swedbank;

import ee.bitweb.banklink.sdk.ConfigurationParameters;
import ee.bitweb.banklink.sdk.protocol.FieldDefinition;
import ee.bitweb.banklink.sdk.protocol.iPizza.Fields;
import ee.bitweb.banklink.sdk.Banklink;
import ee.bitweb.banklink.sdk.protocol.Protocol;

import java.util.Map;

/**
 * Created by tobre on 18/03/2017.
 */
public class Swedbank extends Banklink {

    private static final String BANKID = "HP";

    public Swedbank(Protocol protocol) {
        super(protocol);
        super.requestUri = "https://www.swedbank.ee/banklink";
        super.testRequestUri = this.getConfigurationParameters().getBaseTestUrl() + "/swedbank";
        super.fields = new Fields();
    }

    public Swedbank(Protocol protocol, String encoding, String language, String currency) {
        super(protocol, encoding, language, currency);
        super.requestUri = "https://www.swedbank.ee/banklink";
        super.testRequestUri = this.getConfigurationParameters().getBaseTestUrl() + "/swedbank";
        super.fields = new Fields();
    }

    public Swedbank(Protocol protocol, ConfigurationParameters configurationParameters) {
        super(protocol, configurationParameters);
        super.requestUri = "https://www.swedbank.ee/banklink";
        super.testRequestUri = configurationParameters.getBaseTestUrl() + "/swedbank";
        super.fields = new Fields();
    }

    @Override
    protected Map<FieldDefinition, String> prepareSpecialFields(Map<FieldDefinition, String> requestData) {
        return requestData;
    }

    @Override
    protected String getBankId() {
        return BANKID;
    }
}
