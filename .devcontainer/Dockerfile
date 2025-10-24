# Dev Container for Spring Java + Groovy
FROM mcr.microsoft.com/devcontainers/java:21

# Install Groovy
RUN apt-get update && apt-get install -y groovy && rm -rf /var/lib/apt/lists/*

# Set the working directory
WORKDIR /workspace

# Copy Gradle wrapper files
COPY gradlew gradlew.bat /workspace/
COPY gradle /workspace/gradle

# Set Gradle wrapper executable permissions
RUN chmod +x gradlew