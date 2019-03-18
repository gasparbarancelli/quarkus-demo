## Prerequisites
JDK 1.8+ installed with JAVA_HOME configured appropriately

GraalVM installed from the GraalVM web site. Using the community edition is enough. Version 1.0.0-rc12 is required.

The GRAALVM_HOME environment variable configured appropriately

Apache Maven 3.5.3+

A running Docker

## Running the application
mvn compile quarkus:dev

## Create a native executable using
mvn package -Pnative.

In addition to the regular files, the build also produces target/quarkus-quickstart-runner. You can run it using: ./target/quarkus-quickstart-runner.


## Producing a Docker container
mvn package -Pnative -Dnative-image.docker-build=true

docker build -f src/main/docker/Dockerfile -t quarkus-quickstart/quickstart .

docker run -i --rm -p 8080:8080 quarkus-quickstart/quickstart