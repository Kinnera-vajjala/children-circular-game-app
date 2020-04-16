Instructions
-----------------
1) Please make sure that Java 8+ is set up before running the app .

2) Use "mvn test" to run the tests. Unit test cases are written for various combination of n and k values (n > k , n = k and n < k)

3) Use "mvn checkstyle:check pmd:check findbugs:check" to run static code analysis.
There will be no failures.

4) Use "mvn clean install" to do a build .

5) Use "mvn exec:java" to run the ChildrenCircularGame App on terminal or run the ChildrenCircularGame.main() directly from the IDE .
The input is read from the console.
The output will get displayed on the console and is also printed in the log file created (logs/children_circular_game_app.log) .
The test can be run multiple times by entering Y to continue when prompted at the end of first run .

Assumptions
--------------------------
1) The input data read from the console is not validated for all scenarios .
2) The ID of children in game starts with 0.


Design Considerations
--------------------------
1) The time complexity with the recursive list approach implemented here is O(n*k) .
   We go through the list recursively and remove the element which matches the criteria for count of k .
   I have implemented a model for InputData and 2 Util classes for this solution.
   One Util class to prompt and read the inputs from console and the second one to do the actual processing of logic for getting the ID of Winning Child.
2) The second solution to this problem can be implemented using circular linked list data structure.
   The time complexity in this case is also O(n*k) . This solution might perform better for the case when n is larger and k is smaller .
   This implementation consumes more memory compared to the first approach and hence went ahead with the first solution .

