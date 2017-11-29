--- 

title: OpenBanking API 

language_tabs: 
   - shell 

toc_footers: 
   - <a href='#'>Sign Up for a Developer Key</a> 
   - <a href='https://github.com/lavkumarv'>Documentation Powered by lav</a> 

includes: 
   - errors 

search: true 

--- 

# Introduction 

A collection of API for the OpenBanking Project 

**Version:** 1 

# /ACCESS/GETAUTHORIZATIONTOKEN
## ***GET*** 

**Summary:** getAuthorizationToken

### HTTP Request 
`***GET*** /access/getAuthorizationToken` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| clientId | body | Requires Client Identifier, Secret and Grant Type | No |  |
| clientSecret | query | clientSecret | No | string |
| grantType | query | grantType | No | string |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /ACCOUNT/BLOCKACCOUNT
## ***POST*** 

**Summary:** blockAccount

### HTTP Request 
`***POST*** /account/blockAccount` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| accountBlock | body | accountBlock | Yes |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 201 | Created |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /ACCOUNT/GETACCOUNT
## ***GET*** 

**Summary:** Finds an Account by Account Number

**Description:** Gives general Information about an Account Number

### HTTP Request 
`***GET*** /account/getAccount` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| accountNumber | body | The Account Number | No |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 400 | Invalid Account Number supplied |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Account Not Found |

# /ACCOUNT/GETACCOUNTBALANCE
## ***GET*** 

**Summary:** getAccountBalance

### HTTP Request 
`***GET*** /account/getAccountBalance` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| accountNumber | body | The Account Number and date | No |  |
| date | query | date | No | string |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /ACCOUNT/GETACCOUNTBYCUSTOMERBVN
## ***GET*** 

**Summary:** getAccountByCustomerBvn

### HTTP Request 
`***GET*** /account/getAccountByCustomerBvn` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| bvn | body | The Customer's BVN | No |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /ACCOUNT/GETACCOUNTBYCUSTOMERID
## ***GET*** 

**Summary:** getAccountByCustomerId

### HTTP Request 
`***GET*** /account/getAccountByCustomerId` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| customerId | body | The Customer ID as defined by Bank | No |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /ACCOUNT/GETACCOUNTBYEMAIL
## ***GET*** 

**Summary:** getAccountByEmail

### HTTP Request 
`***GET*** /account/getAccountByEmail` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| email | body | The Customer's Email Address | No |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /ACCOUNT/GETACCOUNTBYPHONE
## ***GET*** 

**Summary:** getAccountByPhone

### HTTP Request 
`***GET*** /account/getAccountByPhone` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| phone | body | The Customer's Phone Number Ex: +234 ... | No |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /ACCOUNT/GETACCOUNTTYPE
## ***GET*** 

**Summary:** getAccountType

### HTTP Request 
`***GET*** /account/getAccountType` 

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /ACCOUNT/OPENACCOUNT
## ***GET*** 

**Summary:** accountCreationRequest

### HTTP Request 
`***GET*** /account/accountCreationRequest` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| accountCreationRequest | body | accountCreationRequest | Yes |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /ACCOUNT/UPDATEACCOUNT
## ***POST*** 

**Summary:** updateAccount

### HTTP Request 
`***POST*** /account/updateAccount` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| accountNumber | body | The Customer's Phone Number Ex: +234 ... | No |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 201 | Created |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /AGENCY/GETAGENCIES
## ***GET*** 

**Summary:** getAgencies

### HTTP Request 
`***GET*** /agency/getAgencies` 

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /AGENCY/GETAGENCY
## ***GET*** 

**Summary:** Finds an Agency by Agency Code

**Description:** The Agency Code is the unique identifier for an Agency  as defined by a Bank or Agency Network

### HTTP Request 
`***GET*** /agency/getAgency` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| agencyId | body | The Agency's unique identifier | No |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 400 | Invalid Agency Code supplied |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Agency not found |

# /AGENCY/GETAGENCYSATLOCATION
## ***GET*** 

**Summary:** getAgenciesAtLocation

### HTTP Request 
`***GET*** /agency/getAgencysAtLocation` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| latitude | body | The Agency's longitude and latitude | No |  |
| longitude | query | longitude | No | integer |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /ATM/GETATM
## ***GET*** 

**Summary:** Finds an ATM by Terminal ID

