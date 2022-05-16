# AnimalDAO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**species** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**age** | **Integer** |  |  [optional]
**gender** | [**GenderEnum**](#GenderEnum) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**acquisitionType** | [**AcquisitionTypeEnum**](#AcquisitionTypeEnum) |  |  [optional]
**enclosureDAO** | [**EnclosureDAO**](EnclosureDAO.md) |  |  [optional]
**employee** | [**EmployeeDAO**](EmployeeDAO.md) |  |  [optional]

<a name="GenderEnum"></a>
## Enum: GenderEnum
Name | Value
---- | -----
MALE | &quot;MALE&quot;
FEMALE | &quot;FEMALE&quot;

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
SOLD | &quot;SOLD&quot;
DEAD | &quot;DEAD&quot;

<a name="AcquisitionTypeEnum"></a>
## Enum: AcquisitionTypeEnum
Name | Value
---- | -----
BOUGHT | &quot;BOUGHT&quot;
OFFSPRING | &quot;OFFSPRING&quot;
