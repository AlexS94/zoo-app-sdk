# EmployeeDAO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**firstName** | **String** |  |  [optional]
**lastName** | **String** |  |  [optional]
**profession** | [**ProfessionEnum**](#ProfessionEnum) |  |  [optional]
**enclosureList** | [**List&lt;EnclosureDAO&gt;**](EnclosureDAO.md) |  |  [optional]
**animalList** | [**List&lt;AnimalDAO&gt;**](AnimalDAO.md) |  |  [optional]

<a name="ProfessionEnum"></a>
## Enum: ProfessionEnum
Name | Value
---- | -----
VETERINARIAN | &quot;VETERINARIAN&quot;
ZOOKEEPER | &quot;ZOOKEEPER&quot;
SELLER | &quot;SELLER&quot;
EMPLOYEE | &quot;EMPLOYEE&quot;