**Description:** The ....

### HTTP Request 
`***GET*** /atm/getATM` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| atmTerminalId | body | The Atm unique identifier | No |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 400 | Invalid Terminal ID supplied |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | ATM not found |

# /ATM/GETATMS
## ***GET*** 

**Summary:** Get all ATMs in a Bank

**Description:** The ....

### HTTP Request 
`***GET*** /atm/getATMs` 

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 400 | Invalid Terminal ID supplied |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | ATM not found |

# /ATM/GETATMSBYBRANCH
## ***GET*** 

**Summary:** getAtmsByBranch

### HTTP Request 
`***GET*** /atm/getATMsByBranch` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| branchCode | body | The Bank's Branch code | No |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /ATM/GETATMSNEARLOCATION
## ***GET*** 

**Summary:** getatmsnearlocation

### HTTP Request 
`***GET*** /atm/getATMsNearLocation` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| latitude | body | The ATM's longitude and latitude | No |  |
| longitude | query | longitude | No | integer |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /BILLPAYMENT/GETBILLPAYMENTITEM
## ***GET*** 

**Summary:** getBillPaymentItem

### HTTP Request 
`***GET*** /billpayment/getBillPaymentItem` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| billerId | body | Biller ID  | No |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /BILLPAYMENT/GETBILLERCATEGORIES
## ***GET*** 

**Summary:** getBillerCategories

### HTTP Request 
`***GET*** /billpayment/getBillerCategories` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| billingSystemId | body | Billing System ID  | No |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /BILLPAYMENT/GETBILLERS
## ***GET*** 

**Summary:** getBillers

### HTTP Request 
`***GET*** /billpayment/getBillers` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| categoryId | body | Category ID  | No |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /BILLPAYMENT/GETBILLINGSYSTEM
## ***GET*** 

**Summary:** getBillingSystem

### HTTP Request 
`***GET*** /billpayment/getBillingSystem` 

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /BRANCH/GETBRANCH
## ***GET*** 

**Summary:** Finds a Bank Branch by Branch Code

**Description:** The Branch Code is the unique identifier for a bank  as defined by a Bank

### HTTP Request 
`***GET*** /branch/getBranch` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| branchId | body | The Branch's unique identifier | No |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 400 | Invalid Branch Code supplied |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Branch not found |

# /BRANCH/GETBRANCHES
## ***GET*** 

**Summary:** getBranches

### HTTP Request 
`***GET*** /branch/getBranches` 

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /BRANCH/GETBRANCHESATLOCATION
## ***GET*** 

**Summary:** getBranchesAtLocation

### HTTP Request 
`***GET*** /branch/getBranchesAtLocation` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| latitude | body | The Branch's longitude and latitude | No |  |
| longitude | query | longitude | No | integer |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /CARD/GETCARDLIMIT
## ***GET*** 

**Summary:** getCardLimit

### HTTP Request 
`***GET*** /card/getCardLimit` 

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /CARD/GETCARDPRODUCTBYBANK
## ***GET*** 

**Summary:** getBranches

### HTTP Request 
`***GET*** /card/getCardProductByBank` 

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /CARD/GETCARDS
## ***GET*** 

**Summary:** getCards

### HTTP Request 
`***GET*** /card/getCards` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| accountNumber | body | The Account Number tied to Card | No |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /CARD/REQUESTCARD
## ***GET*** 

**Summary:** requestCard

### HTTP Request 
`***GET*** /card/requestCard` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| cardToken | body | The Account Number tied to Card | No |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /CARD/SETCARDLIMIT
## ***POST*** 

**Summary:** setCardLimit

### HTTP Request 
`***POST*** /card/setCardLimit` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| setCardLimit | body | setCardLimit | Yes |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 201 | Created |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /CUSTOMER/BLOCK
## ***POST*** 

**Summary:** block

### HTTP Request 
`***POST*** /customer/block` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| customerId | query | customerId | No | string |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 201 | Created |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /CUSTOMER/GETBYBVN
## ***GET*** 

**Summary:** getByBVN

### HTTP Request 
`***GET*** /customer/getByBVN` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| bvn | body | The Customer's Bank Verification Number | No |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /CUSTOMER/GETBYCUSTOMERID
## ***GET*** 

**Summary:** Finds a Customer by Customer ID

