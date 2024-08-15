# Camel Catalog Names

This README provides the steps to build and execute the project in both JVM and native modes. The instructions are intended for replicarium purposes.

## Building and Running the Project

### Build and Run (JVM)

1. **Build the project:**

   ```bash
   mvn clean package
   ```

2. **Execute the project:**

   ```bash
   java -jar target/quarkus-app/quarkus-run.jar
   ```

### Build and Run (Native)

1. **Build the project in native mode:**

   ```bash
   mvn clean package -Pnative
   ```

2. **Execute the native binary:**

   ```bash
   ./target/camel-quarkus-catalog-main-3.13.0-runner
   ```

## Notes

- Ensure all necessary dependencies and tools are installed before executing the commands.
- This guide is for the camel-quarkus support team replicarium purposes. Adjust paths and versions as necessary depending on your environment.