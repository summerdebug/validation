# Spring Boot validation template

## Build
`mvnw clean install`

## Run
Run as Spring Boot application

## Test
Send POST-request to `http://localhost:8080/user/validate`
with header `Content-type: application/json`
and body:
```json
{
    "firstName":"Mike"
    "lastName":"Oliver",
    "email":"example@example.com"
}
```
In case firstName or lastName is empty or email is incorrect, an error message will be returned.