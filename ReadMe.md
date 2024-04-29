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
    "studentCapacity": 20,
    "coursesOffered": [
      "Btech",
      "Mtech"
    ],
    "createdOn": "2024-04-28T21:05:54.300998800",
    "contactEmail": "kaneWilliamson@gmail.com",
    "contactPhone": "9560374444",
    "address": {
      "addressId": 4,
      "city": "welligton",
      "state": "new zealand",
      "pincode": "110020",
      "detailedAddress": "HNO 17/t-9"
    },
    "centerName": "center-3",
    "centerCode": 1001
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
    "id": 1,
    "name": "Government Training Centre A",
    "address": "123 Main Street",
    "email": "trainingcentreA@gmail.com",
    "contactNumber": "1234567890"
  },
  {
    "id": 2,
    "name": "Government Training Centre B",
    "address": "456 Elm Street",
    "email": "trainingcentreB@gmail.com",
    "contactNumber": "9876543210"
  }
]
```

## Contributing

Contributions to the Government Training Centres project are welcome! If you find any bugs or have suggestions for improvements, please open an issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).

