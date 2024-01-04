# User API Spec

## Register User

Endpoint : POST /api/users

Request Body :
```json
{
    "username" : "alwiya",
    "password" : "123456",
    "name" : "Alwiya Pratiwi"
}
```
Respon Body (Success) :
```json
{
    "data" : "OK"
}
```

Respon Body (Failed) :
```json
{
    "errors" : "Username must not blank???"
}
```

## Login User

Endpoint : POST /api/auth/login

Request Body :
```json
{
    "username" : "alwiya",
    "password" : "123456"
}
```
Respon Body (Success) :
```json
{
    "data" : {
        "token" : "TOKEN",
        "expiredAt" : 37532532 // milisecond
    }
}
```

Respon Body (Failed, 401) :
```json
{
    "errors" : "Username or password wrong"
}
```

## Get User

Endpoint : GET /api/users/current

Request Header :

- X-API-TOKEN : Token (Mandatory)

Respon Body (Success) :
```json
{
    "data" : {
        "username" : "alwiya",
        "name" : "Alwiya Pratiwi" // milisecond
    }
}
```

Respon Body (Failed, 401) :
```json
{
    "errors" : "Unauthorized"
}
```

## Update User

Endpoint : PATCH /api/users/current

Request Header :

- X-API-TOKEN : Token (Mandatory)

Request Body :

```json
{
    "name" : "Alwiya Pratiwi", // put if only want to update name
    "password" : "new Password" // // put if only want to update password
}
```

Respon Body (Success) :

```json
{
    "data" : {
        "username" : "alwiya",
        "name" : "Alwiya Pratiwi" // milisecond
    }
}
```

Respon Body (Failed, 401) :
```json
{
    "errors" : "Unauthorized"
}
```

## Logout User

Endpoint : DELETE /api/auth/logout

Request Header :

- X-API-TOKEN : Token (Mandatory)

Respon Body (Success) :

```json
{
    "data" : "OK"
}
```