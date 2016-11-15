package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class SmokeyProtocolDecoderTest extends ProtocolTest {

    @Test
    public void testDecode() throws Exception {

        SmokeyProtocolDecoder decoder = new SmokeyProtocolDecoder(new SmokeyProtocol());

        verifyAttributes(decoder, binary(
                "534D0300865628025161227F030100000000029E03020200A4021405028F0007010658300200028F0007010625F21D028F00070106000027028F00070106584E19028F000701065DCF2707537265696C6C69634E657400E8DE27400DF0A80084C9B2D85A1DB7537265696C6C69634E657400E8DE27401048D44350455F44423745393900A8A668DB7E99A94D794E6574776F726B4E616D6500002675ED6D70AB74686170616E6500002675F4DA3CA94D75666173610088CEFA735AFCA9C524"));

        verifyAttributes(decoder, binary(
                "534d0300865628025163272f031400000000001c000200000c0168028f000102c9f93a011f538d"));

        verifyAttributes(decoder, binary(
                "534d0300865628025163272f031400000000001f000200000c0167028f000102c9f93a011f5082"));

        verifyAttributes(decoder, binary(
                "534d0300865628025163272f031400000000001d000200000c0167028f000102c9f93a011f5282"));

        verifyAttributes(decoder, binary(
                "534d0300865628025163272f031400000000001e000200000c0167028f000102c9f93a011f5182"));

    }

}