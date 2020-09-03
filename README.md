# Hystrix - Example

Example of `hystrix` with `feign` usage in [Spring Boot](https://projects.spring.io/spring-boot/)  

Used [Docker](https://www.docker.com/) to containerize environment.  


## Hello World Service
* It has only one functionality. It returns a string from an endpoint.

## Example Service
* It requests Hello World Service. If `hello world service` is unavailable/returns an error, it uses fallback (fixed, fake response from `hello world service`)
* It is configured with `requestVolumeThreshold: 5` and `sleepWindowInMilliseconds: 300000`. When 5 requests fails to `hello world service` it will use fallback for the next 5 minutes without making any request to hello world service.
* If it managed to request `hello world service`, this response is returned: `hello world from hello-world service`, if it uses the fallback: `hello world from example-service`

## How to run the environment?

### Before you start
* Make sure you have `Docker` and `docker-compose` installed.

[Docker CE INSTALLATION](https://docs.docker.com/install/linux/docker-ce/ubuntu/)  
[Docker Compose INSTALLATION](https://docs.docker.com/compose/install/#prerequisites)

### Start the environment
1. Build services:
    `docker-compose build`
2. Run services:
    `docker-compose up`
3. Stop the `hello world service` to test `hystrix`:
    `docker-compose stop hello-world-service`
4. Run `hello-world-service` again:
    `docker-compose up hello-world-service`

### Important endpoints:
* http://localhost:8080/test - Example service will request `hello-world-service` or use fallback and return a string.
