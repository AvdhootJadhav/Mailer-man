# Mailer-man

A simple mail service using Spring Boot.

Steps to use (Github):
1. Fork the project from github repo 
```bash
https://github.com/AvdhootJadhav/Mailer-man
```
2. Open the project in your IDE and install all maven dependencies
3. Add your username and password in application.properties file and then run the project.
4. Project will be started on 
```bash
http://localhost:9001
```
5. Copy the link and paste it in API testing tools like Postman, Insomnia etc
6. In order to send simple mail which does not include attachments use: 
```bash
http://localhost:9001/sendmail/simple
```
7. Goto Body then raw and then select type as JSON and type following json script:
```bash
{
    "toEmail":"email of reciever",
    "subject":"Test",
    "body":"Hello"
}
```
8. Ensure POST method is selected and then hit send button, after that Simple Mail send message should appear in terminal
9. In order to attachment mail use:
```bash
http://localhost:9001/sendmail/advance
```
10. Select POST method and goto Body and select form-data and fill data as:
```bash
    toEmail - email of sender
    subject - subject
    body - body
    file - select file from menu
    
    Note*: for file before entering text file select type as file
```
11. Then hit Send button and message like Attachment mail send should appear

# Steps to follow (Docker):
1. Pull the image using the command
```bash
docker pull avdhootj/mailerman:0.0.1
```
2. Once image is downloaded, run the image using 
```bash
docker run -p 9001:9001 avdhootj/mailerman:0.0.1
```
3. Follow the same steps from Step 5 -> Github
