# Mailer-man

A simple mail service using Spring Boot.
Deployed on heroku: https://mailer-man.herokuapp.com/

Steps to use:

1. Copy the link and paste it in API testing tools like Postman, Insomnia etc

2. In order to send simple mail which does not include attachments use: 
```bash
http://mailer-man.herokuapp.com/sendmail/simple
```
3. Goto Body then raw and then select type as JSON and type following json script:
```bash
{
    "toEmail":"email of reciever",
    "subject":"Test",
    "body":"Hello"
}
```
4. Ensure POST method is selected and then hit send button, after that Simple Mail send message should appear in terminal

5. In order to attachment mail use:
```bash
http://mailer-man.herokuapp.com/sendmail/advance
```
6. Select POST method and goto Body and select form-data and fill data as:
```bash
    toEmail - email of sender
    subject - subject
    body - body
    file - select file from menu
    
    Note*: for file before entering text file select type as file
```

7. Then hit Send button and message like Attachment mail send should appear
