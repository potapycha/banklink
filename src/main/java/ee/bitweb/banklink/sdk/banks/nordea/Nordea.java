package ee.bitweb.banklink.sdk.banks.nordea;

import ee.bitweb.banklink.sdk.Banklink;
import ee.bitweb.banklink.sdk.protocol.FieldDefinition;
import ee.bitweb.banklink.sdk.protocol.Protocol;

import java.util.Map;

public class Nordea extends Banklink {

    private static final String BANKID = "NORDEA";

    private static final String LUMINOR_PRODUCTION_URL = "https://banklink.luminor.ee";
    private static final String LUMINOR_TEST_URL = "https://banklink.luminor.ee/test";

    protected String authenticationRequestUri = LUMINOR_PRODUCTION_URL;
    protected String testAuthenticationRequestUri = LUMINOR_TEST_URL;

    public Nordea(Protocol protocol) {
        super(protocol);
        super.requestUri = LUMINOR_PRODUCTION_URL;
        super.testRequestUri = LUMINOR_TEST_URL;
        super.fields = new NordeaFields();
    }

    public Nordea(Protocol protocol, String encoding, String language, String currency) {
        super(protocol, encoding, language, currency);
        super.requestUri = LUMINOR_PRODUCTION_URL;
        super.testRequestUri = LUMINOR_TEST_URL;
        super.fields = new NordeaFields();
    }

    @Override
    protected Map<FieldDefinition, String> prepareSpecialFields(Map<FieldDefinition, String> requestData) {
        return requestData;
    }

    @Override
    protected String getBankId() {
        return BANKID;
    }

    public String getAuthencationRequestURI() {
        return !protocol.isTestMode() ? authenticationRequestUri : testAuthenticationRequestUri;
    }
}
