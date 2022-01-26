# Online-Restaurant-Table-Booking-Web-Application

# Restaurant Table Booking Application

Restaurants are the most marched for business category on the internet and many restaurants now have a website. A well designed website will attract new customers to your restaurant, online reservations are increasing rapidly with so many consumers seeking out restaurants via the web, and a well-designed website for a restaurant needs a few key elements that a customer looking to book would want to see. So we are going to develop this system where a web application for the users, admin and restaurant that completes the package of restaurant & bookings. The user can browse through number of restaurants on the basis of cuisines and check for all their details, can book a table by comparing the food menus as well and other functionalities. The user can cancel and check his booking history. While the admin is responsible to add a restaurant and check the booking history or user list. The restaurant user can check all the booking and enter check in and check out status.


## Features

User

•	Registration: To access the system, user needs to register with his/her basic registration details.

•	Login: After successful registration, user can login using their valid username and password.

•	Profile: User profile details will be displayed& also can update their contact number.
Restaurant Page: Restaurant details will be displayed where user can select a date & time for booking.

•	View Tables: User will book from the available tables at the selected restaurant. *

•	Bookings: Here, user is shown current, previous and cancelled booking details.

•	Cancel Booking: User can cancel their booked tables whenever necessary.

•	Notification: The system will give a notification regarding the booking an hour prior to users booking. *



Admin:

•	Login: Admin needs to login into their account to access the below given modules.

•	View Booking: Admin can view all the booking details which is booked by the user.

•	Add Restaurant: Add new restaurant details such as id, name, contact no., select a point on map, cost for 2 persons, cuisine, etc.

•	View Restaurant: View all the added restaurants and even can delete them.

•	View Users: View all registered users.


Restaurant :

•	Login: Once the restaurant details are registered, a concern person of restaurant can login using their login credentials.

•	Add Menu: Add any number of menu.

•	View Booking: View booking of Restaurant can view its bookings.



## System Flow Diagram


## User

![alt text](https://github.com/apurba1603/Online-Restaurant-Table-Booking-Web-Application/blob/master/Images/User.png?raw=true)

## Admin

![alt text](https://github.com/apurba1603/Online-Restaurant-Table-Booking-Web-Application/blob/master/Images/Admin.png?raw=true)

## Restaurant

![alt text](https://github.com/apurba1603/Online-Restaurant-Table-Booking-Web-Application/blob/master/Images/Restaurant.png?raw=true)
## Database Structure



```
Restaurant
```

| restaurantId | restaurantName     | location | timings | status |
| :-------- | :------- | :---------- |:-------- | :------- |

```
User
```

| useName | password     | firstName | lastName | email | phoneNumber| status |
| :-------- | :------- | :---------- |:-------- | :------- |:-------- | :------- |



## ER Diagram


![alt text](https://github.com/apurba1603/Online-Restaurant-Table-Booking-Web-Application/blob/master/Images/ERD.jpg?raw=true)

## Data Flow Diagram

![alt text](https://github.com/apurba1603/Online-Restaurant-Table-Booking-Web-Application/blob/master/Images/DFD.jpg?raw=true)