**Description:** The Customer ID is the unique identifier for a customer as defined by a Bank

### HTTP Request 
`***GET*** /customer/getByCustomerId` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| customerId | body | The Customer's unique identifier | No |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 400 | Invalid Customer ID supplied |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Customer not found |

# /CUSTOMER/GETBYEMAIL
## ***GET*** 

**Summary:** getByEmail

### HTTP Request 
`***GET*** /customer/getByEmail` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| email | body | The Customer's Email Address | No |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /CUSTOMER/GETBYPHONENUMBER
## ***GET*** 

**Summary:** getByPhoneNumber

### HTTP Request 
`***GET*** /customer/getByPhoneNumber` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| phoneNumber | body | The Customer's Phone Number ex: +234 | No |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /CUSTOMER/UPDATE
## ***POST*** 

**Summary:** updateCustomerInformation

### HTTP Request 
`***POST*** /customer/update` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| customerUpdateRequest | body | customerUpdateRequest | Yes |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 201 | Created |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /DIRECT_DEBIT/CANCELDIRECTDEBIT
## ***GET*** 

**Summary:** cancelDirectDebit

### HTTP Request 
`***GET*** /direct_debit/cancelDirectDebit` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| referenceId | body | Reference ID and Cancelation Reason | No |  |
| cancelationReason | query | cancelationReason | No | string |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /DIRECT_DEBIT/GETDIRECTDEBIT
## ***GET*** 

**Summary:** getDirectDebit

### HTTP Request 
`***GET*** /direct_debit/getDirectDebit` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| referenceNumber | body | Reference Number and Account Number | No |  |
| accountNumber | query | accountNumber | No | string |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /DIRECT_DEBIT/SETUPDIRECTDEBIT
## ***POST*** 

**Summary:** setupDirectDebit

### HTTP Request 
`***POST*** /direct_debit/setupDirectDebit` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| directDebitSetup | body | directDebitSetup | Yes |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 201 | Created |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /GENERAL/GETBANKMETA
## ***GET*** 

**Summary:** getBankMeta

### HTTP Request 
`***GET*** /general/getBankMeta` 

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /GENERAL/GETCHARGES
## ***GET*** 

**Summary:** getCharges

### HTTP Request 
`***GET*** /general/getCharges` 

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /GENERAL/GETINTERFACEVERSION
## ***GET*** 

**Summary:** getInterfaceVersion

### HTTP Request 
`***GET*** /general/getInterfaceVersion` 

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /GENERAL/GETPRODUCTS
## ***GET*** 

**Summary:** getProducts

### HTTP Request 
`***GET*** /general/getProducts` 

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /INVESTMENT/BOOKINVESTMENT
## ***GET*** 

**Summary:** bookInvestment

### HTTP Request 
`***GET*** /investment/bookInvestment` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| investmentBookParameter | body | investmentBookParameter | Yes |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /INVESTMENT/GETINVESTMENT
## ***GET*** 

**Summary:** getInvestment

### HTTP Request 
`***GET*** /investment/getInvestment` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| accountNumberOrCustomerId | body | The Customer's Unique Identifier or Account Number | No |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /INVESTMENT/GETINVESTMENTPRODUCT
## ***GET*** 

**Summary:** getInvestmentProduct

### HTTP Request 
`***GET*** /investment/getInvestmentProduct` 

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /LIMIT/GETCUSTOMERTRANSACTIONLIMIT
## ***GET*** 

**Summary:** getCustomerTransactionLimit

### HTTP Request 
`***GET*** /limit/getCustomerTransactionLimit` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| accountNumber | body | The Customer's Account Number | No |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /LIMIT/GETGLOBALTRANSACTIONLIMIT
## ***GET*** 

**Summary:** getGlobalTransactionLimit

### HTTP Request 
`***GET*** /limit/getGlobalTransactionLimit` 

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /POS/GETPOSBYMERCHANTIDORBRANCHIDOREMAIL
## ***GET*** 

**Summary:** getPosByMerchantIdOrBranchIdOrEmail

### HTTP Request 
`***GET*** /pos/getPosByMerchantIdOrBranchIdOrEmail` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| merchantId | body | Merchant ID, Branch ID or Email  | No |  |
| branchId | query | branchId | No | string |
| email | query | email | No | string |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /POS/GETPOSBYTERMINALID
## ***GET*** 

