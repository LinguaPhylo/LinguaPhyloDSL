# lphyDSL
An attempt to produce a compiler and interpreter for the LPhy language using Xtext

## Java 11

From the version 2.24, Xtext and Xtend will depend on Java 11.

https://www.eclipse.org/xtend/releasenotes.html#/releasenotes/2020/09/01/version-2-23-0

## Core files

- the grammar file [LPhy.xtext](https://github.com/LinguaPhylo/lphyDSL/blob/main/src/lphy/dsl/LPhy.xtext)
- the code generator workflow [GenerateLPhy.mwe2](https://github.com/LinguaPhylo/lphyDSL/blob/main/src/lphy/dsl/GenerateLPhy.mwe2)

## Links

- [Xtext 15 Minutes Tutorial](https://www.eclipse.org/Xtext/documentation/102_domainmodelwalkthrough.html)

- [Xtend](https://www.eclipse.org/xtend/)

## Eclipse Issues

- Do not click on the checkbox "Copy projects into workspace". Otherwise you will have this problem : 
[Eclipse Not Importing Projects](https://stackoverflow.com/questions/19666049/eclipse-not-importing-projects)
