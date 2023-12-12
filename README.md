# Java OAuth2 Jwt

- Front
  https://github.com/Azure-Samples/ms-identity-javascript-v2

/app/authConfig.js
```
clientId: "78cdc600-c99c-4db3-9556-3eb31a4c0c60",
authority: "https://login.microsoftonline.com/e7c91a18-425d-4820-aedf-09d9c1c63cd7",
redirectUri: "http://localhost:3000"
```

npm start

Get jwt - Application/Storage/Local Storage/

credentialType:"IdToken"
secret

- Validación
```sh
curl --location --request GET 'http://localhost:8080/api/usecase/path' \
--header 'Content-Type: application/json' \
--header 'Authorization: Bearer ...'
```