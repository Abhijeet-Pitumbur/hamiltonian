# Shortest Hamiltonian Path

This algorithm randomly generates a complete graph with a given number of nodes in the range 1 to 10.

The shortest Hamiltonian path is highlighted.

When the Run button is clicked, the program:

- Generates a random number in the given inclusive range to use as the number of nodes.
- Generates that number of nodes, each node having random coordinates.
- Completes the graph by connecting every pair of distinct nodes with one unique edge.
- Finds the list of all Hamiltonian paths in the complete graph generated.
- Finds the shortest Hamiltonian path in that list.
- Displays the list and highlights the shortest Hamiltonian path on the graph.

![](https://github.com/Abhijeet-Pitumbur/hamiltonian/project/demo.gif)

##### [View PDF Report](https://drive.google.com/file/d/1rcyyaeUNcprn2rkH0SdynO8TEimtXJaa/view)  · Google Drive
##### [Download Repository](https://github.com/Abhijeet-Pitumbur/hamiltonian/archive/refs/heads/main.zip)  · GitHub

## IDE Configuration
- Download and install [IntelliJ IDE](https://www.jetbrains.com/idea/download/)
- Download [JavaFX SDK](https://gluonhq.com/products/javafx/)
- Download [JFoenix JAR](https://github.com/sshahine/JFoenix)
- Setup [JavaFX and JFoenix in IntelliJ IDE](https://www.youtube.com/results?search_query=JavaFX+and+JFoenix+in+IntelliJ)
- Use these VM options:
```
--add-exports
javafx.graphics/com.sun.javafx.scene=com.jfoenix
--add-exports
javafx.controls/com.sun.javafx.scene.control.behavior=com.jfoenix
--add-exports
javafx.controls/com.sun.javafx.scene.control=com.jfoenix
--add-exports
javafx.base/com.sun.javafx.binding=com.jfoenix
--add-exports
javafx.base/com.sun.javafx.event=com.jfoenix
--add-exports
javafx.graphics/com.sun.javafx.stage=com.jfoenix
--add-opens=java.base/java.lang.reflect=com.jfoenix
```

## Languages, Frameworks and Tools
- Java
- JavaFX
- JFoenix
- IntelliJ IDE
- Scene Builder

## Credits
- Abhijeet Pitumbur
- Azhar Mamodeally
- Deevesh Ramdawor
- Hiranyadaa Omrawoo
