# Circle-ci Template [![CircleCI](https://circleci.com/gh/Template-Generating/Java-Circle-CI/tree/change%2Fandroid.svg?style=svg)](https://circleci.com/gh/Template-Generating/Java-Circle-CI/tree/change%2Fandroid)

> **Current Circle-CI Version (2) NOT SUPPORT ANDROID APPLICATION**

This project is template java project, for using in Circle-CI v2

# What include?
1. `Pure Java Version` at branch `change/java`
2. `Maven Version` at branch `change/maven`
3. `Gradle Version` at branch `change/gradle`
4. `circle-ci` config at **.circleci** folder
5. Both `JUnit4` and `JUnit5` (except `pure java` will include **only** JUnit4)
6. `simple` code and simple `testcase`

# How to use
1. Sign up [Circle-CI](https://circleci.com/)
2. Add project that want to test in circle-ci
3. Just remove `old` ones and add `new` **code** and **test**
4. You result will happen at `https://circleci.com/dashboard`

# How to get...

## Status badges
1. go **Projects** tab (on left hand side)
2. choose User or Organization
3. click settings (gear) on your wanted project
4. on notification you will see `Status Badges` click on it
5. choose `branch`, `token`(you might require to create new one), `code syntax`
6. copy and parse whatever you want

## Test Summary
> Pure Java don't have this

When you come inside `build` page ![Picture1](resource/build-page.png)
The `Test Summary` will show result in shortest ways, BUT in *pure java* you need to look by yourself /or see at `Show Result` Tab
