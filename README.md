# Surf

This is a mini project that aims to be the minimal project reproducing an issue I am facing in a
Kotlin Multiplatform project I am currently working on.

## Context
After creating a KMM project with both Android and iOS apps working without issues. I tried adding a
new target `jvm` to the project to implement a basic backend service.

I have seen this working in other projects such as https://github.com/joreilly/PeopleInSpace but
even if I think it must be right in front of me, I am not able to tell the difference with this one.

## Problem statement
The jvm target is not able to import the classes inside the common code, specifically in `commonMain`.
For some reason, classes inside the `androidMain` can be imported and used but not the ones in `commonMain`.
