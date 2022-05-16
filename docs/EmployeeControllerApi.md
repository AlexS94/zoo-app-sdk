# EmployeeControllerApi

All URIs are relative to *https://webapp-zoo-webservice.azurewebsites.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteEmployee**](EmployeeControllerApi.md#deleteEmployee) | **DELETE** /employee/{id} | 
[**getEmployees**](EmployeeControllerApi.md#getEmployees) | **GET** /employees | 
[**insertEmployee**](EmployeeControllerApi.md#insertEmployee) | **POST** /employee | 
[**updateEmployee**](EmployeeControllerApi.md#updateEmployee) | **PUT** /employee | 

<a name="deleteEmployee"></a>
# **deleteEmployee**
> deleteEmployee(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EmployeeControllerApi;


EmployeeControllerApi apiInstance = new EmployeeControllerApi();
Long id = 789L; // Long | 
try {
    apiInstance.deleteEmployee(id);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeeControllerApi#deleteEmployee");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getEmployees"></a>
# **getEmployees**
> List&lt;Employee&gt; getEmployees()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EmployeeControllerApi;


EmployeeControllerApi apiInstance = new EmployeeControllerApi();
try {
    List<Employee> result = apiInstance.getEmployees();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeeControllerApi#getEmployees");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Employee&gt;**](Employee.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="insertEmployee"></a>
# **insertEmployee**
> Employee insertEmployee(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EmployeeControllerApi;


EmployeeControllerApi apiInstance = new EmployeeControllerApi();
Employee body = new Employee(); // Employee | 
try {
    Employee result = apiInstance.insertEmployee(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeeControllerApi#insertEmployee");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Employee**](Employee.md)|  |

### Return type

[**Employee**](Employee.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateEmployee"></a>
# **updateEmployee**
> Employee updateEmployee(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EmployeeControllerApi;


EmployeeControllerApi apiInstance = new EmployeeControllerApi();
Employee body = new Employee(); // Employee | 
try {
    Employee result = apiInstance.updateEmployee(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeeControllerApi#updateEmployee");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Employee**](Employee.md)|  |

### Return type

[**Employee**](Employee.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

