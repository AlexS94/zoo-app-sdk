/*
 * OpenAPI definition
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.Enclosure;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for EnclosureControllerApi
 */
@Ignore
public class EnclosureControllerApiTest {

    private final EnclosureControllerApi api = new EnclosureControllerApi();

    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteEnclosureTest() throws Exception {
        Long id = null;
        api.deleteEnclosure(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getEnclosuresTest() throws Exception {
        List<Enclosure> response = api.getEnclosures();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void insertEnclosureTest() throws Exception {
        Enclosure body = null;
        Enclosure response = api.insertEnclosure(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateEnclosureTest() throws Exception {
        Enclosure body = null;
        Enclosure response = api.updateEnclosure(body);

        // TODO: test validations
    }
}