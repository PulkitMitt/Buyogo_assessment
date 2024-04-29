# Government Training Centres Project

Welcome to the Government Training Centres project! This Java Spring Boot application is designed to manage information about government training centres in a specific area. It provides APIs for adding new training centres to the database and fetching the list of all training centres stored in the database.

## Features

- **Add Training Centre API**: This API allows you to add a new government training centre to the database. It performs validation on attributes such as email and contact number to ensure data integrity.

- **Fetch Training Centres API**: Use this API to retrieve the list of all government training centres stored in the database. You can view all available training centres in the area through this endpoint.

## Getting Started

To get started with the Government Training Centres project, follow these steps:

1. **Clone the Repository**: Clone this repository to your local machine using the following command:

    ```bash
    git clone https://github.com/yourusername/government-training-centres.git
    ```

2. **Set up Database**: Ensure that you have a database set up to store the training centre information. You can configure the database connection details in the `application.properties` file.

3. **Build and Run**: Build the project using Maven and run the Spring Boot application:

    ```bash
    mvn clean install
    java -jar target/government-training-centres.jar
    ```

4. **Explore APIs**: Once the application is up and running, you can explore the available APIs using tools like Postman or curl.

## API Documentation

### Add Training Centre API

- **Endpoint**: `trainingCenter/signup`
- **Method**: POST
- **Request Body**: JSON object representing the training centre information, including attributes such as name, address, email, and contact number.

Example Request Body:
```json
{
  "studentCapacity": 15,
  "coursesOffered": [
    "BA", "MA", "BCA"
  ],
  "createdOn": "29-4-2024",
  "contactEmail": "joeroot66@gmail.com",
  "contactNumber": "9494741957",
  "address": {
    "addressId": 101,
    "city": "headingley",
    "state": "england",
    "pincode": "30001",
    "detailedAddress": "headingley, leeds, england"
  },
  "centerCode": 11,
  "centerName": "center-10"
}
```


### Fetch Training Centres API

- **Endpoint**: `training_centers`
- **Method**: GET
- **Response Body**: JSON array containing information about all training centres stored in the database.

Example Response:
```json
[
  {
    "studentCapacity": 15,
    "coursesOffered": [
      "BA",
      "MA",
      "BCA"
    ],
    "createdOn": "2024-04-29T23:11:34.160832400",
    "contactEmail": "joeroot66@gmail.com",
    "contactNumber": "9494741957",
    "address": {
      "addressId": 101,
      "city": "headingley",
      "state": "england",
      "pincode": "30001",
      "detailedAddress": "headingley, leeds, england"
    },
    "centerName": "center-10",
    "centerCode": 253
  }
]
```

## Contributing

Contributions to the Government Training Centres project are welcome! If you find any bugs or have suggestions for improvements, please open an issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).

