package ee.bitweb.banklink.sdk.banks.lhv;

import ee.bitweb.banklink.sdk.ConfigurationParameters;
import ee.bitweb.banklink.sdk.protocol.iPizza.Fields;
import ee.bitweb.banklink.sdk.Banklink;
import ee.bitweb.banklink.sdk.protocol.FieldDefinition;
import ee.bitweb.banklink.sdk.protocol.Protocol;

import java.util.Map;

public class Lhv extends Banklink {

    private static final String BANKID = "LHV";

    public Lhv(Protocol protocol) {
        super(protocol);
        super.requestUri = "https://www.lhv.ee/banklink";
        super.testRequestUri = this.getConfigurationParameters().getBaseTestUrl() + "/lhv";
        super.fields = new Fields();
    }

    public Lhv(Protocol protocol, String encoding, String language, String currency) {
        super(protocol, encoding, language, currency);
        super.requestUri = "https://www.lhv.ee/banklink";
        super.testRequestUri = this.getConfigurationParameters().getBaseTestUrl() + "/lhv";
        super.fields = new Fields();
    }

    public Lhv(Protocol protocol, ConfigurationParameters configurationParameters) {
        super(protocol, configurationParameters);
        super.requestUri = "https://www.lhv.ee/banklink";
        super.testRequestUri = configurationParameters.getBaseTestUrl() + "/lhv";
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
