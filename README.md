# Circle-ci Template [![CircleCI](https://circleci.com/gh/OOP2017/Circle-ci-tester/tree/change%2Fgradle.svg?style=svg&circle-token=9734fe36021497616e3a8b6b71bb42d102a7b7c9)](https://circleci.com/gh/OOP2017/Circle-ci-tester/tree/change%2Fgradle)
This project is template project to create assignment for student 

# What include in this project
- `Gradle`
- `circle-ci` config at **.circleci** folder
  - using circle-ci version **2**
- Support both `JUnit4` and `JUnit5`
- `simple` code and simple `testcase`

# How to use
Just remove `old` one and add `new` code and test

# Need to Know
1. every test must in pattern `*Test.java` (* mean every thing)
2. source code must stay at `src/main/java/` **ONLY**
3. test code must stay at `src/test/java/` **ONLY**
4. You can use both `JUnit4` and `JUnit5`
5. You no need to install gradle in your computer since I already provide `gradle wrapper` ([learn more](https://docs.gradle.org/current/userguide/gradle_wrapper.html))
6. You *might* need to config something to push code inside IDE
