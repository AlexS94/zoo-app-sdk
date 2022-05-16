# EnclosureControllerApi

All URIs are relative to *https://webapp-zoo-webservice.azurewebsites.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteEnclosure**](EnclosureControllerApi.md#deleteEnclosure) | **DELETE** /enclosure/{id} | 
[**getEnclosures**](EnclosureControllerApi.md#getEnclosures) | **GET** /enclosures | 
[**insertEnclosure**](EnclosureControllerApi.md#insertEnclosure) | **POST** /enclosure | 
[**updateEnclosure**](EnclosureControllerApi.md#updateEnclosure) | **PUT** /enclosure | 

<a name="deleteEnclosure"></a>
# **deleteEnclosure**
> deleteEnclosure(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EnclosureControllerApi;


EnclosureControllerApi apiInstance = new EnclosureControllerApi();
Long id = 789L; // Long | 
try {
    apiInstance.deleteEnclosure(id);
} catch (ApiException e) {
    System.err.println("Exception when calling EnclosureControllerApi#deleteEnclosure");
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

<a name="getEnclosures"></a>
# **getEnclosures**
> List&lt;Enclosure&gt; getEnclosures()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EnclosureControllerApi;


EnclosureControllerApi apiInstance = new EnclosureControllerApi();
try {
    List<Enclosure> result = apiInstance.getEnclosures();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnclosureControllerApi#getEnclosures");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Enclosure&gt;**](Enclosure.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="insertEnclosure"></a>
# **insertEnclosure**
> Enclosure insertEnclosure(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EnclosureControllerApi;


EnclosureControllerApi apiInstance = new EnclosureControllerApi();
Enclosure body = new Enclosure(); // Enclosure | 
try {
    Enclosure result = apiInstance.insertEnclosure(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnclosureControllerApi#insertEnclosure");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Enclosure**](Enclosure.md)|  |

### Return type

[**Enclosure**](Enclosure.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateEnclosure"></a>
# **updateEnclosure**
> Enclosure updateEnclosure(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EnclosureControllerApi;


EnclosureControllerApi apiInstance = new EnclosureControllerApi();
Enclosure body = new Enclosure(); // Enclosure | 
try {
    Enclosure result = apiInstance.updateEnclosure(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnclosureControllerApi#updateEnclosure");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Enclosure**](Enclosure.md)|  |

### Return type

[**Enclosure**](Enclosure.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

