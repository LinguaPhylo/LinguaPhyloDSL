# linguaPhyloDSL
The core to produce a compiler and interpreter for the LPhy language using Xtext

## Java 11

From the version 2.24, Xtext and Xtend will depend on Java 11.

https://www.eclipse.org/xtend/releasenotes.html#/releasenotes/2020/09/01/version-2-23-0

## Sub-projects

1. [**lphyDSL**](https://github.com/LinguaPhylo/linguaPhyloDSL/tree/main/lphyDSL) 
   The core base of LPhy. 

2. **lphyDSL.ide**

3. **lphyDSL.ui**

## Import projects

`File => Import ... => General => Exsiting Projects into Workspace` 

## Generate LPhy artifacts

Right-click on the grammar file [LPhy.xtext](https://github.com/LinguaPhylo/lphyDSL/blob/main/src/lphy/dsl/LPhy.xtext) from either Project Explorer or Package Explorer, then `Run As => Generate Xtext Artifacts`.

## Run the generated Eclipse plug-in

Right-click on the project lphyDSL in the Package Explorer and select `Run As => Eclipse Application`. In the new Eclipse instance including LPhy, create a new project, e.g. `File => New => Project ... => Java Project`, and then create a new file with the file extension (*.lphy). 

The above text is modified from [Xtext 15 Minutes Tutorial](https://www.eclipse.org/Xtext/documentation/102_domainmodelwalkthrough.html)

## Eclipse Issues

- Do not click on the checkbox "Copy projects into workspace". Otherwise you will have this problem : 
[Eclipse Not Importing Projects](https://stackoverflow.com/questions/19666049/eclipse-not-importing-projects)

## Links

- [Xtext 15 Minutes Tutorial](https://www.eclipse.org/Xtext/documentation/102_domainmodelwalkthrough.html)

- [Xtend](https://www.eclipse.org/xtend/)

