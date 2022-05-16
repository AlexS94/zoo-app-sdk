# SalesBoothControllerApi

All URIs are relative to *https://webapp-zoo-webservice.azurewebsites.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteSalesBooth**](SalesBoothControllerApi.md#deleteSalesBooth) | **DELETE** /salesBoth/{id} | 
[**getSalesBooths**](SalesBoothControllerApi.md#getSalesBooths) | **GET** /salesBoths | 
[**insertSalesBooth**](SalesBoothControllerApi.md#insertSalesBooth) | **POST** /salesBoth | 
[**updateSalesBooth**](SalesBoothControllerApi.md#updateSalesBooth) | **PUT** /salesBoth | 

<a name="deleteSalesBooth"></a>
# **deleteSalesBooth**
> deleteSalesBooth(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SalesBoothControllerApi;


SalesBoothControllerApi apiInstance = new SalesBoothControllerApi();
Long id = 789L; // Long | 
try {
    apiInstance.deleteSalesBooth(id);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesBoothControllerApi#deleteSalesBooth");
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

<a name="getSalesBooths"></a>
# **getSalesBooths**
> List&lt;SalesBooth&gt; getSalesBooths()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SalesBoothControllerApi;


SalesBoothControllerApi apiInstance = new SalesBoothControllerApi();
try {
    List<SalesBooth> result = apiInstance.getSalesBooths();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesBoothControllerApi#getSalesBooths");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;SalesBooth&gt;**](SalesBooth.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="insertSalesBooth"></a>
# **insertSalesBooth**
> SalesBooth insertSalesBooth(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SalesBoothControllerApi;


SalesBoothControllerApi apiInstance = new SalesBoothControllerApi();
SalesBooth body = new SalesBooth(); // SalesBooth | 
try {
    SalesBooth result = apiInstance.insertSalesBooth(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesBoothControllerApi#insertSalesBooth");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SalesBooth**](SalesBooth.md)|  |

### Return type

[**SalesBooth**](SalesBooth.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateSalesBooth"></a>
# **updateSalesBooth**
> SalesBooth updateSalesBooth(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SalesBoothControllerApi;


SalesBoothControllerApi apiInstance = new SalesBoothControllerApi();
SalesBooth body = new SalesBooth(); // SalesBooth | 
try {
    SalesBooth result = apiInstance.updateSalesBooth(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesBoothControllerApi#updateSalesBooth");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SalesBooth**](SalesBooth.md)|  |

### Return type

[**SalesBooth**](SalesBooth.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