**Summary:** Finds a POS by Terminal ID

**Description:** The Terminal ID is the unique identifier for a POS

### HTTP Request 
`***GET*** /pos/getPosByTerminalId` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| terminalId | body | The Terminal ID | No |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 400 | Invalid Terminal ID supplied |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | POS not found |

# /POS/GETPOSNEARLOCATION
## ***GET*** 

**Summary:** getPosNearLocation

### HTTP Request 
`***GET*** /pos/getPosNearLocation` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| latitude | body | Latitude and Longitude of POS  | No |  |
| longitude | query | longitude | No | integer |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /TRANSACTION/GETHOLD
## ***GET*** 

**Summary:** getHold

### HTTP Request 
`***GET*** /transaction/getHold` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| accountNumber | body | Account Number and Hold Reference ID | No |  |
| holdReferenceId | query | holdReferenceId | No | string |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /TRANSACTION/GETSTATEMENT
## ***GET*** 

**Summary:** getStatement

### HTTP Request 
`***GET*** /transaction/getStatement` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| getStatement | body | getStatement | Yes |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /TRANSACTION/MULTIPLETRANSFEROTHERBANK
## ***GET*** 

**Summary:** multipleTransferOtherBank

### HTTP Request 
`***GET*** /transaction/multipleTransferOtherBank` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| multipleTransferBank | body | multipleTransferBank | Yes |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /TRANSACTION/MULTIPLETRANSFERTOEMAIL
## ***GET*** 

**Summary:** multipleTransferToEmail

### HTTP Request 
`***GET*** /transaction/multipleTransferToEmail` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| multipleTransfer | body | multipleTransfer | Yes |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /TRANSACTION/MULTIPLETRANSFERTOPHONE
## ***GET*** 

**Summary:** multipleTransferToPhone

### HTTP Request 
`***GET*** /transaction/multipleTransferToPhone` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| multipleTransfer | body | multipleTransfer | Yes |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /TRANSACTION/MULTIPLETRANSFERWITHINBANK
## ***GET*** 

**Summary:** multipleTransferWithinBank

### HTTP Request 
`***GET*** /transaction/multipleTransferWithinBank` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| multipleTransferBank | body | multipleTransferBank | Yes |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /TRANSACTION/PLACEHOLD
## ***POST*** 

**Summary:** placeHold

### HTTP Request 
`***POST*** /transaction/placeHold` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| placeHold | body | placeHold | Yes |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 201 | Created |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /TRANSACTION/PLACEPND
## ***POST*** 

**Summary:** placePnd

### HTTP Request 
`***POST*** /transaction/placePnd` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| accountNumber | body | Account Number, Reference ID, Amount and Reason | No |  |
| pndReferenceId | query | pndReferenceId | No | string |
| amount | query | amount | No | string |
| reason | query | reason | No | string |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 201 | Created |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /TRANSACTION/REMOVEHOLD
## ***POST*** 

**Summary:** removeHold

### HTTP Request 
`***POST*** /transaction/removeHold` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| accountNumber | body | Account Number and Reference ID | No |  |
| holdReferenceId | query | holdReferenceId | No | string |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 201 | Created |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /TRANSACTION/SINGLETRANSFEROTHERBANK
## ***GET*** 

**Summary:** singleTransferOtherBank

### HTTP Request 
`***GET*** /transaction/singleTransferOtherBank` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| singleTransferBank | body | singleTransferBank | Yes |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /TRANSACTION/SINGLETRANSFERTOEMAIL
## ***GET*** 

**Summary:** singleTransferToEmail

### HTTP Request 
`***GET*** /transaction/singleTransferToEmail` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| singleTransfer | body | singleTransfer | Yes |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /TRANSACTION/SINGLETRANSFERTOPHONE
## ***GET*** 

**Summary:** singleTransferToPhone

### HTTP Request 
`***GET*** /transaction/singleTransferToPhone` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| singleTransfer | body | singleTransfer | Yes |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

# /TRANSACTION/SINGLETRANSFERWITHINBANK
## ***GET*** 

**Summary:** singleTransferWithinBank

### HTTP Request 
`***GET*** /transaction/singleTransferWithinBank` 

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| singleTransferBank | body | singleTransferBank | Yes |  |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |

<!-- Converted with the swagger-to-slate https://github.com/lavkumarv/swagger-to-slate -->
