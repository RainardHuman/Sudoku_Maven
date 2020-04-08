
### Build

In root of project run:

```
./mvnw clean compile assembly:single
```

### Run

Run the newly built jar:

```
java -jar ./target/Sudoku_Maven-*-jar-with-dependencies.jar 
```

_Note: wild card was used for version in above command._