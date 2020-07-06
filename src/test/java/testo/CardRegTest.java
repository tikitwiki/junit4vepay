package testo;

import framework.AbstractTest;
import framework.IdentifierType;
import org.junit.jupiter.api.Test;

public class CardRegTest extends AbstractTest {

    @Override
    protected String getToken() {
        return "111222333444";
    }

    @Override
    protected String getIdentifier() {
        return "116";
    }

    @Override
    protected IdentifierType getIdentifierType() {
        return IdentifierType.MFO;
    }

    @Test
    public void testCardReg() throws Exception {
        CardRegRequest request = CardRegRequest.builder()
                .type(1L)
                .extid("UF-906/2187534.5e045b788e3v6")
                .timeout(10L)
                .successurl("https://test.vepay.online")
                .failurl("https://test.vepay.online")
                .cancelurl("https://test.vepay.online")
                .build();
        CardRegResponse response = this.submitRequest("https://test.vepay.online/mfo/card/reg", request, CardRegResponse.class);
        System.out.println("respo");
    }

    @Test
    public void card_get() throws Exception {
        Card_getRequest request = Card_getRequest.builder()
                .id(101270L)
                .type(1l)
                .build();
        Card_getResponce responce = this.submitRequest("https://test.vepay.online/mfo/card/get", request, Card_getResponce.class);
        System.out.println("respo");


    }

    @Test
    public void outpay() throws Exception {

        OutpaycardRequest request = OutpaycardRequest.builder()
                .card(414L)
                .cardnum("5289000072380463")
                .amount(100L)
                .extid("101270")
                .document_id("b68f4335-9147-454f-b58a-eae4644fc0f3")
                .fullname("test test")
                .build();
        OutpaycardResponce responce = this.submitRequest("https://test.vepay.online/mfo/out/paycard", request, OutpaycardResponce.class);
        System.out.println("respo");
    }
}
