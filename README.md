# Circle-ci Template [![CircleCI](https://circleci.com/gh/OOP2017/Circle-ci-tester/tree/change%2Fjava.svg?style=svg&circle-token=9734fe36021497616e3a8b6b71bb42d102a7b7c9)](https://circleci.com/gh/OOP2017/Circle-ci-tester/tree/change%2Fjava)
This project is template project to create assignment for student 

# What include in this project
- `circle-ci` config at **.circleci** folder
  - using circle-ci version **2**
- **Only** `JUnit4`
- `simple` code and simple `testcase`

# How to use
Just remove `old` one and add `new` **code** and **test**

# Need to Know
1. every test must in pattern `*Test` (* mean every thing)
2. You can use only `JUnit4`
3. You must have `SuiteTester` class to run all test-case

# How to config SuiteTester
1. You can set output that want to include exception by `ignoreException` variable

**Example** for `ignoreException=false`
```
    There were 2 failures:
    1) MainTest-failTest expected:<10> but was:<42>
        org.junit.Assert.failNotEquals(Assert.java:834)
        org.junit.Assert.assertEquals(Assert.java:645)
        org.junit.Assert.assertEquals(Assert.java:631)
        main.test.MainTest.failTest(MainTest.java:42)
    2) NewTest-main expected:<[asdf]> but was:<[fdsa]>
        org.junit.Assert.assertEquals(Assert.java:144)
        main.test.NewTest.main(NewTest.java:15)
```

**Example** for `ignoreException=true`
```
    There were 2 failures:
    1) MainTest-failTest expected:<10> but was:<42>
    2) NewTest-main expected:<[asdf]> but was:<[fdsa]>
```
2. You must add new test-case class to `core.run(class1, class2, ...);` saparate by `,`