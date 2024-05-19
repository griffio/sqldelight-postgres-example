# SqlDelight 2.1.x Postgresql migrations with Flyway 

https://github.com/cashapp/sqldelight

```shell
createdb sampledb &&
./gradlew build &&
./gradlew flywayMigrate &&
./gradlew run
```

## Flyway db migrations
https://documentation.red-gate.com/fd/gradle-task-184127407.html

## Other examples for SqlDelight

* Migrations https://github.com/griffio/sqldelight-postgres-01
* Json https://github.com/griffio/sqldelight-postgres-json
* Text Search https://github.com/griffio/sqldelight-postgres-textsearch
* Custom Dialect https://github.com/griffio/sqldelight-custom-dialect
