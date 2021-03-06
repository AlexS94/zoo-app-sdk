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

import io.swagger.client.model.Employee;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for EmployeeControllerApi
 */
@Ignore
public class EmployeeControllerApiTest {

    private final EmployeeControllerApi api = new EmployeeControllerApi();

    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteEmployeeTest() throws Exception {
        Long id = null;
        api.deleteEmployee(id);

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
    public void getEmployeesTest() throws Exception {
        List<Employee> response = api.getEmployees();

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
    public void insertEmployeeTest() throws Exception {
        Employee body = null;
        Employee response = api.insertEmployee(body);

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
    public void updateEmployeeTest() throws Exception {
        Employee body = null;
        Employee response = api.updateEmployee(body);

        // TODO: test validations
    }
}
