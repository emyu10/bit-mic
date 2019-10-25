# A simple ```interface``` example

``` java
interface NotificationInterface {
    public void setFrom(User user);
    public void setTo(User user);
    public void setTitle(String title);
    public void setBody(String body);
    public void setDate(Date date);
    
    public User getFrom();
    public User getTo();
    public String getTitle();
    public String getBody();
    public Date getDate();

    public void send();
}
```

``` java
class SmsNotification implements NotificationInterface {
    public void setFrom(User user) {

    }

    public void setTo(User user) {

    }
    public void setTitle(String title) {

    }

    public void setBody(String body) {

    }

    public void setDate(Date date) {

    }
    
    public User getFrom() {

    }

    public User getTo() {

    }

    public String getTitle() {
        
    }
    
    public String getBody() {

    }
    
    public Date getDate() {

    }

    public void send() {

    }
}
```

``` java
class EmailNotification implements NotificationInterface {
    public void setFrom(User user) {

    }

    public void setTo(User user) {

    }
    public void setTitle(String title) {

    }

    public void setBody(String body) {

    }

    public void setDate(Date date) {

    }
    
    public User getFrom() {

    }

    public User getTo() {

    }

    public String getTitle() {
        
    }
    
    public String getBody() {

    }
    
    public Date getDate() {

    }

    public void send() {

    }
}
```