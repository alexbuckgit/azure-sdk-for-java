# Release History

## 1.0.0-beta.3 (Unreleased)

### Features Added

### Breaking Changes

### Bugs Fixed

### Other Changes

## 1.0.0-beta.2 (2023-01-17)

- Azure Resource Manager DataMigration client library for Java. This package contains Microsoft Azure SDK for DataMigration Management SDK. Data Migration Client. Package tag package-2018-04-19. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

* `models.AvailableServiceSkuAutoGenerated` was removed

* `models.NonSqlDataMigrationTable` was removed

* `models.DataMigrationResultCode` was removed

* `models.ErrorType` was removed

* `models.MigrationTableMetadata` was removed

* `models.DataMigrationError` was removed

* `models.DatabaseFileInput` was removed

#### `models.AvailableServiceSku` was modified

* `models.AvailableServiceSkuAutoGenerated sku()` -> `models.AvailableServiceSkuSku sku()`

#### `models.Services` was modified

* `delete(java.lang.String,java.lang.String,java.lang.Boolean)` was removed

### Features Added

* `models.AvailableServiceSkuSku` was added

#### `models.Project` was modified

* `resourceGroupName()` was added

#### `DataMigrationManager$Configurable` was modified

* `withScope(java.lang.String)` was added
* `withRetryOptions(com.azure.core.http.policy.RetryOptions)` was added

#### `models.ProjectTask` was modified

* `resourceGroupName()` was added

#### `models.DataMigrationService` was modified

* `resourceGroupName()` was added

#### `DataMigrationManager` was modified

* `authenticate(com.azure.core.http.HttpPipeline,com.azure.core.management.profile.AzureProfile)` was added

## 1.0.0-beta.1 (2021-04-14)

- Azure Resource Manager DataMigration client library for Java. This package contains Microsoft Azure SDK for DataMigration Management SDK. Data Migration Client. Package tag package-2018-04-19. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
