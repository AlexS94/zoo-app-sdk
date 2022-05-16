# Animal

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**species** | **String** |  | 
**name** | **String** |  |  [optional]
**age** | **Integer** |  |  [optional]
**gender** | [**GenderEnum**](#GenderEnum) |  | 
**enclosureId** | **Long** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  | 
**acquisitionType** | [**AcquisitionTypeEnum**](#AcquisitionTypeEnum) |  | 

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
