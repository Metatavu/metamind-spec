# MetamindClient.ScriptsApi

All URIs are relative to *https://localhost/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createScript**](ScriptsApi.md#createScript) | **POST** /scripts | Posts new script


<a name="createScript"></a>
# **createScript**
> Script createScript(body)

Posts new script

Posts new script

### Example
```javascript
var MetamindClient = require('metamind-client');
var defaultClient = MetamindClient.ApiClient.instance;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new MetamindClient.ScriptsApi();

var body = new MetamindClient.Script(); // Script | Payload

apiInstance.createScript(body).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Script**](Script.md)| Payload | 

### Return type

[**Script**](Script.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

