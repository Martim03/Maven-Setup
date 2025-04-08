# Maven-Setup
A simple repository to quickly setup a maven environment for java projects.

## Structure

### Documentation
A simple folder to include project documentation.

### Project-Name
**The project folder** divided into modules and integration tests. \
Open the pom files and change them where the comments explicitly say so, otherwise don't. \
\
In case you don't need any tests, feel free to remove all test associated folders and remove the dependecies in the pom files (as explicited in the comments). \
\
To add more modules to the project, you can simply copy paste the ModuleA folder and change the name and associated pom file.

## Commands
**Navigate into the project folder**
```
cd Project-Name
```

### Compilation
To compile and install all dependencies run:
```
mvn clean install
```

To compile the project simply run:
```
mvn clean compile
```

### Testing

To run all unit tests simply run:
```
mvn test
```

To run all integrety tests run:
```
mvn verify
```