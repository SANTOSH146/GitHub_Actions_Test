# Java GitHub Actions Demo

A small Maven-based Java 17 project for testing a GitHub Actions CI pipeline.

## Run locally

Requirements: JDK 17 and Maven 3.8+.

```bash
mvn clean verify
```

Run the application:

```bash
mvn -q package
java -cp target/classes com.example.App
```

## GitHub Actions

The workflow at `.github/workflows/java-ci.yml` runs on:
- Pushes to `main`
- Pull requests targeting `main`
- Manual runs using **Actions → Java CI → Run workflow**

It checks out the repository, configures Java 17, runs Maven tests/build, and uploads the generated JAR as an artifact.

## Test the pipeline

1. Create a new GitHub repository.
2. Extract this project and push all files to the repository's `main` branch.
3. Open the **Actions** tab and select **Java CI**.
4. Check the job logs. After a successful run, download `java-demo-jar` from the run's **Artifacts** section.

To verify that test failures are detected, temporarily change an expected value in `AppTest.java`, push the change, and confirm that the workflow fails. Revert the test change afterward.
