# Nexus Messaging API

## Running code locally

1. Make sure you have java 11 and rabbit mq installed on your machine.
2. Complie the code using maven.
3. Run the code
4. Test API using Postman.

**There are two API's for Nexus Messaging:**

1. Messaging API
2. Bill API

## Messaging API

Message API is used to send and receive messages and for the approval of the payee.

```
POST https://localhost:8080/message/{Status}
```

example body is specified in message.json

example api call:

```
POST https://localhost:8080/message/PENDING
```

## Bill API

Bill API is used for sending the bill amount and due date to the payee. The reason why this is not part of the messaging API is because the bill API can also be used for basic R2P payments.

```
POST https://localhost:8080/bill/
```

example body is specified in bill.json
