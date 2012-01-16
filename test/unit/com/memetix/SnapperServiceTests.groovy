package com.memetix

import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(SnapperService)
class SnapperServiceTests {
    def myService = new SnapperService() 

    void testGenerateThumbnail() {
        String url = "http://google.com"
        assertEquals myService.generateThumbnail(url), url
    }
}
