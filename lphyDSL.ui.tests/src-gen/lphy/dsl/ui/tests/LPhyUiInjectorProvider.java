/*
 * generated by Xtext 2.25.0
 */
package lphy.dsl.ui.tests;

import com.google.inject.Injector;
import lphyDSL.ui.internal.LphyDSLActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class LPhyUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return LphyDSLActivator.getInstance().getInjector("lphy.dsl.LPhy");
	}

}
