# OAuth 2.0 Sample for Azure AD Spring Boot Starter client library for Java

## Key concepts
This sample illustrates how to use `azure-spring-boot-starter-active-directory` package to work with OAuth 2.0 and OpenID Connect protocols on Auzre. This sample will use Microsoft Graph API to retrieve user info. This is the key difference from [azure-spring-boot-sample-active-directory-backend](https://github.com/Azure/azure-sdk-for-java/blob/master/sdk/spring/azure-spring-boot-samples/azure-spring-boot-sample-active-directory-backend/README.md). It's reflected by these configurations in `appication.properties`:
```properties
azure.activedirectory.environment=global-v2-graph
azure.activedirectory.user-group.key=@odata.type
azure.activedirectory.user-group.value=#microsoft.graph.group
azure.activedirectory.user-group.object-id-key=id
```

## Getting started

### Environment checklist
We need to ensure that this [environment checklist][ready-to-run-checklist] is completed before the run.

### Register your application with your Azure Active Directory Tenant

Follow the guide [here](https://docs.microsoft.com/azure/active-directory/develop/quickstart-register-app).
### Platform configurations

![Platform configurations](docs/image-platform-configurations.png "Platform configurations")

- Set redirect URIs with `http://localhost:8080/login/oauth2/code/azure`.
- Ensure **Access tokens** and **ID tokens** are selected.
### Configure necessary API permissions
The sample retrieves user's group memberships using Microsoft graph API which requires the registered app to have `Directory.AccessAsUser.All` "Access the directory as the signed-in user" under `Delegated Permissions`. You need AAD admin privilege to be able to grant the permission in API ACCESS -> Required permission. You can follow the below steps:	

* In the list of pages for the app, select **API permissions**	
   - Click the **Add a permission** button and then,	
   - Ensure that the **Microsoft APIs** tab is selected	
   - In the *Commonly used Microsoft APIs* section, click on **Microsoft Graph**	
   - In the **Delegated permissions** section, ensure that the right permissions are checked: **Directory.AccessAsUser.All**	
   - Select the **Add permissions** button
   - Click **Grant Permissions...** and Yes when prompted.

### Configure groups for sign in user

In order to try the authorization action with this sample with minimum effort, [configure the user and groups in Azure Active Directory](https://docs.microsoft.com/azure/active-directory/active-directory-groups-create-azure-portal), configure the user with `group1`. 


## Examples

### Configure application.properties

```properties
azure.activedirectory.tenant-id=xxxxxx-your-tenant-id-xxxxxx
spring.security.oauth2.client.registration.azure.client-id=xxxxxx-your-client-id-xxxxxx
spring.security.oauth2.client.registration.azure.client-secret=xxxxxx-your-client-secret-xxxxxx
# It's suggested the logged in user should at least belong to one of the below groups
# If not, the logged in user will not be able to access any authorization controller rest APIs
azure.activedirectory.user-group.allowed-groups=group1, group2
```

### Run with Maven
```shell
cd azure-spring-boot-samples/azure-spring-boot-sample-active-directory-backend-v2
mvn spring-boot:run
```

### Check the authentication and authorization
	
1. Access http://localhost:8080
2. Login
3. Access `group1 Message` link, should success
4. Access `group2 Message` link, should fail with forbidden error message

## Troubleshooting

### If registered application is multi-tenanted, how to run this sample?
Set `azure.activedirectory.tenant-id=common` in your application.properties file:
```properties
azure.activedirectory.tenant-id=common
```
---
### Meet with `AADSTS240002: Input id_token cannot be used as 'urn:ietf:params:oauth:grant-type:jwt-bearer' grant` error.
In Azure portal, app registration manifest page, configure `oauth2AllowImplicitFlow` in your application manifest to `true`. See [this issue](https://github.com/MicrosoftDocs/azure-docs/issues/8121#issuecomment-387090099) for details on this workaround.

## Next steps
## Contributing
<!-- LINKS -->
[ready-to-run-checklist]: https://github.com/Azure/azure-sdk-for-java/blob/master/sdk/spring/azure-spring-boot-samples/README.md#ready-to-run-checklist