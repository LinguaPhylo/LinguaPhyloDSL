/*
 * generated by Xtext 2.25.0
 */
package lphy.dsl.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.xtext.validation.Check;

import lphy.dsl.linguaPhylo.Argument;
import lphy.dsl.linguaPhylo.InstantiatedDistribution;
import lphy.dsl.linguaPhylo.LPhyDist;
import lphy.dsl.linguaPhylo.LPhyModel;
import lphy.dsl.linguaPhylo.LinguaPhyloPackage;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class LinguaPhyloValidator extends AbstractLinguaPhyloValidator {
	
//	public static final String INVALID_NAME = "invalidName";
//
//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital",
//					LinguaPhyloPackage.Literals.GREETING__NAME,
//					INVALID_NAME);
//		}
//	}
	
	
	@Check
	public void checkInstantiatedDistribution(InstantiatedDistribution distribution) {
		
		var arguments = distribution.getArguments();
		
		var typeSpec = distribution.getTypeSpec();
		
		if (typeSpec instanceof LPhyDist) {
			LPhyDist lphyDist = (LPhyDist)typeSpec;
			
			LPhyModel model = lphyDist.getDistributionType();
				
			var parameters = model.getParameters();
			
			for (Argument argument : arguments) {
				if (!parameters.contains(argument.getName()) && !argument.getName().equals("replicates")) {
					error("LPhyModel " + model.getName() + " doesn't have a parameter named " + argument.getName(), argument, LinguaPhyloPackage.Literals.ARGUMENT__NAME);
				}
			}
			
			List<String> argumentNames = arguments.stream().map(x -> x.getName()).collect(Collectors.toList());
			
			for (String parameter : parameters) {
				if (!argumentNames.contains(parameter)) {
					error("LPhyModel " + model.getName() + " expecting a parameter named " + parameter, lphyDist, LinguaPhyloPackage.Literals.LPHY_DIST__DISTRIBUTION_TYPE);
	
				}
			}
		}
		
	}
	
}
