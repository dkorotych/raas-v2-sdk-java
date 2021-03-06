# Getting started

With this RESTful API you can integrate a global reward or incentive program into your app or platform. If you have any questions or if you'd like to receive your own credentials, please contact us at devsupport@tangocard.com.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| platformName | RaaS v2 API Platform Name |
| platformKey | RaaS v2 API Platform Key |



API client can be initialized as following.

```java
// Configuration parameters and credentials
String platformName = "QAPlatform2"; // RaaS v2 API Platform Name
String platformKey = "apYPfT6HNONpDRUj3CLGWYt7gvIHONpDRUYPfT6Hj"; // RaaS v2 API Platform Key

RaasClient client = new RaasClient(platformName, platformKey);
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [AccountsController](#accounts_controller)
* [OrdersController](#orders_controller)
* [CatalogController](#catalog_controller)
* [ExchangeRatesController](#exchange_rates_controller)
* [StatusController](#status_controller)
* [CustomersController](#customers_controller)

## <a name="accounts_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.tangocard.raas.controllers.AccountsController") AccountsController

### Get singleton instance

The singleton instance of the ``` AccountsController ``` class can be accessed from the API Client.

```java
AccountsController accounts = client.getAccounts();
```

### <a name="get_accounts_by_customer_async"></a>![Method: ](https://apidocs.io/img/method.png "com.tangocard.raas.controllers.AccountsController.getAccountsByCustomerAsync") getAccountsByCustomerAsync

> Gets a list of accounts for a given customer


```java
void getAccountsByCustomerAsync(
        final String customerIdentifier,
        final APICallBack<List<AccountSummaryModel>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerIdentifier |  ``` Required ```  | Customer Identifier |


#### Example Usage

```java
String customerIdentifier = "customerIdentifier";
// Invoking the API call with sample inputs
accounts.getAccountsByCustomerAsync(customerIdentifier, new APICallBack<List<AccountSummaryModel>>() {
    public void onSuccess(HttpContext context, List<AccountSummaryModel> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_account_async"></a>![Method: ](https://apidocs.io/img/method.png "com.tangocard.raas.controllers.AccountsController.getAccountAsync") getAccountAsync

> Get an account


```java
void getAccountAsync(
        final String accountIdentifier,
        final APICallBack<AccountModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountIdentifier |  ``` Required ```  | Account Identifier |


#### Example Usage

```java
String accountIdentifier = "accountIdentifier";
// Invoking the API call with sample inputs
accounts.getAccountAsync(accountIdentifier, new APICallBack<AccountModel>() {
    public void onSuccess(HttpContext context, AccountModel response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_account_async"></a>![Method: ](https://apidocs.io/img/method.png "com.tangocard.raas.controllers.AccountsController.createAccountAsync") createAccountAsync

> Create an account under a given customer


```java
void createAccountAsync(
        final String customerIdentifier,
        final CreateAccountRequestModel body,
        final APICallBack<AccountModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerIdentifier |  ``` Required ```  | Customer Identifier |
| body |  ``` Required ```  | Request Body |


#### Example Usage

```java
try {
    String customerIdentifier = "customerIdentifier";
    CreateAccountRequestModel body = new CreateAccountRequestModel();
    // Invoking the API call with sample inputs
    accounts.createAccountAsync(customerIdentifier, body, new APICallBack<AccountModel>() {
        public void onSuccess(HttpContext context, AccountModel response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_all_accounts_async"></a>![Method: ](https://apidocs.io/img/method.png "com.tangocard.raas.controllers.AccountsController.getAllAccountsAsync") getAllAccountsAsync

> Gets all accounts under the platform


```java
void getAllAccountsAsync(final APICallBack<List<AccountModel>> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
accounts.getAllAccountsAsync(new APICallBack<List<AccountModel>>() {
    public void onSuccess(HttpContext context, List<AccountModel> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="orders_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.tangocard.raas.controllers.OrdersController") OrdersController

### Get singleton instance

The singleton instance of the ``` OrdersController ``` class can be accessed from the API Client.

```java
OrdersController orders = client.getOrders();
```

### <a name="create_order_async"></a>![Method: ](https://apidocs.io/img/method.png "com.tangocard.raas.controllers.OrdersController.createOrderAsync") createOrderAsync

> TODO: Add a method description


```java
void createOrderAsync(
        final CreateOrderRequestModel body,
        final APICallBack<OrderModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    CreateOrderRequestModel body = new CreateOrderRequestModel();
    // Invoking the API call with sample inputs
    orders.createOrderAsync(body, new APICallBack<OrderModel>() {
        public void onSuccess(HttpContext context, OrderModel response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_order_async"></a>![Method: ](https://apidocs.io/img/method.png "com.tangocard.raas.controllers.OrdersController.getOrderAsync") getOrderAsync

> TODO: Add a method description


```java
void getOrderAsync(
        final String referenceOrderID,
        final APICallBack<OrderModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| referenceOrderID |  ``` Required ```  | Reference Order ID |


#### Example Usage

```java
String referenceOrderID = "referenceOrderID";
// Invoking the API call with sample inputs
orders.getOrderAsync(referenceOrderID, new APICallBack<OrderModel>() {
    public void onSuccess(HttpContext context, OrderModel response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_resend_order_async"></a>![Method: ](https://apidocs.io/img/method.png "com.tangocard.raas.controllers.OrdersController.createResendOrderAsync") createResendOrderAsync

> TODO: Add a method description


```java
void createResendOrderAsync(
        final String referenceOrderID,
        final APICallBack<ResendOrderResponseModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| referenceOrderID |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String referenceOrderID = "referenceOrderID";
// Invoking the API call with sample inputs
orders.createResendOrderAsync(referenceOrderID, new APICallBack<ResendOrderResponseModel>() {
    public void onSuccess(HttpContext context, ResendOrderResponseModel response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_orders_async"></a>![Method: ](https://apidocs.io/img/method.png "com.tangocard.raas.controllers.OrdersController.getOrdersAsync") getOrdersAsync

> TODO: Add a method description


```java
void getOrdersAsync(
        final GetOrdersInput input,
        final APICallBack<GetOrdersResponseModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountIdentifier |  ``` Optional ```  | TODO: Add a parameter description |
| customerIdentifier |  ``` Optional ```  | TODO: Add a parameter description |
| externalRefID |  ``` Optional ```  | TODO: Add a parameter description |
| startDate |  ``` Optional ```  | TODO: Add a parameter description |
| endDate |  ``` Optional ```  | TODO: Add a parameter description |
| elementsPerBlock |  ``` Optional ```  | TODO: Add a parameter description |
| page |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
GetOrdersInput collect = new GetOrdersInput();

String accountIdentifier = "accountIdentifier";
collect.setAccountIdentifier(accountIdentifier);

String customerIdentifier = "customerIdentifier";
collect.setCustomerIdentifier(customerIdentifier);

String externalRefID = "externalRefID";
collect.setExternalRefID(externalRefID);

Date startDate = new Date();
collect.setStartDate(startDate);

Date endDate = new Date();
collect.setEndDate(endDate);

Integer elementsPerBlock = 106;
collect.setElementsPerBlock(elementsPerBlock);

Integer page = 106;
collect.setPage(page);

// Invoking the API call with sample inputs
orders.getOrdersAsync(collect, new APICallBack<GetOrdersResponseModel>() {
    public void onSuccess(HttpContext context, GetOrdersResponseModel response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="catalog_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.tangocard.raas.controllers.CatalogController") CatalogController

### Get singleton instance

The singleton instance of the ``` CatalogController ``` class can be accessed from the API Client.

```java
CatalogController catalog = client.getCatalog();
```

### <a name="get_catalog_async"></a>![Method: ](https://apidocs.io/img/method.png "com.tangocard.raas.controllers.CatalogController.getCatalogAsync") getCatalogAsync

> Get Catalog


```java
void getCatalogAsync(final APICallBack<CatalogModel> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
catalog.getCatalogAsync(new APICallBack<CatalogModel>() {
    public void onSuccess(HttpContext context, CatalogModel response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="exchange_rates_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.tangocard.raas.controllers.ExchangeRatesController") ExchangeRatesController

### Get singleton instance

The singleton instance of the ``` ExchangeRatesController ``` class can be accessed from the API Client.

```java
ExchangeRatesController exchangeRates = client.getExchangeRates();
```

### <a name="get_exchange_rates_async"></a>![Method: ](https://apidocs.io/img/method.png "com.tangocard.raas.controllers.ExchangeRatesController.getExchangeRatesAsync") getExchangeRatesAsync

> Retrieve current exchange rates


```java
void getExchangeRatesAsync(final APICallBack<Object> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
exchangeRates.getExchangeRatesAsync(new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="status_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.tangocard.raas.controllers.StatusController") StatusController

### Get singleton instance

The singleton instance of the ``` StatusController ``` class can be accessed from the API Client.

```java
StatusController status = client.getStatus();
```

### <a name="get_system_status_async"></a>![Method: ](https://apidocs.io/img/method.png "com.tangocard.raas.controllers.StatusController.getSystemStatusAsync") getSystemStatusAsync

> *Tags:*  ``` Skips Authentication ``` 

> Retrieve system status


```java
void getSystemStatusAsync(final APICallBack<SystemStatusResponseModel> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
status.getSystemStatusAsync(new APICallBack<SystemStatusResponseModel>() {
    public void onSuccess(HttpContext context, SystemStatusResponseModel response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="customers_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.tangocard.raas.controllers.CustomersController") CustomersController

### Get singleton instance

The singleton instance of the ``` CustomersController ``` class can be accessed from the API Client.

```java
CustomersController customers = client.getCustomers();
```

### <a name="get_customer_async"></a>![Method: ](https://apidocs.io/img/method.png "com.tangocard.raas.controllers.CustomersController.getCustomerAsync") getCustomerAsync

> Get a customer


```java
void getCustomerAsync(
        final String customerIdentifier,
        final APICallBack<CustomerModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerIdentifier |  ``` Required ```  | Customer Identifier |


#### Example Usage

```java
String customerIdentifier = "customerIdentifier";
// Invoking the API call with sample inputs
customers.getCustomerAsync(customerIdentifier, new APICallBack<CustomerModel>() {
    public void onSuccess(HttpContext context, CustomerModel response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_customer_async"></a>![Method: ](https://apidocs.io/img/method.png "com.tangocard.raas.controllers.CustomersController.createCustomerAsync") createCustomerAsync

> Create a new customer


```java
void createCustomerAsync(
        final CreateCustomerRequestModel body,
        final APICallBack<CustomerModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | Request Body |


#### Example Usage

```java
try {
    CreateCustomerRequestModel body = new CreateCustomerRequestModel();
    // Invoking the API call with sample inputs
    customers.createCustomerAsync(body, new APICallBack<CustomerModel>() {
        public void onSuccess(HttpContext context, CustomerModel response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_all_customers_async"></a>![Method: ](https://apidocs.io/img/method.png "com.tangocard.raas.controllers.CustomersController.getAllCustomersAsync") getAllCustomersAsync

> Gets all customers under the platform


```java
void getAllCustomersAsync(final APICallBack<List<CustomerModel>> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
customers.getAllCustomersAsync(new APICallBack<List<CustomerModel>>() {
    public void onSuccess(HttpContext context, List<CustomerModel> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)



