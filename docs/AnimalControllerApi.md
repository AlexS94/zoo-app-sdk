# AnimalControllerApi

All URIs are relative to *https://webapp-zoo-webservice.azurewebsites.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAnimal**](AnimalControllerApi.md#deleteAnimal) | **DELETE** /animal/{id} | 
[**getAnimal**](AnimalControllerApi.md#getAnimal) | **GET** /animal/{id} | 
[**getAnimals**](AnimalControllerApi.md#getAnimals) | **GET** /animals | 
[**getAnimals1**](AnimalControllerApi.md#getAnimals1) | **GET** /animals/enclosure/{enclosureId} | 
[**insertAnimal**](AnimalControllerApi.md#insertAnimal) | **POST** /animal | 
[**updateAnimal**](AnimalControllerApi.md#updateAnimal) | **PUT** /animal | 

<a name="deleteAnimal"></a>
# **deleteAnimal**
> deleteAnimal(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AnimalControllerApi;


AnimalControllerApi apiInstance = new AnimalControllerApi();
Long id = 789L; // Long | 
try {
    apiInstance.deleteAnimal(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AnimalControllerApi#deleteAnimal");
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

<a name="getAnimal"></a>
# **getAnimal**
> Animal getAnimal(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AnimalControllerApi;


AnimalControllerApi apiInstance = new AnimalControllerApi();
Long id = 789L; // Long | 
try {
    Animal result = apiInstance.getAnimal(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnimalControllerApi#getAnimal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**Animal**](Animal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAnimals"></a>
# **getAnimals**
> List&lt;Animal&gt; getAnimals()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AnimalControllerApi;


AnimalControllerApi apiInstance = new AnimalControllerApi();
try {
    List<Animal> result = apiInstance.getAnimals();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnimalControllerApi#getAnimals");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Animal&gt;**](Animal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAnimals1"></a>
# **getAnimals1**
> List&lt;Animal&gt; getAnimals1(enclosureId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AnimalControllerApi;


AnimalControllerApi apiInstance = new AnimalControllerApi();
Long enclosureId = 789L; // Long | 
try {
    List<Animal> result = apiInstance.getAnimals1(enclosureId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnimalControllerApi#getAnimals1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enclosureId** | **Long**|  |

### Return type

[**List&lt;Animal&gt;**](Animal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="insertAnimal"></a>
# **insertAnimal**
> Animal insertAnimal(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AnimalControllerApi;


AnimalControllerApi apiInstance = new AnimalControllerApi();
Animal body = new Animal(); // Animal | 
try {
    Animal result = apiInstance.insertAnimal(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnimalControllerApi#insertAnimal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Animal**](Animal.md)|  |

### Return type

[**Animal**](Animal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateAnimal"></a>
# **updateAnimal**
> Animal updateAnimal(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AnimalControllerApi;


AnimalControllerApi apiInstance = new AnimalControllerApi();
Animal body = new Animal(); // Animal | 
try {
    Animal result = apiInstance.updateAnimal(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnimalControllerApi#updateAnimal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Animal**](Animal.md)|  |

### Return type

[**Animal**](Animal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

